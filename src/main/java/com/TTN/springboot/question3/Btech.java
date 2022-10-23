package com.TTN.springboot.question3;

import org.springframework.stereotype.Component;

@Component
public class Btech implements ComputerScience {


    @Override
    public void display() {
        System.out.println("B TECH DISPLAY");
    }
}
