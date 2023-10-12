package com.driver;

public class Main {

  public static void main(String args[]){
    RWOnly o = new RWOnly();
    String s = "Ok Gandu.";
    o.setMember(s);
    String name = o.getMember();

    System.out.println(name);
  }

}