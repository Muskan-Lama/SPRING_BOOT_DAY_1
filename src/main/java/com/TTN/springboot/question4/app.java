package com.TTN.springboot.question4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/* Get a Spring Bean from application context and display its properties.

 */

@SpringBootApplication 
public class app
{
    public static void main( String[] args )
    {
        /*GETTING APPLICATION CONTEXT */
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(app.class);


       helper output = context.getBean(helper.class);
        output.display();


    }
}
