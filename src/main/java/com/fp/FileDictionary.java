package com.fp;


import java.io.File;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Its a reference class which maintains the dictionary of word's starting characters & its corresponding working/temporary file names.
 */
public final class FileDictionary {
    private final static Map<String,String> DICTIONARY = new HashMap<>();


    /**
     * Given the starting charater of the words, it returns the Path reference
     * @param firstLetter
     * @return
     */
    public static Path getFilePath(String firstLetter){
        String fileName = DICTIONARY.get(firstLetter.toUpperCase());
        if(fileName == null){
            fileName = DICTIONARY.get("everything_else");
        }
        return Paths.get(FileTargetPath.TEMP_LOCATION+File.separator+ fileName);
    }

    /**
     * Static initilizer which establishes the dictionary.
     */
    static {
        DICTIONARY.put("A","A.txt");
        DICTIONARY.put("B","B.txt");
        DICTIONARY.put("C","C.txt");
        DICTIONARY.put("D","D.txt");
        DICTIONARY.put("E","E.txt");
        DICTIONARY.put("F","F.txt");
        DICTIONARY.put("G","G.txt");
        DICTIONARY.put("H","H.txt");
        DICTIONARY.put("I","I.txt");
        DICTIONARY.put("J","J.txt");
        DICTIONARY.put("K","K.txt");
        DICTIONARY.put("L","L.txt");
        DICTIONARY.put("M","M.txt");
        DICTIONARY.put("N","N.txt");
        DICTIONARY.put("O","O.txt");
        DICTIONARY.put("P","P.txt");
        DICTIONARY.put("Q","Q.txt");
        DICTIONARY.put("R","R.txt");
        DICTIONARY.put("S","S.txt");
        DICTIONARY.put("T","T.txt");
        DICTIONARY.put("U","U.txt");
        DICTIONARY.put("V","V.txt");
        DICTIONARY.put("W","W.txt");
        DICTIONARY.put("X","X.txt");
        DICTIONARY.put("Y","Y.txt");
        DICTIONARY.put("Z","Z.txt");
        DICTIONARY.put("O","O.txt");
        DICTIONARY.put("1","1.txt");
        DICTIONARY.put("2","2.txt");
        DICTIONARY.put("3","3.txt");
        DICTIONARY.put("4","4.txt");
        DICTIONARY.put("5","5.txt");
        DICTIONARY.put("6","6.txt");
        DICTIONARY.put("7","7.txt");
        DICTIONARY.put("8","8.txt");
        DICTIONARY.put("9","9.txt");
        DICTIONARY.put("everything_else","everything_else.txt");
    }
}
