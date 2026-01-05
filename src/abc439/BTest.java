package abc439;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class BTest {

	@ParameterizedTest
	@CsvSource({
		"2026, Yes",
		"439, No",
		"440, Yes"
	})
	void test(String N, String expected) {
		assertEquals(new B().b(N), expected);
	}
}
