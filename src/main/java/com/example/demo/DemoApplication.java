package com.example.demo;

import com.example.demo.config.properties.YamlPropertySourceFactory;
import com.example.demo.config.properties.janusgraph.JanusGraphProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ConfigurationPropertiesScan({ "com.example.demo.config" })
@PropertySource(value = "classpath:etc/conf/db_${strongbox.db.profile:EMBEDDED}.yaml", factory = YamlPropertySourceFactory.class)
public class DemoApplication
{

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

        JanusGraphProperties janusGraphProperties = ctx.getBean(JanusGraphProperties.class);

        logger.info("STORAGE_BACKEND is {} ", janusGraphProperties.getStorageBackend());

        SpringApplication.exit(ctx, () -> 0);
    }

}
