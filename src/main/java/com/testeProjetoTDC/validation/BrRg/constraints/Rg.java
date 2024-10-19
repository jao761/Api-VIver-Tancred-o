package com.testeProjetoTDC.validation.BrRg.constraints;

import com.testeProjetoTDC.validation.BrRg.RgValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = RgValidation.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Rg {

    String message() default "Rg Invalido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[]  payload() default {};

}
