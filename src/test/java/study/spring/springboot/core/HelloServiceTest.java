package study.spring.springboot.core;

import org.junit.jupiter.api.Test;
import study.spring.springboot.core.SimpleHelloService;

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

    @Test
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        String response = decorator.sayHello("Spring");

        assertThat(response).isEqualTo("*Spring*");
    }
}