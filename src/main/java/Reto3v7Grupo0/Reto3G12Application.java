package Reto3v7Grupo0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto3v7Grupo0.Modelo"} )
public class Reto3G12Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3G12Application.class, args);
    }

}
