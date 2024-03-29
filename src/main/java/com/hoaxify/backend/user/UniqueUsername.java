package com.hoaxify.backend.user;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ FIELD })
@Retention(RUNTIME)
@Constraint(validatedBy = { UniquUsernameValidator.class})
public @interface UniqueUsername {
    String message() default "{hoaxify.constraint.username.uniqueusername.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
