package com.epam.FourthModuleTasks.FourthModuleThirdTask;

import java.io.*;

public class FourthModuleThirdTask {
    public static void main(String[] args) {
        StringBuilder textSB = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"),"UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                textSB.append(line);
                textSB.append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(textSB);
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(
                        new File("outTest.txt")),"UTF-16"));) {
                bw.write(textSB.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
