package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.io.*;
import java.nio.charset.StandardCharsets;

//@SpringBootTest
class DemoApplicationTests {


    // ioc容器
    @Autowired
    ApplicationContext ioc;

    @Test
    void ioc(){
        ioc.containsBean("");
    }

    @Test
    void contextLoads() {
    }

    @Test
    void readAndOutFiles() throws IOException {
        File input = new File("E:\\chromeDownload\\hbaseout1.txt");
        File out = new File("C:\\Users\\her\\Desktop\\out.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), StandardCharsets.UTF_8));
        FileOutputStream fileOutputStream = new FileOutputStream(out);
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            String outString = "deleteall \'freeflow_dev:tb_all_duplicate_check\', \'" + line.split(" ")[1] + "\'\n";
            fileOutputStream.write(outString.getBytes());
        }
        fileOutputStream.close();
        br.close();
    }

}
