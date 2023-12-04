public class Elf {
    String name;
    Stats elfStats;
    public Elf(){
        this.elfStats=new Stats();
        elfTrait();
    }
    private void elfTrait(){
        elfStats.raiseAgility(1);
        elfStats.raiseIntelligence(2);
    }
}
