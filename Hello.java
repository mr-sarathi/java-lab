package com.scsvmv.javalab.hello;
import java.util.Data;

/*
  *Hello class
  *Demonstrates method overloading and command-line arguments
  */

public class Hello 
{
  \\Default constructor
   Public Hello(){
   }

   \\Generic with   
    public voidwish(){
      System.out.peintln("Hello world");
}
   \\Overloaded with method with name parameter
    Public void with(string name){
      System.out.println("Hello"+name);
}
   \\Wist with name and today's data
   public void wishWithData(string name){
     Data taday=new Data();
     System.out.println("Hello"+name+"|Data:"+today);
}
}