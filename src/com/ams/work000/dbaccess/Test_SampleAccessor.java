package com.ams.work000.dbaccess;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * DBアクセスのテストクラス
 * @author Myamagishi
 *
 */
public class Test_SampleAccessor {

	public static void main(String[] args) {

		try {

			// DB接続
			Connection con = DBConnectionManeger.getConnection();

			String itemCd = "B001";
			String name = new SampleAccessor().getItemName(itemCd, con);

			System.out.println("---------------- 実行結果----------------");
			System.out.println("商品名 ==" + name);


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
