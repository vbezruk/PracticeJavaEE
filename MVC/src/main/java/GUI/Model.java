package GUI;
//part of model, the whole model is all previous project

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

public class Model {

    public static  Model getInst() {
        return inst;
    }
    private static Model inst=new Model();
    private  List<Character> items=new ArrayList<Character>();
    private  Stats stat;
    private  CareTaker caretaker;
    private  Character cha=null;
    private  ElementVisitor visitor=new ElementVisitor();
    private  JSONObject jsonObject = new JSONObject();
    private  JSONArray jarray=new JSONArray();
    
    public List<Character> getItems() {
        return items;
    }
    public JSONArray getJarray() {
        return jarray;
    }

    public void add2Jarray(JSONObject job) {
        this.jarray.add(job);
    }
    

    public  Stats getStat() {
        stat = Stats.generate();
        
        return stat;
    }

    public  void setStat(Stats stat) {
        this.stat = stat;
    }

    public  CareTaker getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(CareTaker caretaker) {
        this.caretaker = caretaker;
    }

    public  Character getCha() {
        return cha;
    }

    public ElementVisitor getVisitor() {
        return visitor;
    }

    public  void setVisitor(ElementVisitor visitor) {
        this.visitor = visitor;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(TreeMap tm) {
        this.jsonObject.putAll(tm);
        
    }

    void setCha(String name, String cla, String race) {
        RaceAbstractFactory raceFactory = null;
        if(race.contains("Elf")){raceFactory=new ElfFactory();}
        else if(race.contains("Dwarf")){raceFactory=new DwarfFactory();}
        
        ClassAbstractFactory classFactory = null;
        if(cla.contains("Fighter")){classFactory=new FighterFactory();}
        else if(cla.contains("Sorcerer")){classFactory=new SorcererFactory();}
        
        
        this.cha=new Character(name, 
                ClassFactory.getClass(classFactory), RaceFactory.getRace(raceFactory));
    }

    public Character getItem(int i) {
        return items.get(i);
    }

    public void addItem(Character it) {
        this.items.add(it);
    }
    public void deleteItem(int it) {
        this.items.remove(it);
    }

}