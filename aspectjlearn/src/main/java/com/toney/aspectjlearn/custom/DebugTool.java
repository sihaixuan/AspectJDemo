package com.toney.aspectjlearn.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by toney on 2017/1/20.
 * 自定义AOP 注解
 */

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface DebugTool {
}
