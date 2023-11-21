package br.com.noah.search.algs;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {

    public BubbleSort(){
        System.out.println("Instanciou o Buble sort");
    }

    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
    
}
