package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import code.*;

class DatabasesTestcase {

	@Test
	void checkNameTest() {
		Database db = Database.getInstance();
		boolean ret = db.checkName("abc");
		assertEquals(true, ret);
	}
	
	@Test
	void checkNameInvalidTest() {
		Database db = Database.getInstance();
		boolean ret = db.checkName("abcx");
		assertEquals(false, ret);
	}
	
	@Test
	void checkNameAndPwdTest() {
		Database db = Database.getInstance();
		boolean ret = db.checkNameAndPwd("abc", "123");
		assertEquals(true, ret);
	}
	
	@Test
	void checkNameAndPwdInvalidTest() {
		Database db = Database.getInstance();
		boolean ret = db.checkNameAndPwd("abc", "1231");
		assertEquals(false, ret);
	}
	
	@Test
	void checkExistTableTest() {
		Database db = Database.getInstance();
		boolean ret = db.checkExistTable("member");
		assertEquals(true, ret);
	}
}
