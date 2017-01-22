package com.toney.aspectjlearn.custom.runtime;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by toney on 2017/1/20.
 * 打印方法执行时间
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface MethodRunTime {
}
