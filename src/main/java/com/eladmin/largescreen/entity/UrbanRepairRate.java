package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zuohaitao
 * @date 2023-03-19 13:26
 * @describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UrbanRepairRate {
    private Integer fixedCount;
    private String city;
    private Integer totalCount;
    private Double fixRate;
}
