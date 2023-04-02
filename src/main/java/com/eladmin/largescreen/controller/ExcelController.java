package com.eladmin.largescreen.controller;

import java.util.List;
import java.util.Map;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.support.ExcelTypeEnum;
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

    @GetMapping("/excelRead")
//    public Result getExcelData(@RequestParam("filePath") String filePath) throws IOException {
    public Result getExcelData() {
        // Excel 文件路径
        String filePath = "D:\\WorkFile\\file\\data.xlsx";

        // 创建 Excel 读取监听器对象
        ExcelListener excelListener = new ExcelListener();


        // 调用 EasyExcel 的读取方法，传入 Excel 文件路径和读取配置对象
        // 设置headRowNumber=0, 表示第一行的数据也要; 默认值为1: 说明第一行是标题之类的，不需要获取。
        EasyExcel.read(filePath, ExcelData.class, excelListener).sheet().headRowNumber(0).doRead();

        // 获取返回的数据
        List<ExcelData> result = excelListener.getDataList();
        System.out.println("获取到的数据：" + result);


        return Result.success(result);
    }


}
