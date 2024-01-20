public class Orc extends Race{
        private String name;

        //Creates a human
        public Orc() {
            NameGen name = new NameGen();
            this.name = name.createOrc();
            orcTrait();
        }

        //Raises STR,AGI,CON with 1
        private void orcTrait() {
            stats.raiseStrength(3);
            stats.lowerIntelligence(2);
        }

        //Getters
        public String getName() {
            return name;
        }

        //    Prints out Human info
        public void printOrc() {
            printCharSheet();
        }

        //    Returns human info
        public String getOrc() {
            return getCharSheet();
        }
}


