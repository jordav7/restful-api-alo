package com.krnzft.restful.api.dto;

import static com.krnzft.restful.api.util.Constants.FORMAT_DATE;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class PriceResponse {

	private Long productId;
	private Long brandId;
	private Long priceList;
	@DateTimeFormat(pattern = FORMAT_DATE)
	@JsonFormat(pattern = FORMAT_DATE)
	private LocalDateTime startDate;
	@DateTimeFormat(pattern = FORMAT_DATE)
	@JsonFormat(pattern = FORMAT_DATE)
	private LocalDateTime endDate;
	private BigDecimal price;
	@JsonIgnore
	private Long priority;
	
	public PriceResponse() {
		super();
	}
	public PriceResponse(Long productId, Long brandId, Long priceList, LocalDateTime startDate, LocalDateTime endDate,
			BigDecimal price, Long priority) {
		super();
		this.productId = productId;
		this.brandId = brandId;
		this.priceList = priceList;
		this.startDate = startDate;
		this.endDate = endDate;
		this.price = price;
		this.priority = priority;
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
	public Long getPriceList() {
		return priceList;
	}
	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Long getPriority() {
		return priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}
}
