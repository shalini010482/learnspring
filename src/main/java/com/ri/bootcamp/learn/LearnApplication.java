package com.ri.bootcamp.learn;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication // spring search this word(annotation) and execuTE this

@ComponentScan(basePackages = { "com.ri.bootcamp.*" })
@EnableJpaRepositories("com.ri.bootcamp.*")
@EntityScan("com.ri.bootcamp.*")
@EnableSwagger2
@Transactional
@EnableAutoConfiguration
public class LearnApplication {
	public static void main(String[] args) {// first file
		SpringApplication.run(LearnApplication.class, args);
	}
}
