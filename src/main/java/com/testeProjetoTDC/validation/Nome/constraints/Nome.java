package com.testeProjetoTDC.validation.Nome.constraints;

import com.testeProjetoTDC.validation.Nome.NomeValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NomeValidation.class)
@Target( {ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Nome {

    String message() default "Nome Invalido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]  payload() default {};


}
