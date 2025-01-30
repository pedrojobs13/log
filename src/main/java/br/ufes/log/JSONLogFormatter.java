package br.ufes.log;

import org.json.simple.JSONObject;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JSONLogFormatter implements LogFormatter{
    @Override
    public String format(String operation, String name, String user) {
        JSONObject logEntry = new JSONObject();
        logEntry.put("operation", operation);
        logEntry.put("name", name);
        logEntry.put("timestamp", new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        logEntry.put("user", user);
        return logEntry.toJSONString();
    }
}
