package com.chen.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description:
 * @author:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Chen {
    public String value() default "";
}
