package main.java.com.exemplo.service.impl;

import com.exemplo.service.LoggerService;

public class ConsoleLoggerService implements LoggerService {
    @Override
    public void logAccountCreation(String username) {
        System.out.println("[LOG] Conta criada para: " + username);
    }
}