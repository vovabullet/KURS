package ru.rutmiit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.rutmiit.models.entities.Revaluation;
import ru.rutmiit.repositories.RevaluationRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class RevaluationService {
    private final RevaluationRepository revaluationRepository;

    @Autowired
    public RevaluationService(RevaluationRepository revaluationRepository) {
        this.revaluationRepository = revaluationRepository;
    }

    public List<Revaluation> findAllRevaluations() {
        return revaluationRepository.findAll();
    }

    public BigDecimal calculateTotalRevaluationAmount() {
        List<Revaluation> revaluations = findAllRevaluations();
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Revaluation revaluation : revaluations) {
            totalAmount = totalAmount.add(revaluation.getAmount());
        }
        return totalAmount;
    }
}
