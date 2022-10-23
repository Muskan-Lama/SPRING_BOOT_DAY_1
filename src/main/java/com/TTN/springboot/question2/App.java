package com.TTN.springboot.question2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/* @SpringBootApplication annotation is used to mark a configuration class
 that declares one or more @Bean methods and also triggers auto-configuration and component
 scanning. It's same as
 declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.
 */
@SpringBootApplication
public class app
{
    public static void main( String[] args )

    {
        /*GIVING PATH */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(app.class);


       helper output = context.getBean(helper.class);
        output.display();


    }

}
