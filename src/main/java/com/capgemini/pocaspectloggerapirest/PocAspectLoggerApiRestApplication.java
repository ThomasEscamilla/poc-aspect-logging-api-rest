package com.capgemini.pocaspectloggerapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class PocAspectLoggerApiRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PocAspectLoggerApiRestApplication.class, args);
    }

}
