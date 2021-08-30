package com.udemy.spring.from.data.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

public class RequeridoValidation implements ConstraintValidator<Requerido, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		//if (value == null || value.isEmpty() || value.isBlank()) {
		//---se valida con una utleria de spring
		if (value == null || !StringUtils.hasText(value)) {
			return false;
		}
		return true;
	}

}
