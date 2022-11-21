package GUI;

import CharacterCreator.ClassAbstractFactory;
import CharacterCreator.Character;
import CharacterCreator.DwarfFactory;
import CharacterCreator.ElfFactory;
import CharacterCreator.FighterFactory;
import CharacterCreator.SorcererFactory;
import CharacterCreator.RaceAbstractFactory;
import CharacterCreator.ClassFactory;
import CharacterCreator.RaceFactory;
import Memento.CareTaker;
import CharacterCreator.Stats;
import Visitor.ElementVisitor;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.IOException;
import Visitor.DataElement;

public class Controller {
    private static Model mode=Model.getInst();
    private static int it=0;
    private static String[] listData=new String[5];//only 5 characters alowed
    
    public static void generateStats(){
        GUI.jTextField2.setText(mode.getStat().getStats().get("Strength").toString());
        GUI.jTextField3.setText(mode.getStat().getStats().get("Dexterity").toString());
        GUI.jTextField4.setText(mode.getStat().getStats().get("Constitution").toString());
        GUI.jTextField5.setText(mode.getStat().getStats().get("Intelligence").toString());
        GUI.jTextField6.setText(mode.getStat().getStats().get("Wisdom").toString());
        GUI.jTextField7.setText(mode.getStat().getStats().get("Charisma").toString());
    }
    
    public static void runMemento(){
        if(!mode.getStat().equals(null)){
            mode.setCaretaker(new CareTaker());
            mode.getCaretaker().add(mode.getStat().save());
            GUI.jTextArea1.setText("Attributes saved");
        }
    }
    
    public static void returnMemento(){
        try{
            mode.getStat().undoToLastSave(mode.getCaretaker().getLast());
            
            GUI.jTextField2.setText(mode.getStat().getStats().get("Strength").toString());
            GUI.jTextField3.setText(mode.getStat().getStats().get("Dexterity").toString());
            GUI.jTextField4.setText(mode.getStat().getStats().get("Constitution").toString());
            GUI.jTextField5.setText(mode.getStat().getStats().get("Intelligence").toString());
            GUI.jTextField6.setText(mode.getStat().getStats().get("Wisdom").toString());
            GUI.jTextField7.setText(mode.getStat().getStats().get("Charisma").toString());
        }
        catch(NullPointerException ex){
            GUI.jTextArea1.setText("No saved attributes found");
        }
    }
    
    public static void createCharacter(){
        if (mode.getStat() != null){
            
            if (it < 5) {
                String name = GUI.jTextField1.getText().toString();
                String cla = GUI.jComboBox2.getSelectedItem().toString();
                String race = GUI.jComboBox1.getSelectedItem().toString();
                System.out.println(name+" "+cla+" "+race);
                mode.setCha(name,cla,race);
                mode.getCha().setAttributes(mode.getStat());     
                mode.getCha().addRaceBonuses();
                mode.addItem(mode.getCha());
                System.out.println(mode.getCha().getChClass().toString());
                mode.getVisitor().visit(mode.getCha());
                GUI.jTextArea1.setText("Character "+name+" created!");
                listData[it]=race+"-"+cla+" "+name;
                GUI.jList1.setListData(listData);
                it++;
            } else {    
                GUI.jTextArea1.setText("Only 5 characters allowed");
            }
        } else {    
            GUI.jTextArea1.setText("Generate attributes before creating character");
        }
    }
    
    public static void saveJSON() throws IOException {
        String str="[\n";
            
        for(Character ch:mode.getItems()){
            mode.getJsonObject().clear();
            List<DataElement> list = new ArrayList<>();
            list.add(ch);
            list.add(ch.getChClass());
            list.add(ch.getRace());
            list.add(ch.getAttributes());
            
            
                for(DataElement elem:list){
                mode.setJsonObject(elem.accept(mode.getVisitor()));
            }
                str+=mode.getJsonObject().toJSONString();
                str+="\n";
            
        if(mode.getItems().indexOf(ch)!=mode.getItems().size()-1){str+=",";}                
        }
        
        str+="\n]";
        GUI.jTextArea2.setText(str);
        FileWriter file = new FileWriter("output.json");
        file.write(str);
        file.close();    
    }
    
     static void printSelected() {
            GUI.jTextArea1.setText("");
            mode.getJsonObject().clear();
            List<DataElement> list = new ArrayList<>();
            list.add(mode.getCha());
            list.add(mode.getCha().getChClass());
            list.add(mode.getCha().getRace());
            list.add(mode.getCha().getAttributes());
            
            String str="";
                for(DataElement elem:list){
                mode.setJsonObject(elem.accept(mode.getVisitor()));
            }
                str=mode.getJsonObject().toJSONString();
                
            GUI.jTextArea1.setText(str);          
    }
}
