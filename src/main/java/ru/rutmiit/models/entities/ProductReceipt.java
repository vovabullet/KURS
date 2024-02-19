package ru.rutmiit.models.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "product_receipt")
public class ProductReceipt {
    private Long productReceiptId;

    /*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "receipt_id")
    private ReceiptDocument receiptDocument;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
     */


    private Double wholesalePrice;
    private Integer quantity;
    private Long product_id;
    private Long receipt_id;


    // Getters and Setters

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_receipt_id", nullable = false, columnDefinition = "BIGINT")
    public Long getProductReceiptId() {
        return productReceiptId;
    }

    public void setProductReceiptId(Long productReceiptId) {
        this.productReceiptId = productReceiptId;
    }

    @Column(name = "wholesale_price", nullable = false)
    public Double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(Double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    @Column(name = "quantity", nullable = false)
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Column(name = "product_id", nullable = false)
    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    @Column(name = "receipt_id", nullable = false)
    public Long getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(Long receipt_id) {
        this.receipt_id = receipt_id;
    }
}
