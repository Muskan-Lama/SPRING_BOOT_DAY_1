package com.TTN.springboot.question6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mca implements computerScience {


    @Override
    public void display() {
        System.out.println("MCA");
    }
}
