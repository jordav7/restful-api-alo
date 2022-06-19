package com.krnzft.restful.api.util;

import static com.krnzft.restful.api.util.Constants.FORMAT_DATE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;
/**
 * Maneja utilitarios de fechas
 * @author David Cruz
 *
 */
@Component
public class DatesUtil {

	public LocalDateTime parseDate(String formatDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE); 
		LocalDateTime dateTime = LocalDateTime.parse(formatDate, formatter);
		return dateTime;
	}
	
}
