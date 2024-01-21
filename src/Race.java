public class Race {
    Stats stats;

    public Race() {
        this.stats = new Stats();
    }

    protected String getName() {
        return "";
    }

    public int getStrength() { return stats.getStrength(); }
    public int getDexterity() { return stats.getDexterity(); }
    public int getIntelligence() { return stats.getIntelligence(); }
    public int getConstitution() { return stats.getConstitution(); }

    public void printCharSheet() {
        System.out.println(
                "Name: " + getName() + "\n" +
                        stats.toString());
    }

    public String getCharSheet() {
        return stats.toString();
    }
}
