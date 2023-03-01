package study.spring.springboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import study.spring.config.SpringbootApiTest;

import static org.assertj.core.api.Assertions.*;

@SpringbootApiTest
public class HelloRepositoryTest {

    @Autowired HelloRepository helloRepository;
    @Autowired JdbcTemplate jdbcTemplate;

    @BeforeEach
    void init() {
        jdbcTemplate.execute("create table if not exists hello(name varchar(50) primary key, count int)");
    }

    @Test
    void findHelloFailed() {
        assertThat(helloRepository.findHello("Heechul")).isNull();
    }

    @Test
    void increaseCount() {
        assertThat(helloRepository.countOf("heechul")).isEqualTo(0);

        helloRepository.increaseCount("heechul");
        assertThat(helloRepository.countOf("heechul")).isEqualTo(1);

        helloRepository.increaseCount("heechul");
        assertThat(helloRepository.countOf("heechul")).isEqualTo(2);
    }
}
