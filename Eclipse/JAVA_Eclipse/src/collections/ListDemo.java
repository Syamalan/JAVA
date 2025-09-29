package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {

	public static void main(String[] args) {
		List<String> cityList = Arrays.asList("Hyd", "Blr","Che","Del", "Mum", "Pun", "Hyderabad");
		Integer[] arr = {1,3,5,7,2,4,6,8,2,4,9};
		List<Integer> intList = Arrays.asList(arr);
		List<String> cityWithH= cityList.stream()
				.filter(name->name.startsWith("H"))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(cityWithH);
		
		List<Integer> evenNums= intList.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
		

		Set<Integer> evenNumsSet= intList.stream().filter(x->x%2==0).collect(Collectors.toSet());
		System.out.println(evenNumsSet);

								
	}

}
