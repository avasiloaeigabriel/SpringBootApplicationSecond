package ro.itschool.springboot.beantest;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        GreetingService greetingService=context.getBean(GreetingService.class);
        String greeting=greetingService.getGreetingMessage();
        System.out.println(greeting);
    }
}
