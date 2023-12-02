package br.com.noah.spring.cdi;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SomeCdiBussiness {

    @Inject
    private SomeCdiDao someCdiDao;

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public SomeCdiDao getSomeCdiDao(){
        return this.someCdiDao;
    }
    
}
