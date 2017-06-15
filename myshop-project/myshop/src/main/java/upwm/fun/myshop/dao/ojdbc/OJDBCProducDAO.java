package upwm.fun.myshop.dao.ojdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import upwm.fun.myshop.product.Product;
import upwm.fun.myshop.product.ProductDAO;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by marci on 15.06.2017.
 */
@Repository
public class OJDBCProducDAO implements ProductDAO {
    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbc;

    @PostConstruct
    private void init() {
        this.jdbc = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Product> getList() {
        return jdbc.query("select id, name from product", (ResultSet rs, int rowNum) ->
                new Product().setId(rs.getLong(1)).setName(rs.getString(2)));
    }

}
