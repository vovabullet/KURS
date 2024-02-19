package ru.rutmiit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rutmiit.models.entities.ProductReceipt;
import ru.rutmiit.services.ProductReceiptService;

import java.util.List;

@RestController
@RequestMapping("/productReceipts")
public class ProductReceiptController {
    private final ProductReceiptService productReceiptService;

    @Autowired
    public ProductReceiptController(ProductReceiptService productReceiptService) {
        this.productReceiptService = productReceiptService;
    }

    @GetMapping
    public List<ProductReceipt> getAllProductReceipts() {
        return productReceiptService.findAllProductReceipts();
    }

    @GetMapping("/byProduct/{productId}")
    public List<ProductReceipt> getProductReceiptsByProductId(@PathVariable Long productId) {
        return productReceiptService.findProductReceiptsByProductId(productId);
    }
}