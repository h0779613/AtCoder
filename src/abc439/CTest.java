package abc439;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CTest {

	static Supplier<Stream<Arguments>> provider =
	() -> Stream.of(
			Arguments.of(10, List.of(5, 10)),
			Arguments.of(1, List.of()),
			Arguments.of(50, List.of(5, 10, 13, 17, 20, 25, 26, 29, 34, 37, 40, 41, 45, 50)));
	
	static Stream<Arguments> provider() {
		return CTest.provider.get();
	}
	@ParameterizedTest
	@MethodSource("provider")
	void test(int N, List<Integer> expected) {
		assertEquals(new C().c(N), expected);
	}
}
