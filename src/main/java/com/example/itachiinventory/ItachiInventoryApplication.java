package com.example.itachiinventory;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.itachiinventory.mapper")
@EnableDistributedTransaction
public class ItachiInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItachiInventoryApplication.class, args);
    }

}
