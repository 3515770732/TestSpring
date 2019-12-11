package com.chen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author:
 */
@Configuration
@ComponentScan("com.chen")
//@EnableAspectJAutoProxy(proxyTargetClass=true)
@EnableAspectJAutoProxy
public class SpringAOPConfig {


}
