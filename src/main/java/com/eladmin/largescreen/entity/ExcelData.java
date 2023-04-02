package com.eladmin.largescreen.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author Zuohaitao
 * @date 2023-04-02 9:45
 * @describe
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelData {
    private Integer rowIndex;
    private Integer columnIndex;
    private Integer value;
}
