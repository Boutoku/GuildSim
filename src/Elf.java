public class Elf {
    String name;
    Stats elfStats;
    public Elf(){
        NameGen name = new NameGen();
        this.name=name.createElf();
        this.elfStats=new Stats();
        elfTrait();
    }
    private void elfTrait(){
        elfStats.raiseAgility(1);
        elfStats.raiseIntelligence(2);
    }
    public void printElf() {
        System.out.println(
                "Name: " + name + "\n" +
                        "Strength: " + elfStats.getStrength() + "\n" +
                        "Agility: " + elfStats.getAgility() + "\n" +
                        "Intelligence: " + elfStats.getIntelligence() + "\n" +
                        "Constitution: " + elfStats.getConstitution());
    }
}
