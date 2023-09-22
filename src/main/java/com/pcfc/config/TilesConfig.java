package com.pcfc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {
    @Value("${pcfc.tiles.path}")
    private String tilesPath;

    @Bean
    public ViewResolver viewResolver() {
        TilesViewResolver resolver = new TilesViewResolver();
        return resolver;
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{tilesPath});
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
}
