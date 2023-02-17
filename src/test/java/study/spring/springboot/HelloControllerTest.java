package study.spring.springboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        // http://localhost:8080/hello?name?spring
        TestRestTemplate restTemplate = new TestRestTemplate();

        ResponseEntity<String> response =
                restTemplate.getForEntity("http://localhost:8080/hello?name={name}", String.class, "Spring");

        //status 200
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        //header(content-type) text/plain
        assertThat(response.getHeaders().getFirst(HttpHeaders.CONTENT_TYPE)).startsWith(MediaType.TEXT_PLAIN_VALUE);

        //body Hello spring
        assertThat(response.getBody()).isEqualTo("Hello Spring");
    }
}