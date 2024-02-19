package ru.rutmiit.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.rutmiit.models.entities.ReceiptDocument;
import ru.rutmiit.services.ReceiptDocumentService;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/receiptDocuments")
public class ReceiptDocumentController {
    private final ReceiptDocumentService receiptDocumentService;

    @Autowired
    public ReceiptDocumentController(ReceiptDocumentService receiptDocumentService) {
        this.receiptDocumentService = receiptDocumentService;
    }

    @GetMapping
    public List<ReceiptDocument> getAllReceiptDocuments() {
        return receiptDocumentService.findAllReceiptDocuments();
    }

    @GetMapping("/byDate/{receiptDate}")
    public List<ReceiptDocument> getReceiptDocumentsByReceiptDate(@PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date receiptDate) {
        return receiptDocumentService.findReceiptDocumentsByReceiptDate(receiptDate);
    }
}
