package abc439;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DTest {

	Supplier<Stream<Arguments>> provider =
	() -> Stream.of(
			Arguments.of(List.of(3, 10, 7, 10, 7, 6, 7, 6, 5, 14), 7l),
			Arguments.of(List.of(210, 210, 210, 210, 210, 210), 0l),
			Arguments.of(List.of(49, 30, 50, 21, 35, 15, 21, 70, 35, 9, 50, 70, 21, 49, 30, 50, 70, 15, 9, 21, 30), 34l));
	
	static Stream<Arguments> provider() {
		return new DTest().provider.get();
	}
	@ParameterizedTest
	@MethodSource("provider")
	void test(List<Integer> list, Long expected) {
		assertEquals(new D().d(list), expected);
	}
}
