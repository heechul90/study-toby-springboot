package study.spring.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.*;

class HelloApiTest {

    @Test
    void helloApi() {
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

    @Test
    void failsHelloApi() {
        // http://localhost:8080/hello?name?spring
        TestRestTemplate restTemplate = new TestRestTemplate();

        ResponseEntity<String> response =
                restTemplate.getForEntity("http://localhost:8080/hello?name=", String.class);

        //status 200
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}