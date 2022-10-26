package hui.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/* 1-4 编写ProjectContainerInitConfig类 */
public class ProjectContainerInitConfig extends AbstractDispatcherServletInitializer {
    /* 1-4-1 在ProjectContainerInitConfig配置类中返回SpringMVC容器对象 */
    /**
     * 加载SpringMVC容器对象
     * @return SpringMVC容器对象
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    /**
     * 设置归属SpringMVC容器处理的请求,
     * @return String[]{"/"}, 所有的请求都使用SpringMVC处理
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 加载Spring_IoC容器的配置, 暂时不使用
     * @return null
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
