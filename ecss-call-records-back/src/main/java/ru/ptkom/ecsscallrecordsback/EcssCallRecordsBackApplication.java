package ru.ptkom.ecsscallrecordsback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfiguration
public class EcssCallRecordsBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcssCallRecordsBackApplication.class, args);
    }

}
