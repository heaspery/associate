package ancay.ch.associate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class AssociateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AssociateApplication.class, args);
    }

}
