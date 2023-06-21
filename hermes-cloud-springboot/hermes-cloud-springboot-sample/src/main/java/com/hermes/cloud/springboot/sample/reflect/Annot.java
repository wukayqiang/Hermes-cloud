package com.hermes.cloud.springboot.sample.reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Annot {
    String type() default "";


}
