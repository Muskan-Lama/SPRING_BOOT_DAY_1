package com.TTN.springboot.QUESTION_3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication 
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(App.class);


       Helper output = context.getBean(Helper.class);
        output.display();


    }
}
