package Controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TextControllers {

    public String readToFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = "";
            while (true) {
                if (line == null) {
                    break;
                }
                line = br.readLine();
                content.append(line).append("\n");
                br.close();
            }
        } catch (Exception e) {
            System.err.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
        return content.toString();
    }

    public void writeToFile(String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"))) {
            bw.write(content);
            bw.close();
        } catch (Exception e){
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public String removeExtraSpaces(String content) {//Xu ly khoang trang
        content = content.trim().replaceAll("\\s+", " ");
        return content;
    }

    public String capitalizeAfterDot(String content) {//Xu ly chu in hoa sau dau cham
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        
        for (char c : content.toCharArray()) {
            if(capitalizeNext && Character.isLetter(c)){
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }
            if(c == '.'){
                capitalizeNext = true;
            }
        }
        return result.toString();
    }

}
