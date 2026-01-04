package abc439;

import java.util.function.Function;
import java.util.stream.Stream;

public class A {

	static int a(int N) {
		
		Function<Integer, Integer> calculate = n ->
		Stream.iterate(1, num -> num * 2).limit(n + 1).reduce((a, b) -> b).orElse(1) - 2 * n;
		
		return calculate.apply(N);
	}
}
