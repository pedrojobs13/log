package br.ufes.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVLogFormatter implements LogFormatter{
    @Override
    public String format(String operation, String name, String user) {
        String[] timestamp = getTimestamp();
        return String.format("\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"\"",
                operation, name, timestamp[0], timestamp[1], user);
    }

    @Override
    public String formatFailure(String operation, String name, String user, String errorMessage) {
        String[] timestamp = getTimestamp();
        return String.format("\"%s\", \"%s\", \"%s\", \"%s\", \"%s\", \"%s\"",
                operation, name, timestamp[0], timestamp[1], user, errorMessage);
    }

    private String[] getTimestamp() {
        String fullTimestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        return fullTimestamp.split(" ");
    }
}
