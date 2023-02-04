package org.mydotey.galaxy.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

// swagger doc: /swagger-ui/index.html
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket swaggerOpenApi() {
        return new Docket(DocumentationType.OAS_30)
            .apiInfo(new ApiInfoBuilder().title("Galaxy Api").build())
            .select()
            .apis(RequestHandlerSelectors.basePackage("org.mydotey.galaxy.rest.controller"))
            .paths(PathSelectors.any())
            .build();
    }

}
