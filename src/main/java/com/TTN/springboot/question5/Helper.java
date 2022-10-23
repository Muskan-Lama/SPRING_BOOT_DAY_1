package com.TTN.springboot.question5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    @Autowired
    ComputerScience computerScience;

    public Helper(computerScience computerScience) {
        this.computerScience = computerScience;
    }

    public void display()
    {
        computerScience.display();
    }

  //  public void setComputer_science(ComputerScience computer_science)
    {
        this.computerScience = computerScience;
    }

    }

