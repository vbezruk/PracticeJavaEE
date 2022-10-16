package AbstractFactory.Stats;

import java.util.HashMap;
import java.util.Map;

public class Stats {
    private final Map<String, Integer> stats;

    public Stats(int str, int dex, int con, int inl, int wis, int cha) {
        stats = new HashMap<>();

        stats.put("Strength", str);
        stats.put("Dexterity", dex);
        stats.put("Constitution", con);
        stats.put("Intelligence", inl);
        stats.put("Wisdom", wis);
        stats.put("Charisma", cha);
    }

    private Stats() {
        stats = new HashMap<>();
    }

    public static Stats generate() {
        Stats stats = new Stats();

        stats.stats.put("Strength", Dice.rollStat());
        stats.stats.put("Dexterity", Dice.rollStat());
        stats.stats.put("Constitution", Dice.rollStat());
        stats.stats.put("Intelligence", Dice.rollStat());
        stats.stats.put("Wisdom", Dice.rollStat());
        stats.stats.put("Charisma", Dice.rollStat());

        return stats;
    }

    public Map<String, Integer> getStats() {
        return stats;
    }
}
