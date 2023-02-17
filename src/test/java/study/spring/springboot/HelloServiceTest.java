package study.spring.springboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloServiceTest {

    @Test
    void sayHello() {
        //given
        SimpleHelloService helloService = new SimpleHelloService();

        //when
        String response = helloService.sayHello("Spring");

        //then
        assertThat(response).isEqualTo("Hello Spring");
    }
}