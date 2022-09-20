package log;

import config.LogLevel;

import java.time.LocalDateTime;

public class LogCustom {
    private final String name;
    private String filePath;

    public LogCustom(String name) {
        this.name = name;
    }

    public LogCustom(String name, String filePath) {
        this.name = name;
        this.filePath = filePath;
    }

    public void info(String msg) {
        writeLog(LogLevel.INFO, msg);
    }

    public void warn(String msg) {
        writeLog(LogLevel.WARN, msg);
    }

    public void debug(String msg) {
        writeLog(LogLevel.DEBUG, msg);
    }

    public void error(String msg) {
        writeLog(LogLevel.ERROR, msg);
    }

    private void writeLog(LogLevel level, String msg) {
        if (this.filePath == null) {
            System.out.println(this.name + " class: " + level + " - " + msg);
        } else {
//            Todo Ghi file
        }
    }

}
