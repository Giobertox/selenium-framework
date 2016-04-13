package com.giobertox.test.automation.sample.utils;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SeleniumFrameworkConfig {


	   @Bean
	   public WebDriver driver(){
	      return  Driver.getInstance();
	   }
	}