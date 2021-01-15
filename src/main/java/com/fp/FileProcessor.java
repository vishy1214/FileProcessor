package com.fp;

import java.io.BufferedReader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

/**
 * Orchestrates the file processing.
 * It takes in a text file as input, extracts every words from it and stores them to the disk alphabetically based on its starting character.
 * Once the sorting is done, all of those files are merged to form the final output file.
 * When merging its done in descending order of alphabets & numbers.
 *
 * It is based on external sorting technique to avoid running out of memory when processing very large data files.
 */
public class FileProcessor {

    public static void main(String[] args){
        System.out.println("Starting File Processing");
        Instant start = Instant.now();
        FileTargetPath targetPathPrep = new FileTargetPath();
        OutputWriter writer = new OutputWriter();
        BufferedReader reader = null;

        try{
            targetPathPrep.setPreRequisites();
            reader = Files.newBufferedReader(Paths.get(FileProcessor.class.getResource("/input/xtra_large.txt").toURI()));
            String line = null;
            //read the lines from the buffer, split the words & store them to disk.
            while((line = reader.readLine()) !=null) {
                if(!line.isEmpty()){
                    for(String token : line.split("\\s+")) {  //split the line with whitespace as delimiters
                        writer.processToken(token);
                    }
                }
            }
            System.out.format("Time taken to split the content: %d ms.%n", Duration.between(start,Instant.now()).toMillis());

            //lets merge the tokens into one file
            writer.compileFinalOutput();

            System.out.format("Total Time taken to process the file: %d ms.%n",Duration.between(start,Instant.now()).toMillis());

        }catch (Exception ex){
            System.err.format("Exception. %n %s",ex);
        }finally {
            try{
                if(reader != null){
                    reader.close();
                }
                targetPathPrep.cleanUp();
            }catch (Exception ex){
                System.err.format("Exception in finally block. %n %s",ex);
            }
        }

        System.out.println("Done");
    }
}
