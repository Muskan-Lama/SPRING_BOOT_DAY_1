package com.TTN.springboot.QUESTION_2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(com.TTN.springboot.QUESTION_2.App.class);


       Helper output = context.getBean(Helper.class);
        output.display();


    }
}
