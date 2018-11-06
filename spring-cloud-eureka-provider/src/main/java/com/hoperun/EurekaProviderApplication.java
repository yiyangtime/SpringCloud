package com.hoperun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderApplication
{
    public static void main(String[] args)
    {
	System.out.println("==============EurekaProviderApplication.run start===========");
	SpringApplication.run(EurekaProviderApplication.class, args);
	System.out.println("==============EurekaProviderApplication.run end=============");
    }
}
