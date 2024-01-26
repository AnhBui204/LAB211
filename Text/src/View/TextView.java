
package View;

import Model.TextModel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextView {

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void normalizeText(TextModel textModel) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(textModel.getInputFileName()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(textModel.getOutputFileName()))) {

            boolean isFirstLine = true;
            String line;

            while ((line = reader.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    line = removeBlankLineBetweenLines(line)
                            .concat(normalizeOneSpaceBetweenWords(line))
                            .concat(removeSpacesInsideQuotes(line))
                            .concat(dotLastLine(line))
                            .concat(normalizeOneSpaceAfterPunctuation(line))
                            .concat(capitalizeAfterDot(line))
                            .concat(capitalizeFirstWordInFirstLine(line, isFirstLine))
                            .concat(removeSpaceBeforeCommaAndDot(line));

                    writer.write(line);
                    isFirstLine = false;
                }
            }
        } catch (IOException e) {
            throw new IOException("Error reading or writing file: " + e.getMessage(), e);
        }
    }

    public String capitalizeAfterDot(String line) {
        StringBuilder sb = new StringBuilder(line);

        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == '.' && Character.isWhitespace(sb.charAt(i + 1))) {
                if (i + 2 < sb.length()) {
                    sb.setCharAt(i + 2, Character.toUpperCase(sb.charAt(i + 2)));
                    i++;
                }
            }
        }

        return sb.toString();
    }

    public String dotLastLine(String str) {
        return str.endsWith(".") ? str : str + ".";
    }

    public String normalizeOneSpaceAfterPunctuation(String line) {
        return line.replaceAll("\\s(?=[.,:])", "");
    }

    public String normalizeOneSpaceBetweenWords(String line) {
        return line.replaceAll("\\s+", " ");
    }

    public String removeSpacesInsideQuotes(String line) {
        String pattern = "\"\\s+(.*?)\\s+\"";
        return line.replaceAll(pattern, "\"$1\"");
    }

    public String removeBlankLineBetweenLines(String line) {
        return line.trim();
    }

    public String capitalizeFirstWordInFirstLine(String line, boolean isFirstLine) {
        return isFirstLine ? Character.toUpperCase(line.charAt(0)) + line.substring(1) : line;
    }

    public String removeSpaceBeforeCommaAndDot(String line) {
        return line.replaceAll("(?<!\\s)[.,](?!\\s)", "$0 ");
    }
}
