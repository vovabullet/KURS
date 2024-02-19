package ru.rutmiit.models.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
public class ReceiptDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long receiptId;
    private Date receiptDate;

    @OneToMany(mappedBy = "receiptDocument", fetch = FetchType.LAZY)
    private Set<ProductReceipt> productReceipts;

    // Getters and Setters

    @Column(name = "receipt_id", nullable = false)
    public Long getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(Long receiptId) {
        this.receiptId = receiptId;
    }

    @Column(name = "receipt_date", nullable = false)
    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }


    public Set<ProductReceipt> getProductReceipts() {
        return productReceipts;
    }

    public void setProductReceipts(Set<ProductReceipt> productReceipts) {
        this.productReceipts = productReceipts;
    }


}
