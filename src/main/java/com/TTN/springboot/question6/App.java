package com.TTN.springboot.question6;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* Perform Constructor Injection in a Spring Bean*/
@SpringBootApplication 
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(app.class);


       Helper output = context.getBean(Helper.class);
        output.display();


    }
}
