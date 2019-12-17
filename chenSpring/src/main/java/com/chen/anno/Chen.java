package com.chen.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/**
 * @description:
 * @author:
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Chen {
    public String value() default "";
}
