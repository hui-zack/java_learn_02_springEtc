package hui.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.aspectj.annotation.*;
import org.springframework.stereotype.Component;

@Component                              // 类添加到spring-LoC容器
@Aspect                                 /* 1-2 指定为AOP类 */
public class MyAdvice {
    /* 1-3 @Pointcut("")注解定义切入点 */
    @Pointcut("execution(void hui.dao.impl.BookDaoImpl.update(..))")
    private void pointCut1(){}

    /* 1-4-1 @Before()前置通知 */
    @Before("pointCut1()")
    public void before(){
        System.out.println("前置通知-@before");
    }

    /* 1-4-2 @After()后置通知 */
    @After("pointCut1()")
    public void after(){

        System.out.println("后置通知-@after");
    }

    @Pointcut("execution(int hui.dao.BookDao.testRunTime())")
    private void pointCut2(){}

    /* 1-4-3 @Around()环绕通知 */
    @Around("pointCut2()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object proceed = pjp.proceed();// 对切入代码的调用

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("执行一万次消耗时间: " + totalTime + "ms");

        return proceed;
    }

    /* 1-4-4 @AfterReturning()原代码return后通知 */
    @AfterReturning("pointCut2()")
    public void afterReturning(){
        System.out.println("return后通知 - @afterReturning");
    }

    /* 1-4-5  @AfterThrowing()出异常后通知 */
    @AfterThrowing("pointCut2()")
    public void afterThrowing() {
        System.out.println("异常后通知 - @@AfterThrowing()");
    }
}
