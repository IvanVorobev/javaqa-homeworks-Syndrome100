package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {4, 5, 7, 13, 15, 8, 6, 12, 20, 18, 11};
    long expected = 20;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
}