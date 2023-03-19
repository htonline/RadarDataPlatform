package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Zuohaitao
 * @date 2023-03-19 18:23
 * @describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrbanRepairRateDao {
    private List<Integer> fixedCount;
    private String[] city;
    private List<Integer> totalCount;
    private List<Double> fixedRate;
}

