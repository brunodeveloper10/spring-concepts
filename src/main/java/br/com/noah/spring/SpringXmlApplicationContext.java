package br.com.noah.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.noah.spring.xml.XmlJdbcConnection;
import br.com.noah.spring.xml.XmlPersonDao;


public class SpringXmlApplicationContext {
    
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = 
                new ClassPathXmlApplicationContext("applicationContext.xml")) {

            XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
            System.out.println(personDao);

            XmlJdbcConnection connection = personDao.getXmlJdbcConnection();
            System.out.println(connection);
        }   
    }
}
