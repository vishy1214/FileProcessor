package com.fp.solution1;

import com.fp.Constants;
import com.fp.FileDictionary;
import com.fp.FileTargetPath;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * Takes care of writing the contents to disk.
 */
public class OutputWriter {
    private static final List<String> MERGE_ORDER = new ArrayList<>();
    private static Map<String,BufferedWriter> writerConnections = new HashMap<>();

    public void initialize() throws IOException{
        writerConnections.put("A",Files.newBufferedWriter(FileDictionary.getFilePath("A"), Constants.CHAR_SET,CREATE,APPEND));
        writerConnections.put("B",Files.newBufferedWriter(FileDictionary.getFilePath("B"), Constants.CHAR_SET,CREATE,APPEND));
        writerConnections.put("C",Files.newBufferedWriter(FileDictionary.getFilePath("C"), Constants.CHAR_SET,CREATE,APPEND));
    }



    /**
     * Every word is stored in a file that corresponds to its starting character.
     * This is done to sort the words in a way it does not take up the memory.
     *  example: the word " after " will be stored in A.txt and the word " before " will be stored in B.txt.
     *
     * @param token
     * @throws URISyntaxException
     * @throws IOException
     */
/*    public void processToken(String token) throws URISyntaxException, IOException {
        Path tempFileHandle = FileDictionary.getFilePath(String.valueOf(token.charAt(0)));
        try(BufferedWriter writer = Files.newBufferedWriter(tempFileHandle, Constants.CHAR_SET,CREATE,APPEND)){
            writer.write(token);
            writer.newLine();
        }
    }*/

    public void processToken(String token) throws URISyntaxException, IOException {

    }
    /**
     * Combines all the temporary files to form the final output file.
     * @throws IOException
     */
    public void compileFinalOutput()throws IOException{
        Instant start = Instant.now();
        FileTargetPath targetPath = new FileTargetPath();
        Path outputPath = targetPath.getOutputPath();
        BufferedReader reader = null;

        try(BufferedWriter writer = Files.newBufferedWriter(outputPath,Constants.CHAR_SET,CREATE,APPEND)) {
            for (String entry : MERGE_ORDER) {
                Path tempFile = FileDictionary.getFilePath(entry);
                if (Files.exists(tempFile)) {
                    try {
                        reader = Files.newBufferedReader(FileDictionary.getFilePath(entry));
                        String line = null;
                        while((line = reader.readLine()) !=null) {
                            writer.write(line);
                            writer.newLine();
                        }
                    } finally {
                        if(reader != null) {
                            reader.close();
                        }
                    }
                }
            }
        }
        System.out.format("Time taken to merge the content: %s ms %n", Duration.between(start,Instant.now()).toMillis());
    }


    /**
     * Static initilizer which defines the order in which the temporary files needs to be merged to create the final output file.
     * This order will us achieve the descending order of words.
     */
    static {
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Y");
        MERGE_ORDER.add("X");
        MERGE_ORDER.add("W");
        MERGE_ORDER.add("V");
        MERGE_ORDER.add("U");
        MERGE_ORDER.add("T");
        MERGE_ORDER.add("S");
        MERGE_ORDER.add("R");
        MERGE_ORDER.add("Q");
        MERGE_ORDER.add("P");
        MERGE_ORDER.add("O");
        MERGE_ORDER.add("N");
        MERGE_ORDER.add("M");
        MERGE_ORDER.add("L");
        MERGE_ORDER.add("K");
        MERGE_ORDER.add("J");
        MERGE_ORDER.add("I");
        MERGE_ORDER.add("H");
        MERGE_ORDER.add("G");
        MERGE_ORDER.add("F");
        MERGE_ORDER.add("E");
        MERGE_ORDER.add("D");
        MERGE_ORDER.add("C");
        MERGE_ORDER.add("B");
        MERGE_ORDER.add("A");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("Z");
        MERGE_ORDER.add("9");
        MERGE_ORDER.add("8");
        MERGE_ORDER.add("7");
        MERGE_ORDER.add("6");
        MERGE_ORDER.add("5");
        MERGE_ORDER.add("4");
        MERGE_ORDER.add("3");
        MERGE_ORDER.add("2");
        MERGE_ORDER.add("1");
        MERGE_ORDER.add("0");
        MERGE_ORDER.add("everything_else");
    }

}
