package abc439;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ATest {

	@ParameterizedTest
	@CsvSource({
		"1, 0",
		"2, 0",
		"11, 2026"
	})
	void test(int N, int expected) {
		assertEquals(A.a(N), expected);
	}

}
