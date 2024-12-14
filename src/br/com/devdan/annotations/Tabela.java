package br.com.devdan.annotations;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Tabela {
    String value();

    long[] dimension() default {};
}
