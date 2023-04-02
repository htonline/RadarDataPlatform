package com.eladmin.largescreen.utils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.eladmin.largescreen.entity.ExcelData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zuohaitao
 * @date 2023-04-02 11:36
 * @describe
 */
public class ExcelListener extends AnalysisEventListener<Map<Integer, String>>  {

    private List<ExcelData> dataList = new ArrayList<>();

    /**
     * 每读取一行数据就会执行一次invoke方法
     *
     * @param data Excel 行数据
     * @param context 解析上下文对象
     */
    @Override
    public void invoke(Map<Integer, String> data, AnalysisContext context) {
        int rowIndex = context.readRowHolder().getRowIndex(); // 获取行号
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            int columnIndex = entry.getKey(); // 获取列号
            String cellValue = entry.getValue(); // 获取单元格的值
            // 进行处理
            ExcelData excelData = new ExcelData();
            excelData.setRowIndex(rowIndex);
            excelData.setColumnIndex(columnIndex);
            excelData.setValue(cellValue);
            dataList.add(excelData);
        }
    }



    /**
     * 解析完所有数据后会执行该方法
     *
     * @param context 解析上下文对象
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
    }


    /**
     * 获取读取到的 Excel 数据
     *
     * @return Excel 数据列表
     */
    public List<ExcelData> getDataList() {
        return dataList;
    }


}

