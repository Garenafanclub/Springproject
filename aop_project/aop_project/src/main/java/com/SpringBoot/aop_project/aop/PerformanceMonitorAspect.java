package com.SpringBoot.aop_project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitorAspect {


    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceMonitorAspect.class);


    @Around("execution(* com.SpringBoot.aop_project.service.jobService.*(..))")
    public Object monitorTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        Object object = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        LOGGER.info("Time Taken by the {}",proceedingJoinPoint.getSignature().getName() + " " + (end - start));
        return object;
    }             // Telusko....

}
