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
public class ExcelListener extends AnalysisEventListener<ExcelData> {

    private List<ExcelData> dataList = new ArrayList<>();

    /**
     * 每读取一行数据就会执行一次invoke方法
     *
     * @param data Excel 行数据
     * @param context 解析上下文对象
     */
    @Override
    public void invoke(ExcelData data, AnalysisContext context) {
        // 将数据保存到 List 中
        dataList.add(data);
    }

    /**
     * 解析完所有数据后会执行该方法
     *
     * @param context 解析上下文对象
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 处理数据
        handleData(dataList);
    }

    /**
     * 处理数据的方法
     *
     * @param dataList Excel 数据列表
     */
    private void handleData(List<ExcelData> dataList) {
        // 处理 Excel 数据
        System.out.println("处理 Excel 数据：" + dataList);

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

