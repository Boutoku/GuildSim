public class Stats {
    private int strength;
    private int agility;
    private int intelligence;
    private int constitution;

    public Stats() {
        Dice threeD6 = new Dice(6);

        strength = threeD6.rollDice(3);
        agility = threeD6.rollDice(3);
        intelligence = threeD6.rollDice(3);
        constitution = threeD6.rollDice(3);
    }

    public void setStats(int strength, int agility, int intelligence, int constitution) {
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.constitution = constitution;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void raiseStrength(int raise) {
        strength += raise;
    }

    public void raiseAgility(int raise) {
        agility += raise;
    }

    public void raiseIntelligence(int raise) {
        intelligence += raise;
    }

    public void raiseConstitution(int raise) {
        constitution += raise;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void printStats() {
        System.out.println(
                        "Strength: " + strength + "\n" +
                        "agility: " + agility + "\n" +
                        "intelligence: " + intelligence + "\n" +
                        "constitution: " + constitution
        );
    }
}
