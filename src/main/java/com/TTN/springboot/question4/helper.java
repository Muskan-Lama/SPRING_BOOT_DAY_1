package com.TTN.springboot.question4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class helper {

    @Autowired
    computerScience computerScience;

    public helper(computerScience computerScience) {
        this.computerScience = computerScience;
    }

    public void display()
    {
        computerScience.display();
    }

  //  public void setComputer_science(COMPUTER_SCIENCE computer_science)
    {
        this.computerScience = computerScience;
    }

    }

