package br.ufes.log;

public interface LogFormatter {
    String format(String operation, String name, String user);
    String formatFailure(String operation, String name, String user, String errorMessage);
}
