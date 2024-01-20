public class Stats {
    private int strength;
    private int dexterity;
    private int intelligence;
    private int constitution;

    public Stats() {
        Dice threeD6 = new Dice(6);

        strength = threeD6.rollDice(3);
        dexterity = threeD6.rollDice(3);
        intelligence = threeD6.rollDice(3);
        constitution = threeD6.rollDice(3);
    }

    //Setters
    public void setStats(int strength, int dexterity, int intelligence, int constitution) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.constitution = constitution;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setAgility(int dexterity) {
        this.dexterity = dexterity;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    //Raise and lower stats
    public void raiseStrength(int raise) {
        strength += raise;
    }
    public void raiseDexterity(int raise) {
        dexterity += raise;
    }
    public void raiseIntelligence(int raise) {
        intelligence += raise;
    }
    public void raiseConstitution(int raise) {
        constitution += raise;
    }

    public void lowerConstitution(int lower) {
        constitution -= lower;
    }
    public void lowerStrength(int lower) {
        strength -= lower;
    }
    public void lowerDexterity(int lower) {
        dexterity -= lower;
    }
    public void lowerIntelligence(int lower) {
        intelligence -= lower;
    }

    //Getters
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getConstitution() {
        return constitution;
    }

    public String toString() {
        return "Strength: " + strength + "\n" +
                "Dexterity: " + dexterity + "\n" +
                "Intelligence: " + intelligence + "\n" +
                "Constitution: " + constitution;
    }
}
