package com.cheapshop.cheapshop;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CheapShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheapShopApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper()  {   return new ModelMapper();}
}
