package com.munimjee.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.munimjee.dao.registration.ModuleDao;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.munimjee")
public class RestConfiguration {
	@Bean
	public ModuleDao getModuleDao()
	{
		return new ModuleDao();
	}
}
