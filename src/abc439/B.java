package abc439;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B {

	String b(String N) {
		
		Function<String, String> operate = str -> {
			List<Integer> list = new ArrayList<>();
			int strLen = str.length();
			for (int i = 0; i < strLen; i++) {
				list.add(str.charAt(i) - '0');
			}
			int out = 0;
			int listSize = list.size();
			for (int i = 0; i < listSize; i++) {
				out += list.get(i) * list.get(i);
			}
			return "" + out;
		};
		Function<String, Boolean> determine = str -> {
			List<String> list = new ArrayList<>();
			list.add(str);
			boolean out = true;
			while (!"1".equals(list.get(list.size() - 1))) {
				list.add(operate.apply(list.get(list.size() - 1)));
				if (list.size() != list.stream().distinct().collect(Collectors.toList()).size()) {
					out = false;
					break;
				}
			}
			return out;
		};
		
		return determine.apply(N) ? "Yes" : "No";
	}
}
