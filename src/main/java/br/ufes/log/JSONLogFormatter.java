package br.ufes.log;

import org.json.simple.JSONObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONLogFormatter implements LogFormatter{
    @Override
    public String format(String operation, String name, String user) {
        String[] timestamp = getTimestamp();
        JSONObject logEntry = new JSONObject();
        logEntry.put("operation", operation);
        logEntry.put("name", name);
        logEntry.put("date", timestamp[0]);
        logEntry.put("time", timestamp[1]);
        logEntry.put("user", user);
        logEntry.put("errorMessage", "");
        return logEntry.toString();
    }

    @Override
    public String formatFailure(String operation, String name, String user, String errorMessage) {
        String[] timestamp = getTimestamp();
        JSONObject logEntry = new JSONObject();
        logEntry.put("operation", operation);
        logEntry.put("name", name);
        logEntry.put("date", timestamp[0]);
        logEntry.put("time", timestamp[1]);
        logEntry.put("user", user);
        logEntry.put("errorMessage", errorMessage);
        return logEntry.toString();
    }

    private String[] getTimestamp() {
        String fullTimestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        return fullTimestamp.split(" ");
    }
}
