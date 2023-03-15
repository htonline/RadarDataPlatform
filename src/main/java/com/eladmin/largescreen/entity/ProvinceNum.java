package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zuohaitao
 * @date 2022-11-24 10:00
 * @describe 省份及对应的数量
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceNum {
    private String name;
    private Integer value;
}
