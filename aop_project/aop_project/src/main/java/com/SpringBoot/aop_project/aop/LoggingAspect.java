package com.SpringBoot.aop_project.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.SpringBoot.aop_project.service.jobService.*(..))")  // advice(pointcut)
    public void loggingData(JoinPoint joinPoint)   // target a particular method(joinPoint).
    {
        LOGGER.info("Method called {}", joinPoint.getSignature().getName());
    }

    @After("execution(* com.SpringBoot.aop_project.service.jobService.*(..))")
    public void logMethodExecuted(JoinPoint joinPoint)
    {
        LOGGER.info("Method executed {}", joinPoint.getSignature().getName());
    }

    @AfterThrowing("execution(* com.SpringBoot.aop_project.service.jobService.*(..))")
    public void logMethodExecutedThrow(JoinPoint joinPoint)
    {
        LOGGER.info("Exception occur: {}", joinPoint.getSignature().getName());
    }

    @AfterReturning("execution(* com.SpringBoot.aop_project.service.jobService.*(..))")
    public void logMethodExecuteReturning(JoinPoint joinPoint)
    {
        LOGGER.info("Method Executed Successfully: {}", joinPoint.getSignature().getName());
    }


}
