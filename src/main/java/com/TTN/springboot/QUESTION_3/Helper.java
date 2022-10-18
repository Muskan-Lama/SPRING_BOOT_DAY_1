package com.TTN.springboot.QUESTION_3;

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

