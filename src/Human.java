public class Human extends Race{
    private String name;

    //Creates a human
    public Human() {
        NameGen name = new NameGen();
        this.name = name.createHuman();
        humanTrait();
    }

    //Raises STR,AGI,CON with 1
    private void humanTrait() {
        stats.raiseStrength(1);
        stats.raiseDexterity(1);
        stats.raiseIntelligence(1);
    }
    public String getName() {
        return name;
    }

    //    Prints out Human info
    public void printHuman() { printCharSheet(); }

    //    Returns human info
    public String toString() { return getCharSheet(); }
}
