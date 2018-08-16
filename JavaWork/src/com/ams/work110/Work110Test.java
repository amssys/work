package com.ams.work110;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Work110のテストを実行するクラス<BR>
 *
 * テスト実行方法：<BR>
 *   右クリック → 実行 → JUnitテスト<BR>
 *
 * テスト結果の確認：<BR>
 *   実行結果が 実行:35/35 エラー:0 失敗:0 となっていたらテスト合格<BR>
 */
public class Work110Test {

	@Test(expected = IllegalArgumentException.class)
	public void divideIntoCharsのケース1() throws Exception {
		Work110 work = new Work110();
		work.divideIntoChars(null);
	}

	@Test
	public void divideIntoCharsのケース2() throws Exception {
		Work110 work = new Work110();
		char[] expected = new char[] { 'A', 'B', 'C' };
		char[] actual = work.divideIntoChars("ABC");
		assertThat(actual, is(expected));
	}

	@Test
	public void divideIntoCharsのケース3() throws Exception {
		Work110 work = new Work110();
		char[] expected = new char[] { 'A' };
		char[] actual = work.divideIntoChars("A");
		assertThat(actual, is(expected));
	}

	@Test
	public void divideIntoCharsのケース4() throws Exception {
		Work110 work = new Work110();
		char[] expected = new char[] {};
		char[] actual = work.divideIntoChars("");
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void compareのケース1() throws Exception {
		Work110 work = new Work110();
		work.compare(null, null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void compareのケース2() throws Exception {
		Work110 work = new Work110();
		work.compare(null, "ABC");
	}

	@Test(expected = IllegalArgumentException.class)
	public void compareのケース3() throws Exception {
		Work110 work = new Work110();
		work.compare("ABC", null);
	}

	@Test
	public void compareのケース4() throws Exception {
		Work110 work = new Work110();
		int expected = 0;
		int actual = work.compare("ABC", "ABC");
		assertThat(actual, is(expected));
	}

	@Test
	public void compareのケース5() throws Exception {
		Work110 work = new Work110();
		int expected = 1;
		int actual = work.compare("ABC", new String("ABC"));
		assertThat(actual, is(expected));
	}

	@Test
	public void compareのケース6() throws Exception {
		Work110 work = new Work110();
		int expected = 2;
		int actual = work.compare("ABC", "abc");
		assertThat(actual, is(expected));
	}

	@Test
	public void compareのケース7() throws Exception {
		Work110 work = new Work110();
		int expected = 9;
		int actual = work.compare("ABC", "XYZ");
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractStringのケース1() throws Exception {
		Work110 work = new Work110();
		work.extractString(null, 9, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractStringのケース2() throws Exception {
		Work110 work = new Work110();
		work.extractString("ABCDEFGH", 0, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractStringのケース3() throws Exception {
		Work110 work = new Work110();
		work.extractString("ABCDEFGH", 9, 1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractStringのケース4() throws Exception {
		Work110 work = new Work110();
		work.extractString("ABCDEFGH", 1, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void extractStringのケース5() throws Exception {
		Work110 work = new Work110();
		work.extractString("ABCDEFGH", 1, 9);
	}

	@Test
	public void extractStringのケース6() throws Exception {
		Work110 work = new Work110();
		String expected = "CDEF";
		String actual = work.extractString("ABCDEFGH", 3, 4);
		assertThat(actual, is(expected));
	}

	@Test
	public void extractStringのケース7() throws Exception {
		Work110 work = new Work110();
		String expected = "";
		String actual = work.extractString("ABCDEFGH", 1, 0);
		assertThat(actual, is(expected));
	}

	@Test
	public void extractStringのケース8() throws Exception {
		Work110 work = new Work110();
		String expected = "A";
		String actual = work.extractString("ABCDEFGH", 1, 1);
		assertThat(actual, is(expected));
	}

	@Test
	public void extractStringのケース9() throws Exception {
		Work110 work = new Work110();
		String expected = "ABCDEFGH";
		String actual = work.extractString("ABCDEFGH", 1, 8);
		assertThat(actual, is(expected));
	}

	@Test
	public void isMobilePhoneNumberのケース1_1() throws Exception {
		Work110 work = new Work110();
		boolean expected = true;
		boolean actual = work.isMobilePhoneNumber("090-1234-5678");
		assertThat(actual, is(expected));
	}

	@Test
	public void isMobilePhoneNumberのケース1_2() throws Exception {
		Work110 work = new Work110();
		boolean expected = true;
		boolean actual = work.isMobilePhoneNumber("090-1234-5679    ");
		assertThat(actual, is(expected));
	}

	@Test
	public void isMobilePhoneNumberのケース1_3() throws Exception {
		Work110 work = new Work110();
		boolean expected = true;
		boolean actual = work.isMobilePhoneNumber("    090-1234-5678");
		assertThat(actual, is(expected));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース2() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース3() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234-567");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース4() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234-56789");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース5() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234-567A");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース6() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234-567あ");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース7() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234*5678");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース8_1() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-1234567-8");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース8_2() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("090-12345678");
	}

	@Test(expected = IllegalArgumentException.class)
	public void isMobilePhoneNumberのケース8_3() throws Exception {
		Work110 work = new Work110();
		work.isMobilePhoneNumber("09012345678");
	}

	@Test
	public void isMobilePhoneNumberのケース9() throws Exception {
		Work110 work = new Work110();
		boolean expected = true;
		boolean actual = work.isMobilePhoneNumber("080-1234-5678");
		assertThat(actual, is(expected));
	}

	@Test
	public void isMobilePhoneNumberのケース10() throws Exception {
		Work110 work = new Work110();
		boolean expected = true;
		boolean actual = work.isMobilePhoneNumber("070-1234-5678");
		assertThat(actual, is(expected));
	}

	@Test
	public void isMobilePhoneNumberのケース11() throws Exception {
		Work110 work = new Work110();
		boolean expected = false;
		boolean actual = work.isMobilePhoneNumber("060-1234-5678");
		assertThat(actual, is(expected));
	}

}
