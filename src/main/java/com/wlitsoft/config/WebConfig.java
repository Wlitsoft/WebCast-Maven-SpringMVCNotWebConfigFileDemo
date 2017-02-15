package com.wlitsoft.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by liliang on 2017/2/15.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wlitsoft")
public class WebConfig extends WebMvcConfigurerAdapter {

}
