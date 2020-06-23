package com.example.demo.config.properties;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

/**
 * This class converts a yaml file into properties format so that values can be directly used via @Value("${property}").
 */
public class YamlPropertySourceFactory
        implements PropertySourceFactory
{

    @Override
    public PropertySource<?> createPropertySource(String name,
                                                  EncodedResource encodedResource)
            throws IOException
    {
        YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
        factory.setResources(encodedResource.getResource());
        factory.afterPropertiesSet();
        Properties properties = factory.getObject();
        return new PropertiesPropertySource(encodedResource.getResource().getFilename(), properties);
    }

}
