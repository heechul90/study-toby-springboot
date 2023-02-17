package study.spring.springboot;

import org.springframework.boot.SpringApplication;
import study.spring.springboot.annotation.MySpringBootApplication;

@MySpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
