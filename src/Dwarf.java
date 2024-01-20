public class Dwarf extends Race {
    private String name;

    public Dwarf() {
        NameGen name = new NameGen();
        this.name = name.createDwarf();
        dwarfTrait();
    }

    private void dwarfTrait() {
        stats.raiseConstitution(1);
        stats.raiseStrength(2);
    }

    public String getName() { return name; }

    public void printDwarf() { printCharSheet(); }

    public String toString() { return getCharSheet(); }
}
