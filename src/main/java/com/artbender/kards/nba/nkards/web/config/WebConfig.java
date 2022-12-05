package com.artbender.kards.nba.nkards.web.config;

import com.artbender.kards.nba.nkards.service.ServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.artbender.kards.nba.nkards.web")
@Import(value = ServiceConfig.class)
public class WebConfig {
}
