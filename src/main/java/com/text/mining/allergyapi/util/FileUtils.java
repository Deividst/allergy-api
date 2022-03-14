package com.text.mining.allergyapi.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileUtils {

    public static String readFile(InputStream inputStream) throws IOException {
        try {
            ArrayList<String> lines = new ArrayList<>();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader);

            String line;
            while((line = bufferedReader.readLine()) != null){
                lines.add(line);
            }
            return String.join("\n", lines);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

}
