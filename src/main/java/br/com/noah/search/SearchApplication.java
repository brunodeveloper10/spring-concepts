package br.com.noah.search;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SearchApplication.class, args);

		//SortAlgorithm sortAlgorithm = applicationContext.getBean(QuickSort.class);
		
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);

		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);

		int returned_number = binarySearch.search(new int[]{2,5,7,8}, 7);
		
		System.out.println(binarySearch);

		System.out.println(binarySearch1);
	}

}
