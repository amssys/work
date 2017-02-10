package com.ams.db.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * DBコネクション管理クラス
 * @author Myamagishi
 *
 */
public class DBConnectionManeger {

	/**
	 * DBプロパティファイル場所をファイル名
	 */
	private static final String DB_PROPERTIES = "com.ams.work000.dbaccess.db_access";

	/**
	 * コンストラクタ
	 */
	public DBConnectionManeger() {
	}

	/**
	 * コネクションを取得
	 * @return コネクション
	 */
	public static Connection getConnection(){

		ResourceBundle bundle = ResourceBundle.getBundle(DB_PROPERTIES);

		String driver = bundle.getString("driver");
		String url = bundle.getString("url");
		String user = bundle.getString("user");
		String password = bundle.getString("password");

		System.out.println("driver == [" + driver + "]");
		System.out.println("url == [" + url + "]");
		System.out.println("user == [" + user + "]");
		System.out.println("password == [" + password + "]");


		// ドライバ・クラスのロード
		Class<?> driverClass = null;
		try {
			driverClass = Class.forName(driver);
			System.out.println("@driver loaded");
		} catch (ClassNotFoundException e) {
			String msg = "ドライバ・クラスのロードに失敗しました。";
			System.out.println(msg);
		}

		// DB接続
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("@connection opened");
		} catch (SQLException e) {
			e.printStackTrace();
			//H2はブラウザからDB開いていると、アプリで接続エラーとなる
			String msg = "DB接続確立時にエラーが発生しました。" + e.getMessage();
			System.out.println(msg);
		}
		return connection;
	}

}
