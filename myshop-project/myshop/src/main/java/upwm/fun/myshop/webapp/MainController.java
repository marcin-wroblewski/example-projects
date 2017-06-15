package upwm.fun.myshop.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marci on 25.05.2017.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    public String home() {
        return "redirect:index.html";
    }
}
