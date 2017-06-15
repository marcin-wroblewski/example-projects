package upwm.fun.myshop.webapp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import upwm.fun.myshop.product.Product;
import upwm.fun.myshop.product.ProductsService;

import java.util.List;

/**
 * Created by marci on 25.05.2017.
 */
@RestController
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
    @Autowired
    ProductsService productsService;

    @RequestMapping("/products")
    List<Product> products() {
        List<Product> list = productsService.products();
        return list;
    }
}
