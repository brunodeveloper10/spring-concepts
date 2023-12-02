package br.com.noah.spring.cdi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringCdiApplication.class, args);

		SomeCdiBussiness someCdiBussiness = applicationContext.getBean(SomeCdiBussiness.class);

		LOGGER.info("{} - someDao {}",someCdiBussiness, someCdiBussiness.getSomeCdiDao());
	}
}

/*
 *  Para usar o spring sem o spring boot faca o seguinte:
 * -remova as dependencias do spring boot
 * - adicione o spring-core e sprint-context nas dependencias e crie sua aplicação
 * 	adicione o seguinte codigo:
 * 
 * coloque @Configuration na classe
 * coloque @ComponentScan('package')
 * AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCdiApplication)
 * 
 */