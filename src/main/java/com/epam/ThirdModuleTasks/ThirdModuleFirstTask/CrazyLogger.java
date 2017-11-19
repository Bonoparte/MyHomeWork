package com.epam.ThirdModuleTasks.ThirdModuleFirstTask;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrazyLogger {

    private StringBuilder log;
    private DateFormat dateFormatter = new SimpleDateFormat("dd-MM-YYYY : hh-mm - ");

    public CrazyLogger() {
        this.log = new StringBuilder();
    }

    public void addLog(String add) {
        String added = dateFormatter.format(new Date()) + add + ";\n";
        log.append(added);
    }

    public void findLog(String search) {
        Pattern pattern = Pattern.compile(".*" + search + ".*;\n");
        Matcher matcher = pattern.matcher(log.toString());
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}
