package br.com.noah.spring.basic.algs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSort implements SortAlgorithm {

    @Override
    public int[] sort(int[] numbers) {
        
        return numbers;
    }
    
}
