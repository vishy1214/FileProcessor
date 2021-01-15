package com.fp.solution2;

import com.fp.FileTargetPath;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

public class FileProcessor {
    public static void main(String[] args){
        Instant start = Instant.now();
        FileTargetPath targetPathPrep = new FileTargetPath();
        TokenProcessor tokenProcessor = new TokenProcessor();
        QueueManager queueManager = new QueueManager();
        WorkExecutors executors = null;
        BufferedReader reader = null;

        try{
            targetPathPrep.setPreRequisites();
            reader = Files.newBufferedReader(Paths.get(com.fp.FileProcessor.class.getResource("/input/large.txt").toURI()));
            executors = new WorkExecutors();
            String line = null;
            while((line = reader.readLine()) !=null) {
                if(!line.isEmpty()){
                     for(String token : line.split("\\s+")) {
                         tokenProcessor.process(token);
                     }
                }
            }
            reader.close(); // done with reading
            System.out.format("Time taken to split & add the content to the Q: %d ms.%n", Duration.between(start,Instant.now()).toMillis());
            if(queueManager.isQEmpty()) {
                //lets merge the tokens into one file
               // tokenProcessor.compileFinalOutput();
                System.out.format("Total Time taken to process the file: %d ms.%n", Duration.between(start, Instant.now()).toMillis());
            }
        }catch (Exception ex){
            System.err.format("Exception. %n %s",ex.getMessage());
            ex.printStackTrace();
        }finally {
            try {

                executors.shutdown();
            }catch (Exception ex){
                System.err.format("Exception in finally block. %n %s",ex.getMessage());
            }
        }
        System.exit(0);
    }
}
