package ch.heigvd.dai.ios;

import java.io.FileWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TextFileWriter {

    public void write(String filename, String content, Charset encoding) {
        try(Writer writer = new FileWriter(filename, encoding)){
            writer.write(content.toString());
        } catch (FileNotFoundException e) {
            // TODO
        } catch (IOException e) {
            // TODO
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
