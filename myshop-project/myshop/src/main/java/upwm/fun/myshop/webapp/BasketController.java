package upwm.fun.myshop.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import upwm.fun.myshop.basket.Basket;
import upwm.fun.myshop.product.Product;

/**
 * Created by marci on 25.05.2017.
 */
@Controller
@RestController
public class BasketController {
    private static final Logger logger = LoggerFactory.getLogger(BasketController.class);

    @Autowired
    private SessionData sessionData;

    @RequestMapping(value = "/basket/add", method = RequestMethod.POST)
    void add(@RequestBody Product product) {
        logger.debug("adding to basket");
        sessionData.getBasket().add(product);
    }

    @RequestMapping("/basket")
    Basket getBasket() {
        return sessionData.getBasket();
    }

}
