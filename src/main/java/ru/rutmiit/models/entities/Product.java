package ru.rutmiit.models.entities;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Product {

    private Long product_id;
    private String productName;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "product_id", nullable = false)
    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    @Column(columnDefinition = "product_name", nullable = false)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }




    @OneToMany(mappedBy = "product")
    private List<ProductReceipt> productReceipt;

    public List<ProductReceipt> getProductReceipts() {
        return productReceipt;
    }

    public void setProductReceipts(List<ProductReceipt> productReceipts) {
        this.productReceipt = productReceipts;
    }


}
