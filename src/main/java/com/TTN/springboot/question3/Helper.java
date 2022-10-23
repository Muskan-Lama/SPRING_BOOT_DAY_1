package com.TTN.springboot.question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* It means that Spring framework will autodetect these
 classes for dependency injection when annotation-based configuration
 and classpath scanning is used.
 */
@Component
public class Helper {


    /* It allows Spring to resolve and inject collaborating beans into our bean.*/

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

