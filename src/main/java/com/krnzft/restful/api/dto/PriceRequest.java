package com.krnzft.restful.api.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.krnzft.restful.api.util.FormatProductDateConstraint;

public class PriceRequest {

	@NotBlank
	@FormatProductDateConstraint
	private String applicationDate;
	@NotNull
	private Long productId;
	@NotNull
	private Long brandId;
	
	public PriceRequest() {
		super();
	}
	public PriceRequest(String applicationDate, Long productId, Long brandId) {
		super();
		this.applicationDate = applicationDate;
		this.productId = productId;
		this.brandId = brandId;
	}
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
