package com.TTN.springboot.question6;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* Perform Constructor Injection in a Spring Bean*/
@SpringBootApplication 
public class app
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(app.class);


       helper output = context.getBean(helper.class);
        output.display();


    }
}
