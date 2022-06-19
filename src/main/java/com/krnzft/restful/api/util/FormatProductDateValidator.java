package com.krnzft.restful.api.util;

import static com.krnzft.restful.api.util.Constants.FORMAT_DATE;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FormatProductDateValidator implements ConstraintValidator<FormatProductDateConstraint, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean resp = false;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_DATE); 
			LocalDateTime.parse(value, formatter);
			resp = true;
		} catch (Exception e) {
			resp = false;
		}
		return resp;
	}

}
