package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zuohaitao
 * @date 2023-03-13 16:00
 * @describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiseaseTypesCounts {
//    路基空洞数量
    private Integer cavityNum;
//    路基脱空数量
    private Integer voidNum;
//    路基疏松数量
    private Integer loosenNum;
//    路基渗水数量
    private Integer leakNum;
//    总数量
    private Integer totalNum;
}
