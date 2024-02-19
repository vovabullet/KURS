package ru.rutmiit.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.rutmiit.models.entities.Product;


import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}