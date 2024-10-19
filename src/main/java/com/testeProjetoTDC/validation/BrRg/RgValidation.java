package com.testeProjetoTDC.validation.BrRg;

import com.testeProjetoTDC.validation.BrRg.constraints.Rg;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RgValidation implements ConstraintValidator<Rg, String> {
    @Override
    public void initialize(Rg constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // RG nulo ou vazio é considerado inválido
        if (value == null || value.trim().isEmpty()) {
            return false;
        }

        // Remover caracteres não numéricos
        String rg = value.replaceAll("[^\\d]", "");

        // Verificar se o RG tem exatamente 9 dígitos
        if (rg.length() != 9) {
            return false;
        }

        // Separar o número base (primeiros 8 dígitos) e o dígito verificador
        String numeroBase = rg.substring(0, 8);
        char digitoVerificador = rg.charAt(8);

        // Definir os pesos usados no cálculo do dígito verificador
        int[] pesos = {9, 8, 7, 6, 5, 4, 3, 2};
        int soma = 0;

        // Calcular a soma ponderada dos dígitos
        for (int i = 0; i < numeroBase.length(); i++) {
            int digito = Character.getNumericValue(numeroBase.charAt(i));
            soma += digito * pesos[i];
        }

        // Calcular o resto da divisão por 11
        int resto = soma % 11;

        // Verificar se o dígito verificador calculado é 'X' ou um número
        char digitoCalculado = (resto == 10) ? 'X' : Character.forDigit(resto, 10);

        // Retornar verdadeiro se o dígito verificador for igual ao calculado
        return digitoVerificador == digitoCalculado;
    }
}
