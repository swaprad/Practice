package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesInListOfString {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sun");list.add("Moon");list.add("Jupiter");list.add("Urenus");
		list.add("Sun");list.add("Moon");list.add("Jupiter");

		//using Collections.frequency
		Map<String, Object> map1 = list.stream()
				.filter(str -> Collections.frequency(list, str) > 1)
				.distinct()
				.collect(Collectors.toMap(Function.identity(), str -> Collections.frequency(list, str)));
		System.out.println(map1);

		//grouping by
		Map<String, Long> map2 = list.stream()
				.filter(str -> Collections.frequency(list, str) > 1)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);

		Set<String> duplicates3 = map2
				.entrySet().stream()
				.filter(e -> e.getValue()>1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());
		System.out.println(duplicates3);
	}

}
