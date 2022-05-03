package com.example.tdd.domain;

public interface Expression {
    Money reduce(Bank bank, String to);
}
