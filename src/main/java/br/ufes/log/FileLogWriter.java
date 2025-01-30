package br.ufes.log;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogWriter implements LogWriter{
    private final String filePath;

    public FileLogWriter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String message) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(message + "\n");
        } catch (IOException e) {
            System.err.println("Falha ao registrar log: " + e.getMessage());
        }
    }
}
