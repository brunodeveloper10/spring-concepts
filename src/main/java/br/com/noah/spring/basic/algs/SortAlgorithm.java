package br.com.noah.spring.basic.algs;

import org.springframework.stereotype.Component;

@Component
public interface SortAlgorithm {

    int[] sort(int[] numbers);
}
