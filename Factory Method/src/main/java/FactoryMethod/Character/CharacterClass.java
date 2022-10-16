package FactoryMethod.Character;

public abstract class CharacterClass {
    protected String name;
    protected int hp;

    public abstract void printMagica();

    public int getHp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Character " + name + ", health: " + hp;
    }
}
