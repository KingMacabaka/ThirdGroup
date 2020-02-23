package main.part1;

import java.io.File;

/**
 * @author xxq
 * @ClassName FileFilterTest
 * @Description 列出目标路径下的子文件
 * @Date 2020/2/23
 * @Version 1.0
 **/
public class FileFilterTest {
    public static void main(String[] args) {
        File filePath = new File("D:/coding");
        //重写FileFilter接口的accept方法
        File[] files = filePath.listFiles(f -> f.isDirectory());

        //循环输出子文件
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
