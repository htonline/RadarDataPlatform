package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zuohaitao
 * @date 2023-03-19 12:33
 * @describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseStatus {
    private Integer total;
    private Integer fixed;
    private Integer fixing;
    private Integer unfix;
}
