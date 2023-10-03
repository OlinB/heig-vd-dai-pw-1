package ch.heigvd.dai.ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class TextFileReader {

    public String read(String filename, Charset encoding) {
        try(Reader reader = new FileReader(filename, encoding)){
            return reader.toString();
        } catch (FileNotFoundException e) {
            // TODO
        } catch (IOException e) {
            // TODO
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
