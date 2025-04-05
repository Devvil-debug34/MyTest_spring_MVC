package com.zaurtregulov.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String enterValue
            , ConstraintValidatorContext constraintValidatorContext) {
        return enterValue.endsWith(endOfEmail);
    }
}
