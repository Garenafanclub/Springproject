package com.mayank.Web_cart.Controller;

import com.mayank.Web_cart.Model.Product;
import com.mayank.Web_cart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> AllProduct() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable("id") int productId)
    {
        Product product = productService.getProduct(productId);
        if(product.getId() > 0)
            return new ResponseEntity<>(product,HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart("imageFile") MultipartFile image)
    {
        Product savedProduct = null;
        try {
             savedProduct = productService.addProduct(product,image);
            return new ResponseEntity<>(savedProduct,HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageById(@PathVariable int productId)
    {
        Product product = productService.getProduct(productId);
        if(product.getId() > 0)
        return new ResponseEntity<>(product.getImageData(),HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable int productId,@RequestPart Product product, @RequestPart("imageFile") MultipartFile image)
    {
        try{
            productService.updateProduct(product, image);
            return new ResponseEntity<>("Updated",HttpStatus.ACCEPTED);
        }catch (Exception e)
        {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int productId)
    {
        Product product = productService.getProduct(productId);
        if(product != null) {
            productService.deletePrdt(productId);
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        }
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword)
    {
        List<Product> list = productService.searchPr(keyword);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
