package ru.rutmiit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.rutmiit.models.entities.Product;
import ru.rutmiit.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAllProducts();
    }

    @GetMapping("/all")
    public String showAllProducts(Model model) {
        model.addAttribute("companyInfos", productService.allProducts());

        return "product-all";
    }

}
