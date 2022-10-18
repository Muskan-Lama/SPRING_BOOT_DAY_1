package com.TTN.springboot.question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* It means that Spring framework will autodetect these
 classes for dependency injection when annotation-based configuration
 and classpath scanning is used.
 */
@Component
public class helper {


    /* It allows Spring to resolve and inject collaborating beans into our bean.*/

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

