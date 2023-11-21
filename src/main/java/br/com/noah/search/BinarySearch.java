package br.com.noah.search;

import br.com.noah.search.algs.SortAlgorithm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    
    public int search(int[] numbers, int lookedNumber) {
        int[] numberOrdered = sortAlgorithm.sort(numbers);
        return 0;
    }
    
}
