public class Elf extends Race{
    private String name;
    public Elf(){
        NameGen name = new NameGen();
        this.name=name.createElf();
        elfTrait();
    }
    private void elfTrait(){
        stats.raiseDexterity(1);
        stats.raiseIntelligence(2);
    }
    public String getName() {
        return name;
    }
    public void printElf() {
        printCharSheet();
    }
    public String toString() {
        return getCharSheet();
    }
}
