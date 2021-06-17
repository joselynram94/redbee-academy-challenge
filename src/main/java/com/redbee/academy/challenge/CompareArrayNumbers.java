package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer List
   * @param b - Another Integer List
   * @return The result is a list with de max of each index
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    List <Integer> c = new ArrayList<Integer>();
    if (a.isEmpty() || b.isEmpty()){
      System.out.println("Error: empty list");
    }
    else {
      int min = 0;
      if (a.size() <= b.size()) {
        min = a.size();
      } else {
        min = b.size();
      }
      for (int i = 0; i < min; i++) {
        if (a.get(i) >= b.get(i)) {
          c.add(a.get(i));
        } else {
          c.add(b.get(i));
        }
      }
      if (a.size() > b.size()) {
        for (int i = (a.size() - b.size()) + 1; i < (a.size()); i++) {
          c.add(a.get(i));
        }
      }
      if (a.size() < b.size()) {
        for (int i = (b.size() - a.size()) + 1; i < (b.size()); i++) {
          c.add(b.get(i));
        }
      }
      System.out.println(c);
    }
    return c;
  }



}
