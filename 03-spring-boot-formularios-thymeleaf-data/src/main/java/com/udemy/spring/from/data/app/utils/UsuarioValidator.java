package com.udemy.spring.from.data.app.utils;

import com.udemy.spring.from.data.app.models.domain.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UsuarioValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        // Indica que solo se va a validar la clase de tipo Usuario
        return Usuario.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Creas el objeto  a validar
        Usuario usuario= (Usuario) target;
        // valida campo
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"nombre","NotEmpty.usuario.nombre");
        if (!usuario.getId().matches("[0-9]{2}[.][\\\\d]{3}[-][A-Z]{1}")){
                errors.rejectValue("id","pattern.usuario.id");
        }
    }
}
