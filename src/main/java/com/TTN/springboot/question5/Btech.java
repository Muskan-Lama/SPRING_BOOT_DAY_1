package com.TTN.springboot.question5;

import org.springframework.stereotype.Component;

@Component
public class bTech implements ComputerScience {


    @Override
    public void display() {
        System.out.println("B TECH DISPLAY");
    }
}
