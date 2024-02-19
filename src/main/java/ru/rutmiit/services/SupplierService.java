package ru.rutmiit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rutmiit.models.entities.Supplier;
import ru.rutmiit.repositories.SupplierRepository;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<Supplier> findAllSuppliers() {
        return supplierRepository.findAll();
    }

    public List<Supplier> findSuppliersByName(String name) {
        return supplierRepository.findByName(name);
    }
}
