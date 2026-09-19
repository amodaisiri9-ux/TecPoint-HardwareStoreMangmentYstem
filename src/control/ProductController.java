package control;

import java.sql.SQLException;
import java.util.List;
import model.Product;
import model.ProductDAO;

public class ProductController {
    private final ProductDAO dao = new ProductDAO();

    public List<Product> getAll() throws SQLException {
        return dao.findAll();
    }

    public Product getById(int id) throws SQLException {
        return dao.findById(id);
    }
    
    public List<Product> findByNameLike(String pattern) throws SQLException {
        return dao.findByNameLike(pattern);
    }

    public boolean add(Product product) throws SQLException {
        return dao.insert(product);
    }

    public boolean update(Product product) throws SQLException {
        return dao.update(product);
    }

    public boolean delete(int id) throws SQLException {
        return dao.delete(id);
    }
}
