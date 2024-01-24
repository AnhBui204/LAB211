package Models;

public class NormalizeTextModel {
    private String inputFile;
    private String outputFile;

    public NormalizeTextModel() {
    }

    public NormalizeTextModel(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public String getInputFile() {
        return inputFile;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }

    @Override
    public String toString() {
        return  "TextModel{" +
                "inputFileName='" + inputFile + '\'' +
                ", outputFileName='" + outputFile + '\'' +
                '}';
    }
    
   
}
   
