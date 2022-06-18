package com.krnzft.restful.api.dto;

import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

public class PriceRequest {

	@NotBlank
	private String applicationDate;
	@NonNull
	private Long productId;
	@NonNull
	private Long brandId;
	
	public String getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getBrandId() {
		return brandId;
	}
	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
}
