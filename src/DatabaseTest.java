import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void test() {
		String infoLine = "Star Trek 4 (????)                  ????";
		String correctYear = "????";
		String correctTitle = "Star Trek 4";
		String correctType = "Theatre";
		String correctLine = "Star Trek 4 (????)";
		
		char[] cArray = infoLine.toCharArray();
		
		assertEquals(correctYear, Database.parseYear(cArray));
		assertEquals(correctTitle, Database.parseTitle(cArray));
		assertEquals(correctType, Database.parseType(cArray));
		assertEquals(correctLine, Database.trimLine(cArray));
	}
	}

}
