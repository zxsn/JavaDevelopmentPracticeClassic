
/**  
* @Title: Ex02.java
* @Package com.java.development.twelve_java_io.exercises
* @Description: TODO(用一句话描述该文件做什么)
* @author Administrator
* @date 2018年10月31日
* @version V1.0  
*/

package com.java.development.twelve_java_io.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
* @ClassName: Ex02
* @Description:从键盘输入文件的内容和要保存的文件名称，然后根据输入的名称创建文件，并将内容保存到文件中。
* @author Administrator
* @date 2018年10月31日
*
*/

public class Ex02 {
    public class InputData {//数据输入
        private BufferedReader buf = null;

        public InputData() {
            buf = new BufferedReader(new InputStreamReader(System.in));
        }

        public String getString(String info) {
            String temp = null;
            System.out.println(info);
            try {
                temp = buf.readLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return temp;

        }
    }

    /**
        * @Title: main
        * @Description: TODO(这里用一句话描述这个方法的作用)
        * @param @param args    参数
        * @return void    返回类型
        * @throws
        */

    public static void main(String[] args) {
        //System.out.println("当前用户工作目录：" + System.getProperty("user.dir"));
        Ex02 e2 = new Ex02();
        InputData input = e2.new InputData();
        String classPath = e2.getClass().getPackageName();
        classPath = classPath.replaceAll("\\.", "\\" + File.separator);
        String dir = System.getProperty("user.dir") + File.separator + "src" + File.separator
                     + classPath;
        System.out.println("当前路径：" + dir);
        String contents = input.getString("请输入文件的内容：");
        boolean flag = true;
        String fileName = null;
        while (flag) {
            fileName = input.getString("请输入文件的名称：");
            //Windows文件名正则表达式验证
            String regex = "(?!((^(con)$)|^(con)//..*|(^(prn)$)|^(prn)//..*|(^(aux)$)|^(aux)//..*|(^(nul)$)|^(nul)//..*|(^(com)[1-9]$)|^(com)[1-9]//..*|(^(lpt)[1-9]$)|^(lpt)[1-9]//..*)|^//s+|.*//s$)(^[^/////////://*//?///\"//<//>//|]{1,255}$)";
            if (!fileName.matches(regex)) {
                System.out.println("文件名不符合要求。");
            } else {
                flag = false;
            }
        }

        OutputStream os = null;
        byte b[] = contents.getBytes();//只能输出byte数组，所有将字符串变为byte数组
        try {
            File file = new File(dir + File.separator + fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            os = new FileOutputStream(file);
            os.write(b);
            System.out.println("写入完成！");
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
