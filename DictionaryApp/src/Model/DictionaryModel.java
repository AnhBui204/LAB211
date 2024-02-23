/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author XUAN LINH
 */
public class DictionaryModel {
    private Map<String,String>dictionary;

   public DictionaryModel(){
       dictionary=new HashMap();
       loadData();
   }
   public Map<String,String>getDictionary(){
       return dictionary;
   }
   public void addWord(String eng,String vi){
       dictionary.put(eng, vi);
       updateDatabase();
   }
   public void removeword(String eng){
       dictionary.remove(eng);
       updateDatabase();
   }
   private void loadData(){
        try (BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                dictionary.put(parts[0], parts[1]);
            }
        } catch (IOException e) {
            
        }
    }
   
  private void updateDatabase(){
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("dictionary.txt"))) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  }

