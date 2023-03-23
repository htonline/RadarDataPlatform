package com.eladmin.largescreen.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @date 2022-11-18 19:30
 * @describe MyBatis-Plus代码生成器
 */
public class CodeGenerator {
    public static void main(String[] args) {
        generate();
    }

    private static void generate() {
        FastAutoGenerator.create("jdbc:mysql://192.168.75.131:3306/largeScreen?serverTimezone=GMT%2b8", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D:\\WorkFile\\JavaProject\\largeScreen\\src\\main\\java\\"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.eladmin.largescreen") // 设置父包名
                            .moduleName("") // 设置父包模块名, 没有就写空
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D:\\WorkFile\\JavaProject\\largeScreen\\src\\main\\resources\\mapper\\")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .execute();
    }
}
