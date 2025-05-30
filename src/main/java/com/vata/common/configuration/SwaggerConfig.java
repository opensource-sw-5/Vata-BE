package com.vata.common.configuration;

import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi qrustGroupedOpenApi() {
        return GroupedOpenApi
                .builder()
                .group("opensource")
                .pathsToMatch("/**")
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("vata api")
                                .description("VATA API")
                                .version("1.0.0")
                        )
                )
                .build();
    }
}
