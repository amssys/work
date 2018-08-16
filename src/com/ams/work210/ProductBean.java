package com.ams.work210;

import java.math.BigDecimal;

/**
 * ���i���R�[�h�N���X
 * @author Myamagishi
 *
 */
public class ProductBean {
	/**
	 * ���i�R�[�h
	 */
	private String code;
	
	/**
	 * ���i��
	 */
	private String name;
	
	/**
	 * ����
	 */
	private BigDecimal price;
	
	/**
	 * �R���X�g���N�^
	 */
	public ProductBean(){};
	
	/**
	 * �R���X�g���N�^
	 * @param code ���i�R�[�h
	 * @param name ���i��
	 * @param price ����
	 */
	public ProductBean(String code, String name, BigDecimal price){
		
	}
	
	/**
	 * ���i�R�[�h���擾
	 * @return ���i�R�[�h
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * ���i�R�[�h��ݒ�
	 * @param code ���i�R�[�h
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * ���i�����擾
	 * @return ���i��
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ���i����ݒ�
	 * @param name ���i��
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ������ݒ�
	 * @return�@����
	 */
	public BigDecimal getPrice() {
		return price;
	}
	
	/**
	 * �������擾
	 * @param price
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	/**
	 * ���i�R�[�h�N���X���𕶎���ŕԋp
	 */
	public String toString(){
		return "code == " + code + " name == " + name +  " price == " + price;
	}
	
	/**
	 * ���i�R�[�h�N���X����\��
	 */
	public void show(){
		System.out.println(toString());
	}

}
