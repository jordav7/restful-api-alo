package com.krnzft.restful.api.model;

import static com.krnzft.restful.api.util.Constants.FORMAT_DATE;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name = "prices")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "brand_id")
	@NotNull
	private Long brandId;
	
	@Column(name = "start_date")
	@DateTimeFormat(pattern = FORMAT_DATE)
	@JsonFormat(pattern = FORMAT_DATE)
	@NotNull
	private LocalDateTime startDate;
	
	@Column(name = "end_date")
	@DateTimeFormat(pattern = FORMAT_DATE)
	@JsonFormat(pattern = FORMAT_DATE)
	@NotNull
	private LocalDateTime endDate;
	
	@Column(name = "price_list")
	@NotNull
	private Long priceList;
	
	@Column(name = "product_id")
	@NotNull
	private Long productId;
	
	@NotNull
	private Long priority;
	
	@NotNull
	private BigDecimal price;
	
	@NotBlank
	private String currency;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
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

	public Long getPriceList() {
		return priceList;
	}

	public void setPriceList(Long priceList) {
		this.priceList = priceList;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
