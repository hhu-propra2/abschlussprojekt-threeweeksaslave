package propra2.repositorys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SharingIsCaringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingIsCaringApplication.class, args);
    }
}