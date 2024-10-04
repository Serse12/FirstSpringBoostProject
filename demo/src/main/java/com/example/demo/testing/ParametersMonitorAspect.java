package com.example.demo.testing;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ParametersMonitorAspect {
    @Around("@annotation(ParametersMonitor)")
    public Object logTime(ProceedingJoinPoint joinPoint) throws
            Throwable {
        System.out.println(String.format("Called Function: %s",
                joinPoint.getSignature().getName()));
        System.out.println(String.format("Arguments: %s",
                Arrays.toString(joinPoint.getArgs())));
        Object proceed = joinPoint.proceed();
        System.out.println(String.format("Return time: %s",
                ((MethodSignature)(joinPoint.getSignature())).getReturnType()));
        return proceed;
    }
}
