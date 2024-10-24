package com.ycraah.springboot241023;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.passay.PasswordValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordRuleValidator.class)
public @interface Password {
  String message() default "패스워드 규칙에 부합하지 않습니다";
  Class<?>[] groups() default {};
  Class<? extends Payload>[] payload() default {};
}
