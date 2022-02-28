package com.bobocode.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * This class provides web (servlet) related configuration.
 * <p>
 * todo: mark this class as Spring config class     x?
 * todo: enable web mvc using annotation        x
 * todo: enable component scanning for package "web"        x
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.bobocode.web")
public class WebConfig {
}
