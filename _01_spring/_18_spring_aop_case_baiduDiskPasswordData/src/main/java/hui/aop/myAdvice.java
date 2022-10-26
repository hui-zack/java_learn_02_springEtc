package hui.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myAdvice {
    @Pointcut("execution(* hui.service.ResourceService.openUrl(..))")
    public void openUrlPointCut(){}

    @Around("openUrlPointCut()")
    public boolean clearStringSpace(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i = 0; i < args.length; i++){
            if (args[i].getClass().equals(String.class)){
                args[i] = args[i].toString().trim();
            }
        }
        Object proceed = pjp.proceed(args);
        return (boolean) proceed;
    }
}
