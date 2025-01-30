package br.ufes.log;

public interface LogFormatter {
    String format(String operation, String name, String user);
}
