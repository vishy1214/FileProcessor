package com.fp;

import java.nio.charset.Charset;

/**
 * Basic contants
 */
public class Constants {

    public static final String CHAR_FORMAT = "UTF-8";
    public static final Charset CHAR_SET = Charset.forName(CHAR_FORMAT);

    public static final String TEMP_FOLDER = "temp";
    public static final String OUTPUT_FOLDER = "output";
    public static final String OUTPUT_FILE_NAME_PREFIX = "processed";
    public static final String OUTPUT_FILE_NAME_SUFFIX = ".txt";
}
