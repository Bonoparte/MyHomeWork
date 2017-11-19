package com.epam.ThirdModuleTasks.ThirdModuleFirstTask;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdModuleFirstTask {

    public static void main(String[] args) {
        CrazyLogger crazyLogger = new CrazyLogger();
        crazyLogger.addLog("First log!");
        crazyLogger.addLog("Second log!");
        int i = 3;
        crazyLogger.addLog("Here" + i + "errors! NEED HELP!");
        crazyLogger.addLog("They all 3 are all dead!");
        crazyLogger.findLog("3");
        crazyLogger.findLog("log!");
    }
}


