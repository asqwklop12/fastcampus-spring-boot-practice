package com.fastcampus.springbootpractice.logic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  @Test
  @DisplayName("버블 소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
  void given_list_WhenExecuting() {

    BubbleSort<Integer> bubbleSort = new BubbleSort<>();

    List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));
    assertEquals(List.of(1, 2, 3, 4, 5), actual);
  }
}