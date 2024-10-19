package com.testeProjetoTDC.validation.Nome;

import com.testeProjetoTDC.validation.BrRg.constraints.Rg;
import com.testeProjetoTDC.validation.Nome.constraints.Nome;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraints.Pattern;

public class NomeValidation implements ConstraintValidator<Nome, String> {

    @Override
    public void initialize(Nome z       ) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String  nome  = value == null ? "" : value;
        return nome.matches( "^[A-Z]+(.)*");
    }

}
