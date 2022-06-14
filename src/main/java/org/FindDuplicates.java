package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Sun");list.add("Moon");list.add("Jupiter");list.add("Urenus");
		list.add("Sun");list.add("Moon");list.add("Jupiter");

		//using set
		Set<String> set = new LinkedHashSet<>();
		List<String> duplicates1 = list.stream()
				.filter(str -> !set.add(str))
				.collect(Collectors.toList());
		System.out.println(duplicates1);
		//using Collections.frequency
		Set<String> duplicates2 = list.stream()
				.filter(s -> Collections.frequency(list, s) > 1)
				.collect(Collectors.toSet());
		System.out.println(duplicates2);
		//grouping by
		Map<String, Long> m = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m);
		Set<String> duplicates3 = m
				.entrySet().stream()
				.filter(e -> e.getValue()>1)
				.map(e -> e.getKey())
				.collect(Collectors.toSet());
		System.out.println(duplicates3);
	}

}
