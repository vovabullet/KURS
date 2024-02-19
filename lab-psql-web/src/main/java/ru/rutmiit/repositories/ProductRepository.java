package ru.rutmiit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.rutmiit.models.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "SELECT p.name FROM Products p JOIN ProductReceipts pr ON p.productId = pr.productId JOIN ReceiptDocuments rd ON pr.receiptId = rd.receiptId WHERE rd.supplierId = :supplierId", nativeQuery = true)
    List<String> findProductsBySupplierId(@Param("supplierId") Long supplierId);
}