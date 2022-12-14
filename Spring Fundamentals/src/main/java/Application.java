import com.danu.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService customerService = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService);
//        Just to check the scope of the bean default if singleton, means will get the same object return both the time
        CustomerService customerService1 = applicationContext.getBean("customerService", CustomerService.class);
        System.out.println(customerService1);
//        CustomerService customerService = new CustomerServiceImpl();

        System.out.println(customerService.findAll().get(0).getFirstname());
//        System.out.println(customerService.findAll().get(0).getLastname());

    }
}
