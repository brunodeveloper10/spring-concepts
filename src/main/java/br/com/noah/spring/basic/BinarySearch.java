package br.com.noah.spring.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.noah.spring.basic.algs.SortAlgorithm;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {

    private static Logger LOGGER = LoggerFactory.getLogger(BinarySearch.class);

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    
    public int search(int[] numbers, int lookedNumber) {
        int[] numberOrdered = sortAlgorithm.sort(numbers);
        return 0;
    }

    @PostConstruct
    public void postConstructor(){
        LOGGER.info("Post Constructor");
    }
    
    @PreDestroy
    public void preDestroy(){
        LOGGER.info("Pre destroy");
    }
}
