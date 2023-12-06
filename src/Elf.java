public class Elf {
    private String name;
    private Stats elfStats;
    public Elf(){
        NameGen name = new NameGen();
        this.name=name.createElf();
        this.elfStats=new Stats();
        elfTrait();
    }
    private void elfTrait(){
        elfStats.raiseDexterity(1);
        elfStats.raiseIntelligence(2);
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return elfStats.getStrength();
    }

    public int getAgility(){
        return elfStats.getDexterity();
    }

    public int getIntelligence() {
        return elfStats.getIntelligence();
    }

    public int getConstitution() {
        return elfStats.getConstitution();
    }
    public void printElf() {
        System.out.println(
                "Name: " + name + "\n" +
                        "Strength: " + elfStats.getStrength() + "\n" +
                        "Dexterity: " + elfStats.getDexterity() + "\n" +
                        "Intelligence: " + elfStats.getIntelligence() + "\n" +
                        "Constitution: " + elfStats.getConstitution());
    }
}
