package com.krnzft.restful.api.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krnzft.restful.api.dto.PriceRequest;
import com.krnzft.restful.api.dto.PriceResponse;
import com.krnzft.restful.api.model.Price;
import com.krnzft.restful.api.repository.PriceRepository;
import com.krnzft.restful.api.util.DatesUtil;

@Service
public class PriceService {
	
	@Autowired
	private DatesUtil datesUtil;
	@Autowired
	private PriceRepository priceRepository;

	public List<PriceResponse> searchCurrentPrice(PriceRequest request) throws ParseException {
		Date appDate = datesUtil.parseDate(request.getApplicationDate());
		List<Price> prices = priceRepository.findByCurrentPriceData(appDate, request.getProductId(), request.getBrandId());
		List<PriceResponse> responses = prices.stream().map(price -> 
			new PriceResponse(price.getProductId(), price.getBrandId(), price.getPriceList(),
					datesUtil.formatDate(price.getStartDate()), datesUtil.formatDate(price.getEndDate()),
					price.getPrice())).collect(Collectors.toList());
		return responses;
	}
}
