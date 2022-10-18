package com.TTN.springboot.question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/* It means that Spring framework will autodetect these
 classes for dependency injection when annotation-based configuration
 and classpath scanning is used.
 */
@Component
public class helper {

     /* It allows Spring to resolve and inject collaborating beans into our bean.*/

    /*CONSTRUCTOR INJECTION the act of statically defining the list of required Dependencies by specifying them as parameters to the class's constructor.
 The constructor signature is compiled with the type and it's available for all to see.
 */
    @Autowired
    computerScience computerScience;


  /*helper constructor */
    public helper(computerScience computerScience)
    {

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

