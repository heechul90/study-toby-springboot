package study.spring.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import study.spring.config.MySpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@MySpringBootApplication
public class SpringbootApplication {

    @Autowired
    DataSource dataSource;
    @Bean
    ApplicationRunner applicationRunner(Environment env) throws SQLException {

        Connection connection = dataSource.getConnection();
        connection.close();


        return args -> {
            String name = env.getProperty("my.name");
            System.out.println("name = " + name);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}
