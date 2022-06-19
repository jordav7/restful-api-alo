package com.krnzft.restful.api.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.krnzft.restful.api.dto.PriceResponse;
import com.krnzft.restful.api.model.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

	/**
	 * Obtiene los datos del producto solicitado usando la desambiguaci&oacute;n por prioridad
	 * @param appDate fecha del producto a buscar
	 * @param productId id el producto
	 * @param brandId id de la cadena del producto a buscar
	 * @return Los datos del producto o productos encontrados
	 */
	@Query("select new com.krnzft.restful.api.dto.PriceResponse(p.productId,p.brandId,p.priceList,p.startDate,p.endDate,p.price,max(p.priority)) from Price p "
			+ "where :currdate between p.startDate and p.endDate and p.productId=:productId and p.brandId=:brandId "
			+ "group by p.brandId,p.productId,p.priceList,p.startDate,p.endDate,p.price "
			+ "having max(p.priority)=(select max(p.priority) as priority from Price p where :currdate between p.startDate and p.endDate and p.productId=:productId and p.brandId=:brandId)")
	List<PriceResponse> findByCurrentPriceData(@Param("currdate") LocalDateTime appDate, @Param("productId") Long productId, @Param("brandId") Long brandId);
	
}
