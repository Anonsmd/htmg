package com.zstu.htmg.api;

import java.lang.annotation.*;

/**
 * @Author: Anonsmd
 * @Date: 2020/2/10 12:36
 */
@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented //生成文档
public @interface MyCalLog {
    String Type() default "";
    boolean IsDefault() default false;
}