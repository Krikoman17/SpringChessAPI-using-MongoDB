package com.example.chess_strategy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class AppConfig {
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*"); // Toto povoľuje prístup zo všetkých zdrojov, pre produkčné prostredie by ste mali nastaviť špecifickú doménu
        config.addAllowedMethod("*"); // Povolené metódy
        config.addAllowedHeader("*"); // Povolené hlavičky

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config); // Povoľuje CORS pre všetky cesty
        return new CorsFilter(source);
    }
}
