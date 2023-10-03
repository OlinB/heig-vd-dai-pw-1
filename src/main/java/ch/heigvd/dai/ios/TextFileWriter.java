package ch.heigvd.dai.ios;

import java.io.*;
import java.nio.charset.Charset;

public class TextFileWriter {

    public static BufferedWriter writer(String filename, Charset encoding) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, encoding));
            return writer;
        } catch (FileNotFoundException e) {
            // TODO
        } catch (IOException e) {
            // TODO
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
