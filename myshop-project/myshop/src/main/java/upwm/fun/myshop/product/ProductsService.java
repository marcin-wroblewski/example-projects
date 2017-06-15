package upwm.fun.myshop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marci on 25.05.2017.
 */
@Service
public class ProductsService {
    @Autowired
    private ProductDAO productDAO;

    public List<Product> products() {
        return productDAO.getList();
    }
}
