package net.players.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig 
{                       
    @Bean
    public Docket api() 
    { 
    	return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.players.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    
    private ApiInfo apiInfo() 
    {
        ApiInfo apiInfo = new ApiInfo(
                "player REST API",
                "player REST API Documentation",
                "1.0",
                "Terms of service",
                "rrraaa@libero.it",
                "GPL v2 Licence",
                "http://www.gnu.org/licenses/old-licenses/gpl-2.0.html");
        return apiInfo;
    }
}