package com.SpringBoot.aop_project.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidateAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValidateAspect.class);

    @Around("execution(* com.SpringBoot.aop_project.service.jobService.*(..)) && args(postId)")
    public Object validateMethod(ProceedingJoinPoint proceedingJoinPoint, int postId) throws Throwable {

     if(postId < 0)
     {
         LOGGER.info("PostId is negative, updating it.");
         postId = -postId;
         LOGGER.info("new value: " + postId);
     }

        return proceedingJoinPoint.proceed(new Object[]{postId});
    }
}
