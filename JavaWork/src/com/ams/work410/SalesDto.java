package com.ams.work410;

import java.math.BigDecimal;
import java.util.Date;

public class SalesDto {
	/**
	 * 取引番号
	 */
	private int tranNo;

	/**
	 * 取引日
	 */
	private Date tranDate;

	/**
	 * 明細番号
	 */
	private int detailNo;

	/**
	 * 商品コード
	 */
	private String itemCd;

	/**
	 * 商品名
	 */
	private String itemName;

	/**
	 * 数量
	 */
	private BigDecimal qty;

	/**
	 * 単価
	 */
	private BigDecimal price;

	/**
	 * 金額
	 */
	private BigDecimal amount;

	/**
	 * コンストラクタ
	 */
	public SalesDto() {
	};

	/**
	 * コンストラクタ
	 *
	 * @param tranNo
	 *            取引番号
	 * @param tranDate
	 *            取引日
	 * @param detailNo
	 *            明細番号
	 * @param itemCd
	 *            商品コード
	 * @param itemName
	 *            商品名
	 * @param qty
	 *            数量
	 * @param price
	 *            単価
	 * @param amount
	 *            金額
	 */
	public SalesDto(int tranNo,Date tranDate,int detailNo,String itemCd, String itemName,BigDecimal qty, BigDecimal price, BigDecimal amount) {
		this.tranNo = tranNo;
		this.tranDate = tranDate;
		this.detailNo = detailNo;
		this.itemCd = itemCd;
		this.itemName = itemName;
		this.qty = qty;
		this.price = price;
		this.amount = amount;
	}

	/**
	 * 取引番号を取得
	 *
	 * @return tranNo
	 * 				取引日
	 */
	public int getTranNo() {
		return tranNo;
	}

	/**
	 * 取引番号を設定
	 *
	 * @return 取引番号
	 */
	public void setTranNo(int tranNo) {
		this.tranNo = tranNo;
	}

	/**
	 * 取引日を取得
	 *
	 * @return tranDate
	 * 				取引日
	 */
	public Date getTranDate() {
		return tranDate;
	}

	/**
	 * 取引日を設定
	 *
	 * @return 取引日
	 */
	public void setTranDate(Date tranDate) {
		this.tranDate = tranDate;
	}

	/**
	 * 明細番号を取得
	 *
	 * @return detailNo
	 * 				明細番号
	 */
	public int getDetailNo() {
		return detailNo;
	}

	/**
	 * 明細番号を設定
	 *
	 * @return 明細番号
	 */
	public void setDetailNo(int detailNo) {
		this.detailNo = detailNo;
	}

	/**
	 * 商品コードを取得
	 *
	 * @param itemCd
	 *            商品コード
	 */
	public String getItemCd() {
		return itemCd;
	}

	/**
	 * 商品コードを設定
	 *
	 * @param code
	 *            商品コード
	 */
	public void setItemCd(String itemCd) {
		this.itemCd = itemCd;
	}

	/**
	 * 商品名を取得
	 *
	 * @return 商品名
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 商品名を設定
	 *
	 * @param itemname
	 *            商品名
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 数量を設定
	 *
	 * @return 売価
	 */
	public BigDecimal getQty() {
		return qty;
	}

	/**
	 * 数量を取得
	 *
	 * @param price
	 */
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	/**
	 * 単価を設定
	 *
	 * @return 単価
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * 単価を取得
	 *
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 価格を設定
	 *
	 * @return 価格
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * 価格を取得
	 *
	 * @param amount
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
