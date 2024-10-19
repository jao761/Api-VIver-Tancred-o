package com.testeProjetoTDC.validation.telefone;

import com.testeProjetoTDC.validation.telefone.constraints.Telefone;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class TelefoneValidation implements ConstraintValidator<Telefone, String> {

    @Override
    public void initialize(Telefone tconstraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String  nome  = value == null ? "" : value;
        return nome.matches("\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}");
    }

}
