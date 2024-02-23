/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DictionaryModel;
import View.DictionaryView;

/**
 *
 * @author XUAN LINH
 */
public class DictionaryController {
    private DictionaryModel model;
    private DictionaryView view;

    public DictionaryController(DictionaryModel model, DictionaryView view) {
        this.model = model;
        this.view = view;
    }
   public void run(int choice){
       switch(choice){
           case 1:
                   addWord();
                   break;
           case 2:
                   RemoveWord();
                   break;
           case 3:
                   searchWord();
                   break;
           case 4:
                   view.DisplayMessage("Exiting Program.");
                   break;
           default:
                System.out.println("Error");
       }
       }
   private void addWord(){
       view.DisplayMessage("Enter English word: ");
       String eng=view.getInput();
       view.DisplayMessage("Enter Vietnamese word: ");
       String vi=view.getInput();
       if(model.getDictionary().containsKey(eng)){
           view.DisplayMessage("Word already exist.Do you want update word?");
           String choice=view.getInput().toUpperCase();
           if(choice.equals("Y")){
               model.addWord(eng, vi);
               view.DisplayMessage("Word update successfully");
           }
       }else{
           model.addWord(eng, vi);
           view.DisplayMessage("Add word Successfully");
       }
   }
   private void RemoveWord(){
       view.DisplayMessage("Enter word you want delete: ");
       String eng=view.getInput();
       if(model.getDictionary().containsKey(eng)){
           model.removeword(eng);
           view.DisplayMessage("Delete word successfully ");
       }else{
           view.DisplayMessage("Not found word!");
       }
   }
   private void searchWord(){
       view.DisplayMessage("Enter word you want search:  ");
       String eng=view.getInput();
       if(model.getDictionary().containsKey(eng)){
           view.DisplayMessage("Vietnamese Traslation: "+model.getDictionary().get(eng));
       }else{
           view.DisplayMessage("Not founded word!");
       }
   }
}
