package com.example.demo.config.properties.janusgraph;

/**
 * This enum contains the possible configuration keys for JanusGraph which can be found at
 * {@see https://docs.janusgraph.org/v0.5/basics/configuration-reference/}
 */
public enum JanusGraphPropertiesEnum
{

    // Cache related
    CACHE_DB_CACHE("cache.db-cache"),
    CACHE_DB_CACHE_CLEAN_WAIT("cache.db-cache-clean-wait"),
    CACHE_DB_CACHE_SIZE("cache.db-cache-size"),
    CACHE_DB_CACHE_TIME("cache.db-cache-time"),
    CACHE_TX_CACHE_SIZE("cache.tx-cache-size"),
    CACHE_TX_DIRTY_SIZE("cache.tx-dirty-size"),

    // Graph related
    CLUSTER_MAX_PARTITIONS("cluster.max-partitions"),
    COMPUTER_RESULT_MODE("computer.result-mode"),
    GRAPH_ALLOW_STALE_CONFIG("graph.allow-stale-config"),
    GRAPH_ALLOW_UPGRADE("graph.allow-upgrade"),
    GRAPH_GRAPHNAME("graph.graphname"),
    GRAPH_REPLACE_INSTANCE_IF_EXISTS("grah.replace-instance-if-exists"),
    GRAPH_SET_VERTEX_ID("graph.set-vertex-id"),
    GRAPH_STORAGE_VERSION("graph.store-version"),
    GRAPH_TIMESTAMPS("graph.timestamps"),
    GRAPH_UNIQUE_INSTANCE_ID("graph.unique-instance-id"),
    GRAPH_UNIQUE_INSTANCE_ID_SUFFIX("graph.unique-instance-id-suffix"),
    GRAPH_USE_HOSTNAME_FOR_UNIQUE_INSTANCE_ID("graph.use-hostname-for-unique-instance-id"),
    GREMLIN_GRAPH("gremlin.graph"),

    // JanusGraph id allocation related
    IDS_BLOCK_SIZE("ids.block-size"),
    IDS_FLUSH("ids.flush"),
    IDS_NUM_PARTITIONS("ids.num-partitions"),
    IDS_PLACEMENT("ids.placement"),
    IDS_RENEW_PERCENTAGE("ids.renew-percentage"),
    IDS_RENEW_TIMEOUT("ids.renew-timeout"),
    IDS_STORE_NAME("ids.store-name"),
    IDS_AUTHORITY_CONFLICT_AVOIDANCE_MODE("ids.authority.conflict-avoidance-mode"),
    IDS_AUTHORITY_CONFLICT_AVOIDANCE_TAG("ids.authority.conflict-avoidance-tag"),
    IDS_AUTHORITY_CONFLICT_AVOIDANCE_TAG_BITS("ids.authority.conflict-avoidance-tag-bits"),
    IDS_AUTHORITY_RANDOMIZED_CONFLICT_AVOIDANCE_RETRIES("ids.authority.randomized_conflict_avoidance_retried"),
    IDS_AUTHORITY_WAIT_TIME("ids.authority.wait-time"),

    // Index / Search related
    // NOTE: JG allows for multiple `index.X.` backends to be configured.
    //       In our case, we probably won't need to add more than one.
    INDEX_ES_BACKEND("index.es.backend"), // i.e. elasticsearch
    INDEX_ES_CONF_FILE("index.es.conf-file"),
    INDEX_ES_DIRECTORY("index.es.directory"),
    INDEX_ES_HOSTNAME("index.es.hostname"), // i.e. localhost
    INDEX_ES_INDEX_NAME("index.es.index-name"),
    INDEX_ES_MAP_NAME("index.es.map-name"),
    INDEX_ES_MAX_RESULT_SET_SIZE("index.es.max-result-set-size"),
    INDEX_ES_PORT("index.es.port"),
    INDEX_ES_ELASTICSEARCH_BULK_REFRESH("index.es.elasticsearch.bulk-refresh"),
    INDEX_ES_ELASTICSEARCH_ENABLE_INDEX_NAMES_CACHE("index.es.elasticsearch.enable-index-names-cache"),
    INDEX_ES_ELASTICSEARCH_HEALTH_REQUEST_TIMEOUT("index.es.elasticsearch.health-request-timeout"),
    INDEX_ES_ELASTICSEARCH_INTERFACE("index.es.elasticsearch.interface"),
    INDEX_ES_ELASTICSEARCH_RETRY_ON_CONFLICT("index.es.elasticsearch.retry-on-conflict"),
    INDEX_ES_ELASTICSEARCH_SCROLL_KEEP_ALIVE("index.es.elasticsearch.scroll-keep-alive"),
    INDEX_ES_ELASTICSEARCH_SETUP_MAX_OPEN_SCROLL_CONTEXTS("index.es.elasticsearch.setup-max-open-scroll-contexts"),
    INDEX_ES_ELASTICSEARCH_USE_ALL_FIELD("index.es.elasticsearch.use-all-field"),
    INDEX_ES_ELASTICSEARCH_USE_MAPPING_FOR_ES7("index.es.elasticsearch.use-mapping-for-es7"),
    INDEX_ES_ELASTICSEARCH_CREATE_ALLOW_MAPPING_UPDATE("index.es.elasticsearch.create-allow-mapping-update"),
    INDEX_ES_ELASTICSEARCH_CREATE_SLEEP("index.es.elasticsearch.create-sleep"),
    INDEX_ES_ELASTICSEARCH_CREATE_USE_EXTERNAL_MAPPINGS("index.es.elasticsearch.create-use-external-mappings"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_TYPE("index.es.elasticsearch.http-auth-type"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_BASIC_PASSWORD("index.es.elasticsearch.http-auth-basic-password"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_BASIC_REALM("index.es.elasticsearch.http-auth-basic-realm"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_BASIC_USERNAME("index.es.elasticsearch.http-auth-basic-username"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_CUSTOM_AUTHENTICATOR_ARGS("index.es.elasticsearch.http-auth-custom-authenticator-args"),
    INDEX_ES_ELASTICSEARCH_HTTP_AUTH_CUSTOM_AUTHENTICATOR_CLASS("index.es.elasticsearch.http-auth-custom-authenticator-class"),
    INDEX_ES_ELASTICSEARCH_SSL_ALLOW_SELF_SIGNED_CERTIFICATES("index.es.elasticsearch.ssl-allow-self-signed-certificates"),
    INDEX_ES_ELASTICSEARCH_SSL_DISABLE_HOSTNAME_VERIFICATION("index.es.elasticsearch.ssl-disable-hostname-verification"),
    INDEX_ES_ELASTICSEARCH_SSL_ENABLED("index.es.elasticsearch.ssl-enabled"),
    INDEX_ES_ELASTICSEARCH_SSL_KEYSTORE_KEYPASSWORD("index.es.elasticsearch.ssl-keystore-keypassword"),
    INDEX_ES_ELASTICSEARCH_SSL_KEYSTORE_LOCATION("index.es.elasticsearch.ssl-keystore-location"),
    INDEX_ES_ELASTICSEARCH_SSL_KEYSTORE_STOREPASSWORD("index.es.elasticsearch.ssl-keystore-storepassword"),
    INDEX_ES_ELASTICSEARCH_SSL_TRUSTSTORE_LOCATION("index.es.elasticsearch.ssl-truststore-location"),
    INDEX_ES_ELASTICSEARCH_SSL_TRUSTSTORE_PASSWORD("index.es.elasticsearch.ssl-truststore-password"),

    // Log related
    LOG_STORAGE_BACKEND("log.storage.backend"),
    LOG_STORAGE_FIXED_PARTITION("log.storage.fixed-partition"),
    LOG_STORAGE_KEY_CONSISTENT("log.storage.key-consistent"),
    LOG_STORAGE_MAX_PARTITIONS("log.storage.max-partitions"),
    LOG_STORAGE_MAX_READ_TIME("log.storage.max-read-time"),
    LOG_STORAGE_MAX_WRITE_TIME("log.storage.max-write-time"),
    LOG_STORAGE_NUM_BUCKETS("log.storage.num-buckets"),
    LOG_STORAGE_READ_BATCH_SIZE("log.storage.read-batch-size"),
    LOG_STORAGE_READ_INTERVAL("log.storage.read-interval"),
    LOG_STORAGE_READ_LAG_TIME("log.storage.read-lag-time"),
    LOG_STORAGE_READ_THREADS("log.storage.read-threads"),
    LOG_STORAGE_SEND_BATCH_SIZE("log.storage.send-batch-size"),
    LOG_STORAGE_SEND_DELAY("log.storage.send-delay"),
    LOG_STORAGE_TTL("log.storage.ttl"),

    // Metrics related
    METRICS_ENABLED("metrics.enabled"),
    METRICS_JMX_ENABLED("metrics.jmx.enabled"),
    METRICS_MERGE_STORES("metrics.merge-stores"),
    METRICS_PREFIX("metrics.prefix"),

    // Query related
    QUERY_BATCH("query.batch"),
    QUERY_BATCH_PROPERTY_PREFETCH("query.batch-property-prefetch"),
    QUERY_FAST_PROPERTY("query.fast-property"),
    QUERY_FORCE_INDEX("query.force-index"),
    QUERY_IGNORE_UNKNOWN_INDEX_KEY("query.ignore-unknown-index-key"),
    QUERY_SMART_LIMIT("query.smart-limit"),

    // Schema related
    SCHEMA_CONSTRAINTS("schema.constraints"),
    SCHEMA_DEFAULT("schema.default"),

    // Storage related (generic)
    STORAGE_BACKEND("storage.backend"),
    STORAGE_BATCH_LOADING("storage.batch-loading"),
    STORAGE_BUFFER_SIZE("storage.buffer-size"),
    STORAGE_CONF_FILE("storage.conf-file"),
    STORAGE_CONNECTION_TIMEOUT("storage.connection-timeout"),
    STORAGE_DIRECTORY("storage.directory"),
    STORAGE_DROP_ON_CLEAR("storage.drop-on-clear"),
    STORAGE_HOSTNAME("storage.hostname"),
    STORAGE_PAGE_SIZE("storage.page-size"),
    STORAGE_PARALLEL_BACKEND_OPS("storage.parallel-backend-ops"),
    STORAGE_PASSWORD("storage.password"),
    STORAGE_PORT("storage.port"),
    STORAGE_READ_ONLY("storage.read-only"),
    STORAGE_READ_TIME("storage.read-time"),
    STORAGE_ROOT("storage.root"),
    STORAGE_SETUP_WAIT("storage.setup-wait"),
    STORAGE_TRANSACTIONS("storage.transactions"),
    STORAGE_USERNAME("storage.username"),
    STORAGE_WRITE_TIME("storage.write-time"),

    // Cassandra related

    // NOTE: storage.cassandra.* properties are obsolete which is why they are missing here.
    //       Use storage.cql properties instead!
    STORAGE_CQL_ATOMIC_BATCH_MUTATE("storage.cql.atomic-batch-mutate"),
    STORAGE_CQL_BATCH_STATEMENT_SIZE("storage.cql.batch-statement-size"),
    STORAGE_CQL_CLUSTER_NAME("storage.cql.cluster-name"),
    STORAGE_CQL_COMPACT_STORAGE("storage.cql.compact-storage"),
    STORAGE_CQL_COMPACTION_STRATEGY_CLASS("storage.cql.compaction-strategy-class"),
    STORAGE_CQL_COMPACTION_STRATEGY_OPTIONS("storage.cql.compaction-strategy-options"),
    STORAGE_CQL_COMPRESSION("storage.cql.compression"),
    STORAGE_CQL_COMPRESSION_BLOCK_SIZE("storage.cql.compression-block-size"),
    STORAGE_CQL_COMPRESSION_TYPE("storage.cql.compression-type"),
    STORAGE_CQL_KEYSPACE("storage.cql.keyspace"),
    STORAGE_CQL_LOCAL_CORE_CONNECTIONS_PER_HOST("storage.cql.local-core-connections-per-host"),
    STORAGE_CQL_LOCAL_DATACENTER("storage.cql.local-datacenter"),
    STORAGE_CQL_LOCAL_MAX_CONNECTIONS_PER_HOST("storage.cql.local-max-connections-per-host"),
    STORAGE_CQL_LOCAL_MAX_REQUESTS_PER_CONNECTION("storage.cql.lcal-max-requests-per-connection"),
    STORAGE_CQL_ONLY_USE_LOCAL_CONSISTENCY_FOR_SYSTEM_OPERATIONS("storage.cql.only-use-local-consistency-for-system-operations"),
    STORAGE_CQL_PROTOCOL_VERSION("storage.cql.protocol-version"),
    STORAGE_CQL_READ_CONSISTENCY_LEVEL("storage.cql.read-consistency-level"),
    STORAGE_CQL_REMOTE_CORE_CONNECTIONS_PER_HOST("storage.cql.remote-core-connections-per-host"),
    STORAGE_CQL_REMOTE_MAX_CONNECTIONS_PER_HOST("storage.cql.remote-max-connections-per-host"),
    STORAGE_CQL_REMOTE_MAX_REQUESTS_PER_CONNECTION("storage.cql.remote-max-requests-per-connection"),
    STORAGE_CQL_REPLICATION_FACTOR("storage.cql.replication-factor"),
    STORAGE_CQL_REPLICATION_STRATEGY_CLASS("storage.cql.replication-strategy-class"),
    STORAGE_CQL_REPLICATION_STRATEGY_OPTIONS("storage.cql.replication-strategy-options"),
    STORAGE_CQL_USE_EXTERNAL_LOCKING("storage.cql.use-external-locking"),
    STORAGE_CQL_WRITE_CONSISTENCY_LEVEL("storage.cql.write-consistency-level"),
    STORAGE_CQL_SSL_CLIENT_AUTHENTICATION_ENABLED("storage.cql.ssl.client-authentication-enabled"),
    STORAGE_CQL_SSL_ENABLED("storage.cql.ssl.enabled"),
    STORAGE_CQL_SSL_KEYSTORE_KEYPASSWORD("storage.cql.ssl.keystore.keypassword"),
    STORAGE_CQL_SSL_KEYSTORE_LOCATION("storage.cql.ssl.keystore.location"),
    STORAGE_CQL_SSL_KEYSTORE_STOREPASSWORD("storage.cql.ssl.keystore.storepassword"),
    STORAGE_CQL_SSL_TRUSTSTORE_LOCATION("storage.cql.ssl.keystore.location"),
    STORAGE_CQL_SSL_TRUSTSTORE_PASSWORD("storage.cql.ssl.keystore.password"),

    // Storage lock related
    STORAGE_LOCK_BACKEND("storage.lock.backend"),
    STORAGE_LOCK_CLEAN_EXPIRED("storage.lock.clean-expired"),
    STORAGE_LOCK_EXPIRY_TIME("storage.lock.expiry-time"),
    STORAGE_LOCK_LOCAL_MEDIATOR_GROUP("storage.lock.local-mediator-group"),
    STORAGE_LOCK_RETRIES("storage.lock.retries"),
    STORAGE_LOCK_WAIT_TIME("storage.lock.wait-time"),

    // Transaction log related
    TX_LOG_TX("tx.log-tx"),
    TX_MAX_COMMIT_TIME("tx.max-commit-time"),
    TX_RECOVERY_VERBOSE("tx.recovery-verbose");

    private final String key;

    JanusGraphPropertiesEnum(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return this.key;
    }

}
