package com.krnzft.restful.api.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

/**
 * Maneja utilitarios de fechas
 * @author David Cruz
 *
 */
@Component
public class DatesUtil {

	private static final String FORMAT_DATE = "yyyy-MM-dd-HH.mm.ss";
	public Date parseDate(String formatDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
		return sdf.parse(formatDate);
	}
	
	public String formatDate(Date parseDate) {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_DATE);
		return sdf.format(parseDate);
	}
}
