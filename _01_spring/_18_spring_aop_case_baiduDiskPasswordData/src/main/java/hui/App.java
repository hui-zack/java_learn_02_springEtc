package hui;

import hui.config.SpringConfig;
import hui.service.ResourceService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean verifyResult = resourceService.openUrl("123", " root ");
        System.out.println("verifyResult = " + verifyResult);
    }
}
