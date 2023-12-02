package br.com.noah.spring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import br.com.noah.scan.ComponentPersonDao;
import br.com.noah.scan.ScanJdbcConnection;


@SpringBootApplication
@ComponentScan("br.com.noah.scan")
public class SpringScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScanApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringScanApplication.class, args);

		ComponentPersonDao personDAO = applicationContext.getBean(ComponentPersonDao.class);

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		ComponentPersonDao personDao2 = applicationContext.getBean(ComponentPersonDao.class);
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
	}

}
