package br.com.noah.spring.scope;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.noah.spring.scope.PersonDao;


@SpringBootApplication
public class SpringScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);

		PersonDao personDAO = applicationContext.getBean(PersonDao.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		PersonDao personDao2 = applicationContext.getBean(PersonDao.class);
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
