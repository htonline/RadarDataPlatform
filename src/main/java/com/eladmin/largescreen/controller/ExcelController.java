package com.eladmin.largescreen.controller;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.excel.EasyExcel;

import com.eladmin.largescreen.entity.ExcelDao;
import com.eladmin.largescreen.entity.ExcelData;
import com.eladmin.largescreen.entity.Result;
import com.eladmin.largescreen.utils.ExcelListener;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zuohaitao
 * @date 2023-04-02 9:40
 * @describe
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {

    @GetMapping("/excelData")
//    public Result getExcelData(@RequestParam("filePath") String filePath) throws IOException {
    public Result getExcelData() {
        // Excel 文件路径
        String filePath = "D:\\WorkFile\\file\\data.xlsx";

        // 创建 Excel 读取监听器对象
        ExcelListener excelListener = new ExcelListener();


        // 调用 EasyExcel 的读取方法，传入 Excel 文件路径和读取配置对象
        // 设置headRowNumber=0, 表示第一行的数据也要; 默认值为1: 说明第一行是标题之类的，不需要获取。
        EasyExcel.read(filePath, null, excelListener).sheet().headRowNumber(0).doRead();

        ExcelDao excelDao = new ExcelDao();

        // 获取Excel表格的数据, 下标分别是:rowIndex, columnIndex,value
        // 最后需要返回的是一个数组，数组里面的结构，是一个只包含三个元素的数组
        List<ExcelData> result = excelListener.getDataList();

        List<List<Integer>> resultDao = new ArrayList<>();
        for (ExcelData excelData : result) {
            List<Integer> list = new ArrayList<>();
            list.add(excelData.getRowIndex());
            list.add(excelData.getColumnIndex());
            list.add(excelData.getValue());
            resultDao.add(list);
        }

        excelDao.setDataList(resultDao);

        Integer columnCount = excelListener.getColumnCount();
        Integer[] colList = new Integer[columnCount];
//        ArrayList<Integer> colList = new ArrayList<>();
        for (int i = 0; i < columnCount; i++) {
            colList[i] = i;
        }
        excelDao.setColList(colList);

        Integer rowCount = excelListener.getRowCount();
        Integer[] rowList = new Integer[rowCount];
        for (int i = 0; i < rowCount; i++) {
            rowList[i] = i;
        }
        excelDao.setRowList(rowList);

        return Result.success(excelDao);
    }



}
