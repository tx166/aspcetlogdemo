package com.order.aspect;

import java.lang.annotation.*;

/**
 * @Author TangXin
 * @Date 2023-03-12 9:29
 * @Description
 */
@Target(ElementType.METHOD) //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented
public @interface OperAroundLog {

}
