package br.com.noah.spring.basic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicApplication.class, args);

		//SortAlgorithm sortAlgorithm = applicationContext.getBean(QuickSort.class);
		
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);

		int returned_number = binarySearch.search(new int[]{2,5,7,8}, 7);
		
		System.out.println(binarySearch);

		System.out.println(binarySearch1);


	}

}
