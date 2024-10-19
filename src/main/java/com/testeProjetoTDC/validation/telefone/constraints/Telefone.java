package com.testeProjetoTDC.validation.telefone.constraints;

import com.testeProjetoTDC.validation.telefone.TelefoneValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = TelefoneValidation.class)
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Telefone {

    String message() default "Número de telefone inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
