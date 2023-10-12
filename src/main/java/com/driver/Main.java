package com.driver;

public class Main {

  public static void main(String args[]){
    RWOnly o = new RWOnly();
    String s = "Ok Gandu.";
    o.setName(s);
    String name = o.getName();

    System.out.println(name);
  }

}