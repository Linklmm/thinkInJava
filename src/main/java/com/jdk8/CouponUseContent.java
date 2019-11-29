package com.jdk8;


/**
 * @Description: 优惠券使用说明对象
 * @Author: 刘敏敏(minmin.liu @ ucarinc.com)
 * @Date: 2019-11-27 11:28
 * @Version: 1.0
 */
public class CouponUseContent {
	/**
	 * 使用说明标题
	 */
	private String useTitle;
	/**
	 * 使用说明描述
	 */
	private String useDesc;

	public String getUseTitle() {
		return useTitle;
	}

	public void setUseTitle(String useTitle) {
		this.useTitle = useTitle;
	}

	public String getUseDesc() {
		return useDesc;
	}

	public void setUseDesc(String useDesc) {
		this.useDesc = useDesc;
	}

	@Override
	public String toString() {
		return "CouponUseContent{" +
				"useTitle='" + useTitle + '\'' +
				", useDesc='" + useDesc + '\'' +
				'}';
	}

}
