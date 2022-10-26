package hui.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/* 1-3 编写ProjectContainerInitConfig配置类 */
public class ProjectContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    /* 1-3-1 在服务器中加载Spring容器(IoC)对象 */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /* 1-3-2 在服务器中加载SpringMVC容器对象 */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
