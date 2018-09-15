package com.ams.db.access;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * DBサクセスのサンプルクラス
 * @author Myamagishi
 * @exception SQLException
 */
public class SampleAccessor {
	
	/**
	 * 商品名を取得
	 * @param id 商品コード
	 * @param con
	 * @return
	 * @throws SQLException
	 */
	public String getItemName(String itemCd, Connection con) throws SQLException {

		// SQL組み立て
		StringBuilder buf = new StringBuilder();
		buf.append("select ");
		buf.append(" ITEM_NAME ");
		buf.append("from ");
		buf.append(" M_ITEM ");
		buf.append("where ");
		buf.append(" ITEM_CD = ?");
		
		String sql = buf.toString();
		System.out.println("SQL=" + sql);

		// SQL実行のためのオブジェクト
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {

			// SQLオブジェクト
			stmt = con.prepareStatement(sql);

			// パラメータ値セット
			stmt.setString(1, itemCd);
			System.out.println("prams=" + itemCd + "/");

			// 検索実行
			rs = stmt.executeQuery();

			// 結果取得
			String name = null;
			if (rs.next()) {
				name = rs.getString(1);
			} else {
				System.out.println("検索結果なし。ID=" + itemCd);
			}

			return name;

		} catch (SQLException e) {

			throw e;

		} finally {

			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw e;
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					throw e;
				}
			}
		}
	}

}
