package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CompareArrayNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    List<Integer> result = CompareArrayNumbers.max(List.of(1, 2, 4), List.of(5, 5, 5));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(5, result.get(2));
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath2() {
    List<Integer> result = CompareArrayNumbers.max(List.of(5, 1, 5), List.of(1, 5, 1));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(5, result.get(2));
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath3() {
    List<Integer> result = CompareArrayNumbers.max(List.of(5, 1), List.of(1, 5, 1));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(1, result.get(2));
  }

  //New test, otherwise the previous one.
  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath4() {
    List<Integer> result = CompareArrayNumbers.max(List.of(5, 1, 4), List.of(1, 5));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(4, result.get(2));
  }
  //New test, Empty list
  @Test
  @DisplayName("Test empty list")
  public void testHappyPath5() {
    List<Integer> result = CompareArrayNumbers.max(List.of(), List.of(1, 5));
    assertNotNull(result, "Error: empty list");
  }
}
