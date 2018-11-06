package com.hoperun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication
{
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
	return new RestTemplate();
    }
    public static void main(String[] args)
    {
	System.out.println("==============RibbonConsumerApplication.run start===========");
	SpringApplication.run(RibbonConsumerApplication.class, args);
	System.out.println("==============RibbonConsumerApplication.run end=============");
    }
}
