package com.hx.weed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@Component
public class WeedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeedApplication.class, args);
    }

}
