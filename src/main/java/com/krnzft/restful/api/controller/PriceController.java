package com.krnzft.restful.api.controller;

import java.text.ParseException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krnzft.restful.api.dto.PriceRequest;
import com.krnzft.restful.api.service.PriceService;

@RestController
@RequestMapping("/api/price")
public class PriceController {

	@Autowired
	private PriceService priceService;
	
	@PostMapping("/currentPrice")
	public ResponseEntity<?> searchCurrentPrice(@Valid @RequestBody PriceRequest request) {
		ResponseEntity<?> response = null;
		try {
			response = ResponseEntity.ok(priceService.searchCurrentPrice(request));
		} catch (ParseException e) {
			response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		return response;
	}
}
