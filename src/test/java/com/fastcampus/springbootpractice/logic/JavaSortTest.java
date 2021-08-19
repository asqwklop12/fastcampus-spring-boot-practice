package com.fastcampus.springbootpractice.logic;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JavaSortTest {

  @Test
  @DisplayName("자바 소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
  void given_list_WhenExecuting() {

    JavaSort<Integer> javaSort = new JavaSort<>();
    List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));
    assertEquals(List.of(1, 2, 3, 4, 5), actual);
  }

}