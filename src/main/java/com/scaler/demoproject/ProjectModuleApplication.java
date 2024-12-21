package com.scaler.demoproject;

import com.scaler.demoproject.models.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectModuleApplication.class, args);

        Product product = new Product();
        product.setId(12L);
        System.out.println("Product \t" + product.getId());
    }
}
