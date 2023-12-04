public class Human {
    String name;
    Stats humanStats;

    //Creates a human
    public Human(){
        this.humanStats = new Stats();
        humanTrait();
    }

    //Raises STR,AGI,CON with 1
    private void humanTrait(){
        humanStats.raiseStrength(1);
        humanStats.raiseAgility(1);
        humanStats.raiseIntelligence(1);
    }

    public int getStrength(){
        return humanStats.getStrength();
    }

    public int getAgility(){
        return humanStats.getAgility();
    }

    public int getIntelligence() {
        return humanStats.getIntelligence();
    }

    public int getConstitution() {
        return humanStats.getConstitution();
    }

    public void printHuman(){
        System.out.println("Strength: "+humanStats.getStrength()+"\n"+
                "Agility: "+humanStats.getAgility()+"\n"+
                "Intelligence: "+humanStats.getIntelligence()+"\n"+
                "Constitution: "+humanStats.getConstitution());
    }
    public String getHuman(){
        return "Strength: "+humanStats.getStrength()+
                ",Agility: "+humanStats.getAgility()+
                ",Intelligence: "+humanStats.getIntelligence()+
                ",Constitution: "+humanStats.getConstitution();
    }
}
