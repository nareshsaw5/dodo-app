package com.dodo.app.product.convertor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This is required to convert Json/Xml to our Pojo
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan( {"com.dodo.app"})
public class WebConfig implements WebMvcConfigurer {
}
