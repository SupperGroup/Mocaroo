package uz.pdp.mocaroo_v1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class MocarooV1Application {

    public static void main(String[] args) {
        SpringApplication.run(MocarooV1Application.class, args);
    }

}
