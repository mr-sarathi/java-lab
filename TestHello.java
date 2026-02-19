package com.scsvmv.javalab;
import com.scsvmv.javalab.hello.Hello;

/*
  *TestHello class
  *demonstrates passing command-line arguments
  */

public class Testhello 
{
 public static void main(String[]args)
{
 \\Using hello class from parent package
   Hello simplehello=new Hello();
   Simplehello.wish();

 \\Using Hello class from parent package
 com.scsvmv.javalab.hello.Hello h=
     new com.scsvmv.javalab.hello.Hello();
  
  \\Check for command-line argument
  it (args.length>0){
      h.wish(args[0]); \\pass CLI argument
      h.wishwithdata(args[0]);
     } else {
       System.out.println("Using:");
       System.out.println("java com.scsvmv.javalab.testHellow<name>");
       System.out.println("example:");
       System.out.println("java com.scsvmv.javalab.testHello student");
}