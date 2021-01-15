package com.fp.solution2;

import java.nio.file.Path;


public class Message {
    private String token;
    private Path filePath;

    Message(String token, Path path){
        this.token = token;
        this.filePath = path;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }
}
