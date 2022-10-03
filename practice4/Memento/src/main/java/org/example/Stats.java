package org.example;

public class Stats {
    private Stats state;

    private int str;
    private int dex;
    private int con;
    private int inte;
    private int wis;
    private int cha;

    public Stats() {
        str = 0;
        dex = 0;
        cha = 0;
        inte = 0;
        wis = 0;
        cha = 0;
    }

    public Stats(int str, int dex, int con, int inte, int wis, int cha) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
    }

    public Stats(Stats state) {
        this.state = state;
    }

    public int getCha() {
        return cha;
    }

    public int getCon() {
        return con;
    }

    public int getDex() {
        return dex;
    }

    public Stats getState() {
        return state;
    }

    public int getInte() {
        return inte;
    }

    public int getStr() {
        return str;
    }

    public int getWis() {
        return wis;
    }

    public static Stats generateStats() {
        return new Stats(Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat(), Dice.rollStat());
    }

    public void printStats() {
        System.out.println("Attributes info:" + "\nStrength: " + str +
                "\nDexterity: " + dex + "\nConstitution: " + con +
                "\nIntelligence: " + inte + "\nWisdom: " + wis + "\nCharisma: " + cha + "\n");
    }
}
