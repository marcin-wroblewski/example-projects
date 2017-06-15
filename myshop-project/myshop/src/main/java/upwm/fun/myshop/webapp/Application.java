package upwm.fun.myshop.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.activation.DataSource;

/**
 * Created by marci on 25.05.2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"upwm.fun.myshop.product", "upwm.fun.myshop.webapp",
//        "upwm.fun.myshop.dao.dummy"
        "upwm.fun.myshop.dao.ojdbc"
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
