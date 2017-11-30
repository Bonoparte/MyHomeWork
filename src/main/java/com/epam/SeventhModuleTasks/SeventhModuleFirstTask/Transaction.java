package com.epam.SeventhModuleTasks.SeventhModuleFirstTask;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Transaction {
    private int id;
    private int payerId;
    private int payeeId;
    private double amount;

    public Transaction(int id, int payerId, int payeeId, double amount) {
        this.id = id;
        this.payerId = payerId;
        this.payeeId = payeeId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPayerId() {
        return payerId;
    }

    public void setPayerId(int payerId) {
        this.payerId = payerId;
    }

    public int getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(int payeeId) {
        this.payeeId = payeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return id == that.id &&
                payerId == that.payerId &&
                payeeId == that.payeeId &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, payerId, payeeId, amount);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ transaction id: ").append(id).append(", from account №").append(payerId)
                .append(" to account №").append(payeeId).append(", amount: ").append(amount).append(" ]");
        return stringBuilder.toString();
    }
}
