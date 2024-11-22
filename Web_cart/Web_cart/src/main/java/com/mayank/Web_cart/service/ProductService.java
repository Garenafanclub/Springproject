package com.mayank.Web_cart.service;

import com.mayank.Web_cart.Model.Product;
import com.mayank.Web_cart.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProduct(int productId) {
        return productRepo.findById(productId).orElse(new Product(-1));
    }

    public Product addProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        return productRepo.save(product);
    }

    public void updateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());
        productRepo.save(product);
    }

    public void deletePrdt(int productId) {
        productRepo.deleteById(productId);
    }

    public List<Product> searchPr(String keyword) {
        return productRepo.searchProduct(keyword);
    }
}
