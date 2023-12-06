public class Dwarf {
    private String name;
    private Stats dwarfStats;
    public Dwarf(){
        NameGen name = new NameGen();
        this.name = name.createDwarf();
        this.dwarfStats = new Stats();
        dwarfTrait();
    }
    private void dwarfTrait(){
        dwarfStats.raiseConstitution(1);
        dwarfStats.raiseStrength(2);
    }
    public String getName(){
        return name;
    }
    public int getStrength(){
        return dwarfStats.getStrength();
    }

    public int getAgility(){
        return dwarfStats.getDexterity();
    }

    public int getIntelligence() {
        return dwarfStats.getIntelligence();
    }

    public int getConstitution() {
        return dwarfStats.getConstitution();
    }
    public void printDwarf() {
        System.out.println(
                        "Name: " + name + "\n" +
                        "Strength: " + dwarfStats.getStrength() + "\n" +
                        "Dexterity: " + dwarfStats.getDexterity() + "\n" +
                        "Intelligence: " + dwarfStats.getIntelligence() + "\n" +
                        "Constitution: " + dwarfStats.getConstitution());
    }
}
