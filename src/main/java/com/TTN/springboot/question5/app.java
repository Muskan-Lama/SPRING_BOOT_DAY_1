package com.TTN.springboot.question5;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*(5) Demonstrate how you will
 resolve ambiguity while autowiring bean (Hint : @Primary)
 */

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
