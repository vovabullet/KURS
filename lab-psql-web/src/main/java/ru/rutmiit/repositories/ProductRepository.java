package ru.rutmiit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.rutmiit.models.entities.Product;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}