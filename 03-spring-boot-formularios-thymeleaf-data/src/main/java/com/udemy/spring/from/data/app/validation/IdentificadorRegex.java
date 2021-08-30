package com.udemy.spring.from.data.app.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = IdentificadorRegexValidation.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
/**
 * 
 * @author pablo
 * anotacion para implementar Validación personalizada usando anotaciones
 */
public @interface IdentificadorRegex {
	String message() default "Identificador inválido";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
