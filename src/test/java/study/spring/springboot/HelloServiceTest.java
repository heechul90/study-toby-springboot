package study.spring.springboot;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.assertThat;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest {
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Test
@interface UnitTest {
}
class HelloServiceTest {

    @Test
    void sayHello() {
        //given
        SimpleHelloService helloService = new SimpleHelloService(helloRepositoryStub);

        //when
        String response = helloService.sayHello("Spring");

        //then
        assertThat(response).isEqualTo("Hello Spring");
    }

    private static HelloRepository helloRepositoryStub = new HelloRepository() {
        @Override
        public Hello findHello(String name) {
            return null;
        }

        @Override
        public void increaseCount(String name) {

        }
    };

    @Test
    void helloDecorator() {
        HelloDecorator decorator = new HelloDecorator(name -> name);

        String response = decorator.sayHello("Spring");

        assertThat(response).isEqualTo("*Spring*");
    }
}