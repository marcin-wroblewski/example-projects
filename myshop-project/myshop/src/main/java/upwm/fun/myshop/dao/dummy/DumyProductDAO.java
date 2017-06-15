package upwm.fun.myshop.dao.dummy;

import org.springframework.stereotype.Repository;
import upwm.fun.myshop.product.Product;
import upwm.fun.myshop.product.ProductDAO;

import java.util.Arrays;
import java.util.List;

/**
 * Created by marci on 15.06.2017.
 */
@Repository
public class DumyProductDAO implements ProductDAO {
    @Override
    public List<Product> getList() {
        List<Product> list = Arrays.asList(
                new Product().setId(1l).setName("Jablko"),
                new Product().setId(2l).setName("Gruszka"),
                new Product().setId(3l).setName("Pietruszka"),
                new Product().setId(4l).setName("Koperek"),
                new Product().setId(5l).setName("Pomidor"),
                new Product().setId(6l).setName("Cytryna")
        );
        return list;
    }
}
