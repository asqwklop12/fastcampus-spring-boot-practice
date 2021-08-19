package com.fastcampus.springbootpractice.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class JavaSort<T extends Comparable<T>> implements Sort<T> {

  @Override
  public List<T> sort(List<T> list) {
    List<T> output = new ArrayList<>(list);
    Collections.sort(output);
    return output;
  }
}
