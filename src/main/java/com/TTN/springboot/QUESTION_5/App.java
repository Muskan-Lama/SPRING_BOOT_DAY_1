package com.TTN.springboot.QUESTION_5;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*(5) Demonstrate how you will
 resolve ambiguity while autowiring bean (Hint : @Primary)
 */

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
