package Visitor;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {

    public static void main(String[] args) throws IOException {
        ElementVisitor visitor = new ElementVisitor();
        JSONObject jsonObject = new JSONObject();
        FileWriter file = new FileWriter("output.json");
        List<DataElement> list = new ArrayList<>();

        RaceAbstractFactory raceAbstractFactory = new DwarfFactory();
        Character character1 = new Character("Dwarf", raceAbstractFactory.create());
        character1.addRaceBonuses();
        character1.getRace();

        list.add(character1);
        list.add(character1.getRace());
        list.add(character1.getAttributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.accept(visitor));
        }

        file.write("[");
        file.write(jsonObject.toJSONString());
        list.clear();

        raceAbstractFactory = new ElfFactory();
        Character character2 = new Character("Elf", raceAbstractFactory.create());
        character2.addRaceBonuses();

        list.add(character2);
        list.add(character2.getRace());
        list.add(character2.getAttributes());

        for (DataElement elem: list){
            jsonObject.putAll(elem.accept(visitor));
        }

        file.write(" , ");
        file.write(jsonObject.toJSONString());
        file.write("]");
        file.close();
    }
}