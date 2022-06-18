package com.krnzft.restful.api.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.krnzft.restful.api.model.Price;

@Repository
public interface PriceRepository extends JpaRepository<Price, Long> {

	@Query("select p from Price p where :currdate between p.startDate and p.endDate and p.productId=:productId and p.brandId=:brandId")
	List<Price> findByCurrentPriceData(@Param("currdate") Date appDate, @Param("productId") Long productId, @Param("brandId") Long brandId);
	
}
