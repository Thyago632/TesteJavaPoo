
package com.exemplo.service.impl;

import com.exemplo.service.LoggerService;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLoggerService implements LoggerService {
    private static final String LOG_FILE = "accounts.log";
    
    @Override
    public void logAccountCreation(String username) {
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.write(String.format("[%s] Conta criada para: %s%n", timestamp, username));
            System.out.println("[FILE LOG] Conta registrada no arquivo para: " + username);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo de log: " + e.getMessage());
        }
    }
}
