package ru.rutmiit.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Revaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date revaluationDate;
    private BigDecimal amount;

    // Конструкторы, геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRevaluationDate() {
        return revaluationDate;
    }

    public void setRevaluationDate(Date revaluationDate) {
        this.revaluationDate = revaluationDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
