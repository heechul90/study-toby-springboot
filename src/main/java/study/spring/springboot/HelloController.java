package study.spring.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping
public class HelloController {

    private final HelloService helloService;
    private final ApplicationContext applicationContext;

    public HelloController(HelloService helloService, ApplicationContext applicationContext) {
        this.helloService = helloService;
        this.applicationContext = applicationContext;

        System.out.println(applicationContext);
    }

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
