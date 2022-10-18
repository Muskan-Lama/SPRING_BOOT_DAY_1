package com.TTN.springboot.QUESTION_5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


/*@Primary indicates that a bean should be given preference when multiple candidates are qualified to autowire
a single-valued dependency. There should be only one @Primary bean among same type of beans
 */
@Component
@Primary
public class MCA implements COMPUTER_SCIENCE {


    @Override
    public void display() {
        System.out.println("MCA");
    }
}
