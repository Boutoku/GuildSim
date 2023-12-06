public class Human {
    private String name;
    private Stats humanStats;

    //Creates a human
    public Human() {
        NameGen name = new NameGen();
        this.name = name.createHuman();
        this.humanStats = new Stats();
        humanTrait();
    }

    //Raises STR,AGI,CON with 1
    private void humanTrait() {
        humanStats.raiseStrength(1);
        humanStats.raiseDexterity(1);
        humanStats.raiseIntelligence(1);
    }

    //Getters
    public int getStrength() {
        return humanStats.getStrength();
    }

    public int getAgility() {
        return humanStats.getDexterity();
    }

    public int getIntelligence() {
        return humanStats.getIntelligence();
    }

    public int getConstitution() {
        return humanStats.getConstitution();
    }

    //    Prints out Human info
    public void printHuman() {
        System.out.println(
                "Name: " + name + "\n" +
                        "Strength: " + humanStats.getStrength() + "\n" +
                        "Dexterity: " + humanStats.getDexterity() + "\n" +
                        "Intelligence: " + humanStats.getIntelligence() + "\n" +
                        "Constitution: " + humanStats.getConstitution());
    }

    //    Returns human info
    public String getHuman() {
        return  "Strength: " + humanStats.getStrength() +
                ",Dexterity: " + humanStats.getDexterity() +
                ",Intelligence: " + humanStats.getIntelligence() +
                ",Constitution: " + humanStats.getConstitution();
    }
}
