package com.order.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @Author TangXin
 * @Date 2023-03-12 9:36
 * @Description
 */
@Aspect
@Component
public class OperAroundLogAspect {

    @Pointcut("@annotation(com.order.aspect.OperAroundLog)")
    public void operAroundPointCut(){}

    @Around("operAroundPointCut()")
    public void AroundAdvice(ProceedingJoinPoint point){
        System.out.println("进入环绕通知");
        try {

            // 从切面织入点处通过反射机制获取织入点处的方法
            MethodSignature signature = (MethodSignature) point.getSignature();
            // 获取切入点所在的方法
            Method method = signature.getMethod();

            // 注解参数
            OperAroundLog opLog = method.getAnnotation(OperAroundLog.class);


            HttpServletRequest request = RequestUtils.getHttpServletRequest();
            String url = request.getRequestURI();
            System.out.println("请求URL:"+url+",来源IP:"+ RequestUtils.getIp(request));
            Object[] args = point.getArgs();
            //获取参数名称和值
            MethodSignature methodSignature = (MethodSignature)point.getSignature();
            String[] parameterNames = methodSignature.getParameterNames();

            //1.获取用户行为日志(ip,username,operation,method,params,time,createdTime)
            //获取类的字节码对象，通过字节码对象获取方法信息
            Class<?> targetCls=point.getTarget().getClass();
            //获取方法签名(通过此签名获取目标方法信息)
            MethodSignature ms=(MethodSignature)point.getSignature();
            //获取目标方法上的注解指定的操作名称
            Method targetMethod=
                    targetCls.getDeclaredMethod(
                            ms.getName(),
                            ms.getParameterTypes());

            System.out.println("targetMethod="+targetMethod);
            //获取目标方法名(目标类型+方法名)
            String targetClsName=targetCls.getName();
            String targetObjectMethodName=targetClsName+"."+ms.getName();
            //获取请求参数
            String targetMethodParams= Arrays.toString(point.getArgs());

            point.proceed();
            System.out.println("环绕通知记录目标方法执行结束");
        } catch (Throwable throwable) {
            System.out.println("环绕通知执行目标方法异常");
            throwable.printStackTrace();
        }
    }
}
