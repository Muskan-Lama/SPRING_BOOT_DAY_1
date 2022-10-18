package com.TTN.springboot.QUESTION_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    @Autowired
    COMPUTER_SCIENCE computer_science;

    public Helper(COMPUTER_SCIENCE computer_science) {
        this.computer_science = computer_science;
    }

    public void display()
    {
        computer_science.display();
    }

  //  public void setComputer_science(COMPUTER_SCIENCE computer_science)
    {
        this.computer_science=computer_science;
    }

    }

