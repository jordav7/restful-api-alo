package com.krnzft.restful.api.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krnzft.restful.api.dto.PriceRequest;
import com.krnzft.restful.api.dto.PriceResponse;
import com.krnzft.restful.api.repository.PriceRepository;
import com.krnzft.restful.api.util.DatesUtil;

/**
 * Componente que gestiona la llamada a los repositorios
 * @author David
 *
 */
@Service
public class PriceService {
	
	@Autowired
	private DatesUtil datesUtil;
	@Autowired
	private PriceRepository priceRepository;

	/**
	 * busca el producto en base a los datos enviados
	 * @param objeto que contiene los datos de la petición
	 * @return la lista de productos
	 */
	public List<PriceResponse> searchCurrentPrice(PriceRequest request) {
		LocalDateTime appDate = datesUtil.parseDate(request.getApplicationDate());
		List<PriceResponse> prices = priceRepository.findByCurrentPriceData(appDate, request.getProductId(), request.getBrandId());
		return prices;
	}
}
