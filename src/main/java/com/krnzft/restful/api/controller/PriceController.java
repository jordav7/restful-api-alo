package com.krnzft.restful.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krnzft.restful.api.dto.PriceRequest;
import com.krnzft.restful.api.dto.PriceResponse;
import com.krnzft.restful.api.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController {

	@Autowired
	private PriceService priceService;
	
	@PostMapping("/currentPrice")
	public ResponseEntity<List<PriceResponse>> searchCurrentPrice(@Valid @RequestBody PriceRequest request) {
		ResponseEntity<List<PriceResponse>> response = null;
		response = ResponseEntity.ok(priceService.searchCurrentPrice(request));
		return response;
	}
}
