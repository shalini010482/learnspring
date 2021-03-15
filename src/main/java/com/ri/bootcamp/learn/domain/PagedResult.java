package com.ri.bootcamp.learn.domain;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class PagedResult<T> {
    private List<T> content;
    private int number;
    private int numberOfElements;
    private int size;
    private long totalElements;
    private int totalPages;
    private Pageable pageable;
    private Sort sort;
    private long totalCount;
    private long totalPieceCount;
    private double totalAmount;
    private double totalReceiptBalanceAmount;
    private double totalExchangeAmount;
    private double totalGrossWeight;
    private double totalNetWeight;
    private double totalUsedAmount;
    private double totalCreditAmount;
    private double totalDebitAmount;
}
