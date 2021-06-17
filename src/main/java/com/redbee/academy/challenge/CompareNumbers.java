package com.redbee.academy.challenge;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    int max = 0;
    List<Integer> array = new ArrayList<Integer>();
    if (a!=null){
      array.add(a);
    }
    if (b!=null){
      array.add(b);
    }
    if (c!=null){
      array.add(c);
    }
    if (array.size()>0) {
      max = array.get(0);
      for (int i = 0; i < array.size(); i++) {
        int actual = array.get(i);
        if (actual > max) {
          max = actual;
        }
      }
    }
    else {
      System.out.println("The result cannot be null");
    }
    System.out.println(max);
    return max;
  }
}
