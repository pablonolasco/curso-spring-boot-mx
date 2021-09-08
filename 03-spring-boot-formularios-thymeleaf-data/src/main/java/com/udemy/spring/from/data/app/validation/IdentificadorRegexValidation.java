package com.udemy.spring.from.data.app.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
/**
 * 
 * @author pablo
 * Class creada para implementar Validación personalizada
 */
public class IdentificadorRegexValidation implements ConstraintValidator<IdentificadorRegex, String>{

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if (value.matches("[0-9]{2}[.][\\d]{3}[-][A-Z]{1}")) {
			return true;
		}
		return false;
	}

}
