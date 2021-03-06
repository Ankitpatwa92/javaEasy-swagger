package com.java.easy.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiger {

	@Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.javaEasy.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }
	
	/**
	 * 
	 * @return ApiInfo Object
	 */
	private ApiInfo apiInfo() {		
		return new ApiInfo("Java Easy", "Api for Employee","", "Term of Service", new springfox.documentation.service.Contact("Java Easy", "","JavaEasy"), "", "");		
	}
}