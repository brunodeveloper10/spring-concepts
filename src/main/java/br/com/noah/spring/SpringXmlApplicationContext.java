package br.com.noah.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.noah.spring.xml.XmlJdbcConnection;
import br.com.noah.spring.xml.XmlPersonDao;


public class SpringXmlApplicationContext {
    
    private static Logger LOGGER = LoggerFactory.getLogger(SpringScanApplication.class);

    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = 
                new ClassPathXmlApplicationContext("applicationContext.xml")) {
            
            LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());        
            XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
            System.out.println(personDao);

            XmlJdbcConnection connection = personDao.getXmlJdbcConnection();
            System.out.println(connection);
        }   
    }
}
