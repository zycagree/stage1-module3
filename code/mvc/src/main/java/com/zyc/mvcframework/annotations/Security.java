package com.zyc.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * @author zhangyongchao
 * @date 2020/5/13 14:53
 * @description
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Security {
    String[] value() default {};
}
