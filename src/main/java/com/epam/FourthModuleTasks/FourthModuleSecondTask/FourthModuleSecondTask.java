package com.epam.FourthModuleTasks.FourthModuleSecondTask;

import javax.lang.model.SourceVersion;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FourthModuleSecondTask {
    public static void main(String[] args) {
        int keywordCounter = 0;
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("Utils.java");
        StringBuilder inputBuilder = new StringBuilder();
        StringBuilder outputBuilder = new StringBuilder();
        try (Reader reader = new InputStreamReader(is)) {
            Map<String,Integer> keyWords = new HashMap<>();
            while (true) {
                int ch = reader.read();
                inputBuilder.append((char) ch);
                if (ch == -1) {
                    break;
                }
            }
            for (String word : inputBuilder.toString().split(" |\\n")) {
                if (SourceVersion.isKeyword(word)) {
                    if (!(keyWords.containsKey(word))) {
                        keyWords.put(word,1);
                        keywordCounter++;
                    }
                    else {
                        keyWords.put(word,keyWords.get(word)+1);
                        keywordCounter++;
                    }
                }
            }
            outputBuilder.append("\n"+keyWords.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = outputBuilder.substring(2,outputBuilder.length()-1) + "\r\n";
        data = data.replace(" ", "\r\n").replace(",","").replace("=", " : ");
        data = data + "Keyword count: " + keywordCounter;
        try (Writer outputStream = new FileWriter("data2.txt")) {
            outputStream.write(data);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
