package cn.edu.gdut.zaoying.Option.toolbox.iconStyle.normal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface BorderWidthNumber {
    double value() default 0;
}