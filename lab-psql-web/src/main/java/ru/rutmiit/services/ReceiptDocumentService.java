package ru.rutmiit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rutmiit.models.entities.ReceiptDocument;
import ru.rutmiit.repositories.ReceiptDocumentRepository;

import java.util.Date;
import java.util.List;

@Service
public class ReceiptDocumentService {
    private final ReceiptDocumentRepository receiptDocumentRepository;

    @Autowired
    public ReceiptDocumentService(ReceiptDocumentRepository receiptDocumentRepository) {
        this.receiptDocumentRepository = receiptDocumentRepository;
    }

    public List<ReceiptDocument> findAllReceiptDocuments() {
        return receiptDocumentRepository.findAll();
    }

    public List<ReceiptDocument> findReceiptDocumentsByReceiptDate(Date receiptDate) {
        return receiptDocumentRepository.findByReceiptDate(receiptDate);
    }
}
