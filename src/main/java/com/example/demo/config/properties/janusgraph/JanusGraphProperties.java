package com.example.demo.config.properties.janusgraph;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import static com.example.demo.config.properties.janusgraph.JanusGraphPropertiesEnum.*;

@ConstructorBinding
@ConfigurationProperties(prefix = "strongbox.db")
public class JanusGraphProperties
{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Value("${strongbox.db.profile:EMBEDDED}")
    private String profile;

    /**
     * Contains the "raw" properties passed from the db.yaml configuration file.
     * JanusGraph's configuration uses a `key/value` approach for its properties where the key is a String and the
     * value is a primitive value such as String|String[]|Boolean|Int. It does not assume you will be using complex
     * property values.
     * <p>
     * The purpose of this being here is mainly for easier testing/experimenting.
     */
    private final Map<String, Object> properties;

    /**
     * Note: The name of the constructor arguments need to match the names in the yaml file or it will not work.
     *
     * @param janusgraph
     */
    public JanusGraphProperties(HashMap<String, Object> janusgraph)
    {
        this.properties = Collections.unmodifiableMap(flatten(janusgraph));
    }

    @PostConstruct
    public void postConstruct()
            throws IllegalAccessException, NoSuchFieldException
    {
        logger.info("Loaded janusgraph configuration using etc/config/db_{}.yaml", profile);

        printProperties(Arrays.asList(STORAGE_BACKEND,
                                      STORAGE_HOSTNAME,
                                      STORAGE_PORT,
                                      STORAGE_PASSWORD,
                                      IDS_BLOCK_SIZE,
                                      IDS_NUM_PARTITIONS,
                                      STORAGE_CQL_REPLICATION_FACTOR,
                                      STORAGE_CQL_READ_CONSISTENCY_LEVEL,
                                      STORAGE_CQL_WRITE_CONSISTENCY_LEVEL));
    }

    public String getStorageBackend()
    {
        return getProperty(STORAGE_BACKEND);
    }

    public String getStorageHostname()
    {
        return getProperty(STORAGE_HOSTNAME);
    }

    public int getStoragePort()
    {
        return getProperty(STORAGE_PORT);
    }

    public String getStorageUsername()
    {
        return getProperty(STORAGE_USERNAME);
    }

    public String getStoragePassword()
    {
        return getProperty(STORAGE_PASSWORD);
    }

    public boolean getStorageParallelBackendOps()
    {
        return getProperty(STORAGE_PARALLEL_BACKEND_OPS);
    }

    public String getStorageRoot()
    {
        return getProperty(STORAGE_ROOT);
    }

    public int getStorageLockWaitTime()
    {
        return getProperty(STORAGE_LOCK_WAIT_TIME);
    }

    public int getStorageLockRetries()
    {
        return getProperty(STORAGE_LOCK_RETRIES);
    }

    public int getCqlReadConsistencyLevel()
    {
        return getProperty(STORAGE_CQL_READ_CONSISTENCY_LEVEL);
    }

    public int getCqlWriteConsistencyLevel()
    {
        return getProperty(STORAGE_CQL_WRITE_CONSISTENCY_LEVEL);
    }

    public int getCqlReplicationFactor()
    {
        return getProperty(STORAGE_CQL_REPLICATION_FACTOR);
    }

    public boolean getMetricsEnabled()
    {
        return getProperty(METRICS_ENABLED);
    }

    public boolean getMetricsJmxEnabled()
    {
        return getProperty(METRICS_JMX_ENABLED);
    }

    public boolean getTxLogTx()
    {
        return getProperty(TX_LOG_TX);
    }

    /**
     * Since JG uses primitive types for the property's value, this should be relatively safe to use.
     *
     * @param property
     * @param <T>      should usually String|String[]|Boolean|Int|Float
     *
     * @return
     */
    public <T> T getProperty(String property)
    {
        return (T) properties.getOrDefault(property, null);
    }

    public <T> T getProperty(JanusGraphPropertiesEnum property)
    {
        return getProperty(property.getKey());
    }

    public Map<String, Object> getProperties()
    {
        return Collections.unmodifiableMap(properties);
    }

    public void printProperties(List<JanusGraphPropertiesEnum> enumProperties)
    {
        enumProperties.forEach(this::printProperty);
    }

    public void printProperty(JanusGraphPropertiesEnum enumProp)
    {
        Object value = getProperty(enumProp);

        if (enumProp.getKey().toLowerCase().contains("password"))
        {
            value = "[REDACTED]";
        }

        logger.info(" {}: {}", enumProp.getKey(), value);
    }

    /**
     * Flatten the received janusgraph map which contains recursive values.
     *
     * @param map
     *
     * @return
     */
    private Map<String, Object> flatten(Map<String, Object> map)
    {
        return map.entrySet()
                  .stream()
                  .flatMap(entry -> flatten(entry).entrySet().stream())
                  .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private Map<String, Object> flatten(Map.Entry<String, Object> map)
    {
        // for other then Map objects return them
        if (!(map.getValue() instanceof Map))
        {
            return Collections.singletonMap(map.getKey(), map.getValue());
        }
        // extract the key prefix for nested objects
        String prefix = map.getKey();
        Map<String, Object> values = (Map<String, Object>) map.getValue();
        // create a new Map, with prefix added to each key
        Map<String, Object> flattenMap = new HashMap<>();
        values.keySet().forEach(key -> {
            // use a dot as a joining char
            flattenMap.put(prefix + "." + key, values.get(key));
        });
        // use recursion to flatten the structure deeper
        return flatten(flattenMap);
    }

}
