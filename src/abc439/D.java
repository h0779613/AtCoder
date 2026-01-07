package abc439;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class D {

	Function<List<Integer>, Long> count =
	list -> Stream.iterate(1, i -> i <= list.size(), i -> i + 1)
		.flatMap(i -> Stream.iterate(1, j -> j <= list.size(), j -> j + 1)
		.flatMap(j -> Stream.iterate(1, k -> k <= list.size(), k -> k + 1)
		.filter(k -> list.get(i - 1) / 7.0 == list.get(j - 1) / 5.0 && list.get(i - 1) / 7.0 == list.get(k - 1) / 3.0)
		.filter(k -> (j <= i && j <= k) || (j >= i && j >= k))))
		.count();
	
	Long d(List<Integer> list) {
		return new D().count.apply(list);
	}
}
