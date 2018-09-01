package com.ams.work210;

import java.math.BigDecimal;

/**
 * 商品レコードクラス
 * @author Myamagishi
 *
 */
public class ProductBean {
	/**
	 * 商品コード
	 */
	private String code;

	/**
	 * 商品名
	 */
	private String name;

	/**
	 * 売価
	 */
	private BigDecimal price;

	/**
	 * コンストラクタ
	 */
	public ProductBean(){};

	/**
	 * コンストラクタ
	 * @param code 商品コード
	 * @param name 商品名
	 * @param price 売価
	 */
	public ProductBean(String code, String name, BigDecimal price){
		setCode(code);
		setName(name);
		setPrice(price);
	}

	/**
	 * 商品コードを取得
	 * @return 商品コード
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 商品コードを設定
	 * @param code 商品コード
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 商品名を取得
	 * @return 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品名を設定
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 売価を設定
	 * @return 売価
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 売価を取得
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 商品コードクラス情報を文字列で返却
	 */
	public String toString(){
		return " code == " + code + " name == " + name +  " price == " + price;
	}

	/**
	 * 商品コードクラス情報を表示
	 */
	public void show(){
		System.out.println(toString());
	}

}
