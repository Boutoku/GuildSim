public class Test {
    public static void main(String[] args) {

        /* Dice Test
        /  Dice d =new Dice(20);
        /  d.rollDice(5); */

        /* Stats Test
        /  Stats s = new Stats();
        /  s.printStats(); */

        //Race Test
        Human h = new Human();
        h.printHuman();
        System.out.println("\n");

        Elf e = new Elf();
        e.printElf();
        System.out.println("\n");

        Dwarf d = new Dwarf();
        d.printDwarf();
        System.out.println("\n");

        Orc o = new Orc();
        o.printOrc();
    }
}
