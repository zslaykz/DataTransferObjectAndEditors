package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.dao.ProductDAO;
import ua.com.owu.entity.Product;
import ua.com.owu.service.ProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public void save(Product product) {
        productDAO.save(product);
    }

    @Override
    public List<Product> findALL() {
        return productDAO.findAll();
    }

    @Override
    public Product findOne(int id) {
        return productDAO.findOne(id);
    }
}
