package ru.rutmiit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rutmiit.models.entities.ProductReceipt;
import ru.rutmiit.repositories.ProductReceiptRepository;

import java.util.List;

@Service
public class ProductReceiptService {
    private final ProductReceiptRepository productReceiptRepository;

    @Autowired
    public ProductReceiptService(ProductReceiptRepository productReceiptRepository) {
        this.productReceiptRepository = productReceiptRepository;
    }

    public List<ProductReceipt> findAllProductReceipts() {
        return productReceiptRepository.findAll();
    }

    public List<ProductReceipt> findProductReceiptsByProductId(Long productId) {
        return productReceiptRepository.findByProductId(productId);
    }

}
