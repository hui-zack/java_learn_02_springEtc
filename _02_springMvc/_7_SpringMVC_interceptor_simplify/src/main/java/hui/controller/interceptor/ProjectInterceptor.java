package hui.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* 1-1 表现层编写拦截器Bean-所属包需要被扫描 */
@Component
public class ProjectInterceptor implements HandlerInterceptor {
    /* 1-1-1 自定义Controller方法运行前拦截 */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;
    }
    /* 1-1-2 自定义Controller方法运行后拦截 */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");

    }

    /* 1-1-3 自定义Controller方法运行后+postHandle后拦截 */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
