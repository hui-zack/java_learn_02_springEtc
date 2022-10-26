import dao.BeanDao;
import dao.BeanLifeCycleDao;
import factory.FactoryBean__NoStatic;
import factory.NoStaticBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BookService;


public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /* 注册关闭钩子 */
        ctx.registerShutdownHook();         //设置LoC在jvm虚拟机close前自动关闭


        /* 1-2 bean.name属性: 给对象起别名, getBean方法根据别别名获取对象 */
        System.out.println("\n\n----");
        BookService service = (BookService) ctx.getBean("service");
        service.save();
        System.out.println();

        /* 2-2 测试单例Bean对象的地址 */
        BookService singletonService1 = (BookService) ctx.getBean("singletonService");
        System.out.println("[main-单例bean] - 对象地址 - singletonService1.addr = " + singletonService1);
        BookService singletonService2 = (BookService) ctx.getBean("singletonService");
        System.out.println("[main-单例bean] - 对象地址 - singletonService2.addr = " + singletonService2);
        System.out.println();

        /* 3-2 测试多例Bean对象的地址 */
        BookService prototypeService1 = (BookService) ctx.getBean("prototypeService");
        System.out.println("[main-多例Bean] - 对象地址 - prototypeService1.addr = " + prototypeService1);
        BookService prototypeService2 = (BookService) ctx.getBean("prototypeService");
        System.out.println("[main-多例Bean] - 对象地址 - prototypeService2.addr = " + prototypeService2);
        System.out.println();

        /* 4-2 获取无参构造直接创建的Bean对象 */
        BeanDao constructBean = (BeanDao) ctx.getBean("constructBean");
        constructBean.save();
        System.out.println();

        /* 5-3 使用静态工厂获取对象 */
        BeanDao staticFactoryBeanDao = (BeanDao) ctx.getBean("staticBeanFactory");
        staticFactoryBeanDao.save();
        System.out.println();

        /* 6-3 使用实例工厂获取对象 */
        // 方式一
        NoStaticBeanFactory noStaticBeanFactory = (NoStaticBeanFactory) ctx.getBean("noStaticBeanFactory");
        BeanDao noStaticBeanFactoryBeanDao = noStaticBeanFactory.getBeanDao();
        noStaticBeanFactoryBeanDao.save();
        System.out.println();

        // 方式二
        BeanDao noStaticFactoryBean = (BeanDao) ctx.getBean("noStaticFactoryBean");
        noStaticFactoryBean.save();
        System.out.println();

        /* 7-3 使用FactoryBean获取对象 */
        BeanDao beanDao = (BeanDao) ctx.getBean("BeanDao");
        BeanDao beanDao1 = (BeanDao) ctx.getBean("BeanDao");
        BeanDao beanDao2 = (BeanDao) ctx.getBean("BeanDao");
        System.out.println(beanDao);
        System.out.println(beanDao1);
        System.out.println(beanDao2 + "\n");

        /* 8-2 配置实现bean的生命周期 */
        BeanLifeCycleDao beanLifeCycleDao = (BeanLifeCycleDao) ctx.getBean("BeanLifeCycleDao");
        beanLifeCycleDao.save();
        System.out.println();

        /* 9-2 接口实现bean生命周期 */
        BeanLifeCycleDao beanLifeCycleDaoInterface = (BeanLifeCycleDao) ctx.getBean("BeanLifeCycleDaoInterface");
        beanLifeCycleDaoInterface.save();

        System.out.println();
    }


}
