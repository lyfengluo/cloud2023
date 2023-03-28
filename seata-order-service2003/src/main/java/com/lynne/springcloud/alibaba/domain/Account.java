package com.lynne.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @Description //TODO
 * @Date 2023/3/28 9:05
 * @Author fengyongli
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
