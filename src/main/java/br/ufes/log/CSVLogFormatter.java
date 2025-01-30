package br.ufes.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVLogFormatter implements LogFormatter{
    @Override
    public String format(String operation, String name, String user) {
        String timestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        return String.format("%s;%s;%s;%s", operation, name, timestamp, user);
    }
}
