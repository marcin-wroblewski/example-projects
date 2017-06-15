package upwm.fun.myshop.webapp;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import upwm.fun.myshop.basket.Basket;

/**
 * Created by marci on 04.06.2017.
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {
    private Basket basket;

    public SessionData() {
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }
}
