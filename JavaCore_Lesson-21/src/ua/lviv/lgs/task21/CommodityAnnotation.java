package ua.lviv.lgs.task21;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommodityAnnotation {
	String value() default "";
}
