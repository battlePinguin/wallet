package com.javacode.demo_javacode.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Demo JavaCode API")
                .version("1.0")
                .description("API для демонстрации использования OpenAPI с добавлением данных"));
    }

}
