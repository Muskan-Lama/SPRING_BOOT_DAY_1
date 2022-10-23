package com.TTN.springboot.question4;

import org.springframework.stereotype.Component;

@Component
public class Btech implements ComputerScience {


    @Override
    public void display() {
        System.out.println("B TECH DISPLAY");
    }
}
