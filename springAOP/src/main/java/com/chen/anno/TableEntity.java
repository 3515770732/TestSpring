package com.chen.anno;

import java.lang.annotation.*;

/**
 * @description:
 * @author:
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TableEntity {
    public String value() default "";
}
