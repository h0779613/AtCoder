package abc439;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C {

	static Function<Integer, Integer> determine =
	N -> {
		long count = Stream.iterate(1, x -> x * x < N, x -> x + 1)
				.flatMap(x -> Stream.iterate(1, y -> y * y < N, y -> y + 1)
				.filter(y -> x < y && x * x + y * y == N))
				.count();
		return count == 1 ? N : 0;
	};
	static Function<Integer, List<Integer>> enumerate =
	N -> {
		return Stream.iterate(1, n -> n <= N, n -> n + 1)
				.map(n -> C.determine.apply(n))
				.filter(n -> n != 0)
				.collect(Collectors.toList());
	};
	
	List<Integer> c(int N) {
		return C.enumerate.apply(N);
	}
}
