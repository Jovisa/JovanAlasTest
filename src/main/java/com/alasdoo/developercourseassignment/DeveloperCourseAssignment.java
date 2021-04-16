package com.alasdoo.developercourseassignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = "com.alasdoo")
@EnableJpaRepositories("com.alasdoo")
@SpringBootApplication
public class DeveloperCourseAssignment {

    public static void main(String[] args) {

        SpringApplication.run(DeveloperCourseAssignment.class, args);


    }

    /*@Bean
	public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurerAdapter() {
					@Override
					public void addCorsMappings(CorsRegistry registry) {
							registry.addMapping("/**");
					}
			};
	}*/
}
