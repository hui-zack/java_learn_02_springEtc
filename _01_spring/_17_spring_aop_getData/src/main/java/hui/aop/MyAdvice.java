package hui.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

@Component                              // 类添加到spring-LoC容器
@Aspect                                 /* 指定为AOP类 */
public class MyAdvice {
    @Pointcut("execution(* hui.dao.BookDao.update(..))")
    public void pointCut(){}


    @After("pointCut()")
    public void before(JoinPoint jp){
        /* 1-1-1 通知中获取原行数的参数-@before和@After */
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
    }

    @Pointcut("execution(* hui.dao.BookDao.select(..))")
    public void pointCut2(){}
    @Around("pointCut2()")
    public Object select(ProceedingJoinPoint pjp) throws Throwable {

        Object[] args = pjp.getArgs();              /* 1-1-2 @Around 通知中获取原行数的参数-@Around */
        args[0] = 666;                              // 在通知中对原参数进行修改

        Object proceed = pjp.proceed(args);         /* 1-2 通知中获取原行数的返回值-非@AfterReturning */
        System.out.println("aop获取参数: " + Arrays.toString(args));
        System.out.println("aop获取返回值: " + proceed);

        return proceed;
    }

    @Pointcut("execution(* hui.dao.BookDao.delete(..))")
    public void pointCut3(){}

    /* 1-3 通知中获取原函数的返回值-@AfterReturning */
    @AfterReturning(value = "pointCut3()", returning = "ret")
    public void getReturnDataOfAfterReturning(JoinPoint pjp, Object ret){       // Object ret参数用于接收原函数返回值

        Object[] args = pjp.getArgs();
        System.out.println("aop获取参数: " + Arrays.toString(args));
        System.out.println("aop获取返回值: " + ret);
    }

    @Pointcut("execution(* hui.dao.BookDao.testRunTime(..))")
    public void pointCut4(){}

    /* 1-4 通知中获取原函数的异常类型 */
    @AfterThrowing(value = "pointCut4()", throwing = "th")
    public void afterThrowing(Throwable th){
        System.out.println("aop获取异常类型: " + th);
    }
}
