package com.eladmin.largescreen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Zuohaitao
 * @date 2023-04-02 15:32
 * @describe excel表格返回给前端的数据结构
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelDao {
    private List<ExcelData> dataList;
    private Integer[] rowList;
    private Integer[] colList;
}
