package com.fp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class FileTargetPath {
    public static Path TEMP_LOCATION;
    public static Path OUTPUT_FILE_LOCATION;

    /**
     * Sets up the necessary directory stuctures
     * @throws IOException
     */
    public void setPreRequisites() throws IOException {
        Path targetPath = Paths.get(FileDictionary.class.getResource(File.separator).getPath());
        Path tempFolder = Paths.get(targetPath.toAbsolutePath()+File.separator + Constants.TEMP_FOLDER);
        Path outputFolder = Paths.get(targetPath.toAbsolutePath()+File.separator + Constants.OUTPUT_FOLDER);
        TEMP_LOCATION = tempFolder.toAbsolutePath();
        OUTPUT_FILE_LOCATION = outputFolder.toAbsolutePath();
        if(Files.exists(tempFolder)){
            cleanUp();
        }
        Files.createDirectory(tempFolder);
        if(!Files.exists(outputFolder)){
            Files.createDirectory(outputFolder);
        }
    }

    /**
     * Generates the output file name and returns the absolute path of its final location.
     * @return absolute path of the output file
     */

    public Path getOutputPath(){
        String outputFileName = Constants.OUTPUT_FILE_NAME_PREFIX+"_"+ LocalDateTime.now()+"_"+Constants.OUTPUT_FILE_NAME_SUFFIX;
        Path outputFile = Paths.get(OUTPUT_FILE_LOCATION +File.separator+outputFileName);
        return outputFile.toAbsolutePath();
    }

    /**
     * Cleans up the working directories.
     * @throws IOException
     */
    public void cleanUp() throws  IOException{
        Files.list(TEMP_LOCATION).forEach(filePath -> {
            try{
                Files.deleteIfExists(filePath);
            }catch (IOException ioe){
                System.err.println("Failed to delete the file in temp folder. "+ioe);
            }
        });
        Files.deleteIfExists(TEMP_LOCATION);
    }
}
