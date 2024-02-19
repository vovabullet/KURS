package ru.rutmiit.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rutmiit.dto.ShowProductInfoDto;
import ru.rutmiit.models.entities.Product;
import ru.rutmiit.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<ShowProductInfoDto> allProducts() {
        return productRepository.findAll().stream().map(company -> mapper.map(company, ShowProductInfoDto.class))
                .collect(Collectors.toList());
    }
}
