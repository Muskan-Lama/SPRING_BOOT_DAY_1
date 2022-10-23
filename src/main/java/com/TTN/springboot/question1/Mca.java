package com.TTN.springboot.question1;


/*TIGHTLY COUPLED DEPENDING ON AN OBJECT       */
public class Mca{


   Btech btech =new Btech();
       void  display()
       {
           btech.display();
       }
}
