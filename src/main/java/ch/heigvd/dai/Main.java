package ch.heigvd.dai;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.util.concurrent.Callable;

@Command(name = "replaceWord", mixinStandardHelpOptions = true, version = "replaceWord 0.1",
        description = "Replace all occurence of specific work in a file text and create new file")
class ReplaceWord implements Callable<Integer>{
    @Option(names = {"-i", "--if","--inputFile"}, paramLabel = "ARCHIVE",
            description = "input file whose the specific word will be searched")
    //private File inputFile;
    private String inputFile;

    @Option(names = {"--ie", "--inputEncoding"}, defaultValue = "UTF-8", description = "Encoding of the input file")
    private String inputEncoding;

    @Option(names = {"-o", "--of", "--outputFile"}, paramLabel = "FILE",
            description = "output file whose will be created with the word replaced")
    //private File outputFile;
    private String outputFile;

    @Option(names = {"--oe", "--outputEncoding"}, defaultValue = "UTF-8", description = "Encoding of the output file")
    private String outputEncoding;

    @Option(names = {"-h", "--help"}, usageHelp = true, description = "display a help message")
    private boolean helpRequested = false;

    @Option(names = {"-s", "--sw", "--searchedWord"}, paramLabel = "SEARCH",
    description = "The searched word will be replaced")
    private String searchedWord;

    @Option(names = {"-r", "--rw", "--replacedWord"}, paramLabel = "REPLACE",
    description = "The remplacement word")
    private String replacedWord;

    @Override
    public Integer call() throws Exception{
        ch.heigvd.dai.string.ReplaceWord.replaceInFile(inputFile, outputFile, searchedWord, replacedWord);
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        new CommandLine(new Main()).execute(args);
    }
}