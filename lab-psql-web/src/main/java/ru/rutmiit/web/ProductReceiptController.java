package ru.rutmiit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return productReceiptService.findAll();
    }

    @GetMapping("/{id}")
    public ProductReceipt getProductReceiptById(@PathVariable Long id) {
        return productReceiptService.findById(id);
    }

    @PostMapping
    public ProductReceipt saveProductReceipt(@RequestBody ProductReceipt productReceipt) {
        return productReceiptService.save(productReceipt);
    }
}