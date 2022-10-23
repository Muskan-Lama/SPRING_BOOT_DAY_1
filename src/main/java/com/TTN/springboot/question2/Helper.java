package com.TTN.springboot.question2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
/*HELPER CLASS */
public class Helper {

    @Autowired
    ComputerScience computerScience;

    public helper(ComputerScience computerScience) {
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

