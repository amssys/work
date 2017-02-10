package com.ams.work000;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Work000のテストを実行するクラス<BR>
 *
 * テスト実行方法：<BR>
 *   右クリック → 実行 → JUnitテスト<BR>
 *
 * テスト結果の確認：<BR>
 *   実行結果が 実行:2/2 エラー:0 失敗:0 となっていたらテスト合格<BR>
 */
public class Work000Test {
	/**
	 * divideのテスト<BR>
	 * 計算内容(1÷0=) <BR>
	 * @throws Exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void Work000_except() throws Exception {
		Work000 work = new Work000();
		work.divide(1, 0);
	}

	/**
	 * divideのテスト<BR>
	 * 計算内容(4÷2=) <BR>
	 * @throws Exception
	 */
	@Test
	public void Work000_case1() throws Exception {
		Work000 work = new Work000();
		assertEquals(2, work.divide(4, 2));
	}

}
