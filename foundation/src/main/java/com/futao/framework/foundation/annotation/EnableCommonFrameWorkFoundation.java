package com.futao.framework.foundation.annotation;

import com.futao.framework.foundation.annotation.impl.FrameworkConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用CommonFrameWorkFoundation组件
 *
 * @author futao
 * Created on 2019-04-30.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
//TODO 直接@ComponentScan无效，必须通过@Import一个类的形式才行
@Import({FrameworkConfiguration.class})
public @interface EnableCommonFrameWorkFoundation {
}