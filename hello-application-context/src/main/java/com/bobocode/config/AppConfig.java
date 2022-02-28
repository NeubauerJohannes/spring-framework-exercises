package com.bobocode.config;

import com.bobocode.TestDataGenerator;
import com.bobocode.dao.AccountDao;
import com.bobocode.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * This class application context configuration.
 * <p>
 * todo: make this class a Spring configuration class       x
 * todo: enable component scanning for dao and service packages     x
 * todo: provide explicit configuration for a bean of type {@link TestDataGenerator} with name "dataGenerator" in this class.       x
 * todo: Don't specify bean name "dataGenerator" explicitly     x
 */

@Configuration
@ComponentScan(basePackages = {"com.bobocode.dao", "com.bobocode.service"})
public class AppConfig {

    @Bean
    public TestDataGenerator dataGenerator(){
        TestDataGenerator testDataGenerator = new TestDataGenerator();
        return testDataGenerator;
    }






}
