package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static Integer sum(Integer a, Integer b) {
    int suma;
    if ((a == null) || (b==null)){
      System.out.println("The result cannot be null");
      if (a==null){
        suma = b;
      }
      else {
        suma = a;
      }
    }
    else {
      suma = a+b;
    }
    return suma;
  }
}
