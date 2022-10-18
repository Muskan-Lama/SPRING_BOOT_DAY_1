package com.TTN.springboot.QUESTION_2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/* @SpringBootApplication annotation is used to mark a configuration class
 that declares one or more @Bean methods and also triggers auto-configuration and component
 scanning. It's same as
 declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )

    {
        /*GIVING PATH */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(com.TTN.springboot.QUESTION_2.App.class);


       Helper output = context.getBean(Helper.class);
        output.display();


    }

}
