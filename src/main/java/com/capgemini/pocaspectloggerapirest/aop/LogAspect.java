package com.capgemini.pocaspectloggerapirest.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class LogAspect {

    private static final Logger LOGGER = 
    LoggerFactory.getLogger(LogAspect.class);

    // @Pointcut("within(com.capgemini.pocaspectloggerapirest.api.rest..*)"
    //           + "|| @annotation(com.capgemini.pocaspectloggerapirest.aop.annotation.LogAround)")
    @Pointcut("within(com.capgemini.pocaspectloggerapirest.api.rest.ClientRestController)")
    public void restPackagePointcut() {
        // Method is empty as this is just a Pointcut,
        // the implementations are in the advices.
    }

    @Pointcut("@annotation(com.capgemini.pocaspectloggerapirest.aop.annotation.LogAround)")
    public void restAnnotationPointcut() {
        // Method is empty as this is just a Pointcut,
        // the implementations are in the advices.
    }

    @Around("restPackagePointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("This log is printed because this call come from the package/class specified in the pointcut");
        LOGGER.info("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        Object result = joinPoint.proceed();
        LOGGER.info("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), result);
        return result;

    }

    @Around("restAnnotationPointcut()")
    public Object logAroundAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("This log is printed thanks to the LogAround annotation");
        LOGGER.info("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
        Object result = joinPoint.proceed();
        LOGGER.info("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), result);
        return result;

    }
}
