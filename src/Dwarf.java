public class Dwarf {
    String name;
    Stats dwarfStats;
    public Dwarf(){
        this.dwarfStats = new Stats();
        dwarfTrait();
    }
    private void dwarfTrait(){
        dwarfStats.raiseConstitution(1);
        dwarfStats.raiseStrength(2);
    }
}
