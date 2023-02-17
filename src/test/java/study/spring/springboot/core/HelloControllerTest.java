package study.spring.springboot.core;

import org.junit.jupiter.api.Test;
import study.spring.springboot.core.HelloController;

import static org.assertj.core.api.Assertions.*;

public class HelloControllerTest {

    @Test
    void helloController() {
        HelloController helloController = new HelloController(name -> name);

        String response = helloController.hello("Spring");

        assertThat(response).isEqualTo("Spring");
    }

    @Test
    void failsHelloController() {
        HelloController helloController = new HelloController(name -> name);

        assertThatThrownBy(() -> helloController.hello(null))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> helloController.hello(""))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
