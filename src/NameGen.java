import java.util.Random;

public class NameGen {
    public static final String[] HUMAN_FIRSTNAMES = {
            "Alden", "Thorian", "Eldric", "Gareth", "Kaelen", "Rowan", "Darian", "Lorcan", "Brennan", "Finnian",
            "Galen", "Emeric", "Torin", "Aldric", "Cedric", "Declan", "Eirik", "Hadrian", "Jareth", "Keiran",
            "Lysander", "Magnus", "Nolan", "Perrin", "Rylan", "Soren", "Trystan", "Ulric", "Valerian", "Wilhelm",
            "Xander", "Yorick", "Zephyr", "Asher", "Brynjar", "Corin", "Dmitri", "Evander", "Felix", "Griffin",
            "Hayden", "Ivar", "Jorah", "Killian", "Larkin", "Matthias", "Nikolas", "Orin", "Piers", "Quinten",
            "Elysia", "Lyra", "Elara", "Ariana", "Seraphina", "Livia", "Isolde", "Thalia", "Mira", "Eowyn",
            "Althea", "Thalassa", "Cordelia", "Freya", "Genevieve", "Helene", "Iliana", "Juliana", "Kaia",
            "Leilani", "Melisande", "Naida", "Ophelia", "Penelope", "Quinna", "Rhiannon", "Seren", "Tatiana",
            "Undine", "Vespera", "Wren", "Xanthe", "Yvaine", "Zephyrine", "Aurora", "Brielle", "Calista",
            "Dahlia", "Eira", "Faye", "Guinevere", "Hazel", "Imogen", "Jessamine", "Kaida", "Lilith", "Maia",
            "Nyx", "Ovidia", "Persephone"
    };
    public static final String[] HUMAN_SURNAMES = {
            "Blackwood", "Dawnblade", "Stormrider", "Nightingale", "Ironheart", "Shadowcaster", "Emberforge",
            "Frostwind", "Swiftarrow", "Flamecaller", "Evergreen", "Darkwater", "Goldenshield", "Winterbourne",
            "Shadowbrook", "Firebrand", "Oakenshield", "Stonemane", "Brightblade", "Ashenwood", "Starborn",
            "Silverthorn", "Thundershield", "Windrider", "Moonstrider", "Steelheart", "Ravenshadow", "Stormwatcher",
            "Lightbringer", "Frostborn", "Moonwhisperer", "Duskbane", "Oakenshade", "Wildfire", "Nightfall",
            "Skywatcher", "Dragonheart", "Goldleaf", "Winterbane", "Holloway", "Darkstone", "Swiftwind",
            "Highglen", "Lightcaster", "Wildhart", "Shadowkin", "Silverlake", "Stormcrest", "Brightwood",
            "Sunarrow", "Silvermoon", "Starfall", "Shadowdancer", "Frostbloom", "Moonwhisper", "Emberleaf",
            "Stormchaser", "Sunfire", "Skyblade", "Wintercrest", "Dreamweaver", "Fireheart", "Swiftbrook",
            "Lightbloom", "Mistwalker", "Snowbrook", "Skywatcher", "Moonstone", "Emberglow", "Wilderose",
            "Whisperwind", "Frostgale", "Lightbringer", "Stormsong", "Ravenwood", "Brightglen", "Dreamshadow",
            "Silvergale", "Nightshade", "Winterfield", "Brightwood", "Sunshard", "Shadowstorm", "Duskrose",
            "Frostwood", "Starshard", "Wilderain", "Stormbloom", "Swiftwater", "Firebloom", "Nightglen",
            "Goldenshade", "Frostfall", "Silverbrook", "Emberstone", "Moonbeam", "Sunburst", "Shadowbrook",
            "Lightvale", "Thornevale"
    };
    public static final String[] ELF_FIRSTNAMES = {
            "Thalor", "Aerendyl", "Eldrin", "Caelar", "Galad", "Thranduil", "Lorandil", "Elowen", "Cedreon", "Aradan",
            "Thalron", "Faelar", "Sylvan", "Eldorin", "Elaris", "Lorendil", "Ardal", "Thaladon", "Thelion", "Elenion",
            "Maedros", "Elathor", "Erendil", "Thalorin", "Aranion", "Caladrel", "Lorandel", "Elanion", "Thalion", "Aelor",
            "Elarion", "Ardon", "Faelon", "Lorendir", "Thelarion", "Elandil", "Caelion", "Aralion", "Elion", "Eldorion",
            "Thaladir", "Cendril", "Eladon", "Ardion", "Thelos", "Faelion", "Elendil", "Arion", "Lorandel", "Thalorion",
            "Elenwe", "Laeloria", "Aeris", "Galadriel", "Thalindra", "Eloweth", "Lorelei", "Celestria", "Arwen", "Elanor",
            "Thalara", "Faelwen", "Sylvana", "Eldoria", "Elara", "Lorien", "Ardalene", "Thalara", "Thelianthe", "Eladra",
            "Maethril", "Elathara", "Erendra", "Thaloriel", "Aranaya", "Calandria", "Loralie", "Elaneth", "Thalira", "Aelora",
            "Elariana", "Ardwen", "Faelara", "Lorelei", "Theliara", "Elanira", "Caelira", "Aralene", "Elara", "Eldorwen",
            "Thaladia", "Cendrella", "Eladriel", "Ardea", "Thelara", "Faelara", "Elendira", "Arwen", "Loraelle", "Thaloria"

    };
    public static final String[] ELF_SURNAMES = {
            "Starwhisper", "Moonshadow", "Silverbreeze", "Elmheart", "Evenstar", "Sylvanwood", "Thornblade", "Silversong", "Moonflower", "Eldertree",
            "Leafshadow", "Frostleaf", "Evenshade", "Starglow", "Silverbough", "Elmdance", "Whisperwind", "Moonbloom", "Elderbough", "Frostwhisper",
            "Leafbloom", "Evensong", "Stardust", "Silverleaf", "Elmshade", "Whisperleaf", "Moonpetal", "Elderglow", "Frostbloom", "Leafdancer",
            "Evermoon", "Starleaf", "Silverbloom", "Elmwhisper", "Whispermoon", "Moonwillow", "Elderwhisper", "Frostheart", "Leafsong", "Evenwillow",
            "Starmoon", "Silverpetal", "Elmsong", "Whispersong", "Moonfrost", "Elderleaf", "Frostdance", "Leafshade", "Everdusk", "Stardance",
            "Silverdusk", "Elmwillow", "Whisperbreeze", "Moonsong", "Eldershade", "Frostwillow", "Leafwhisper", "Everbloom", "Starpetal", "Silverdance",
            "Elmbloom", "Whisperheart", "Moonshimmer", "Elderpetal", "Frostsong", "Leafwhisper", "Evergale", "Starpetal", "Silvershadow", "Elmdusk",
            "Whisperwillow", "Moondance", "Elderwillow", "Frostwhisper", "Leafwillow", "Everleaf", "Starmist", "Silvermoon", "Elmwillow", "Whisperdusk",
            "Moonshadow", "Elderheart", "Frostmoon", "Leafwillow", "Evernight", "Starwhisper", "Silvershade", "Elmdance", "Whispershadow", "Moonbloom"

    };
    public static final String[] DWARF_FIRSTNAMES = {
            "Throrin", "Balin", "Dain", "Gimli", "Thorin", "Dwalin", "Durin", "Kili", "Fili", "Gloin",
            "Bofur", "Bombur", "Oin", "Nori", "Ori", "Bifur", "Dori", "Thrain", "Thrainin", "Gorn",
            "Tharden", "Rorin", "Garn", "Torin", "Barin", "Korin", "Morin", "Tharin", "Bran", "Doran",
            "Guran", "Nalin", "Harin", "Dorin", "Farin", "Hari", "Gorin", "Borin", "Hurn", "Hordin",
            "Thradin", "Grundin", "Krin", "Thardor", "Thardik", "Brundin", "Thordin", "Thardir", "Thardin", "Grundor",
            "Gelga", "Brynhild", "Dagna", "Hilda", "Brunhild", "Frida", "Gudrun", "Gundruna", "Grimhild", "Erika",
            "Helga", "Hilda", "Ingrid", "Katla", "Nella", "Ragna", "Sigrun", "Sigrid", "Thora", "Gunnela",
            "Runa", "Birna", "Dagmar", "Elga", "Edda", "Freyja", "Gerta", "Greta", "Hedda", "Johanna",
            "Kara", "Magna", "Olga", "Rika", "Solveig", "Thyra", "Ursula", "Valka", "Wilma", "Ylva",
            "Gilda", "Brynhilda", "Dagmara", "Elin", "Freja", "Gerd", "Grima", "Hedvig", "Jorunn", "Kari"

    };
    public static final String[] DWARF_SURNAMES = {
            "Stoneforge", "Ironbeard", "Deepdelver", "Goldhammer", "Silvervein", "Axehammer", "Battlebeard", "Strongpick", "Steelbrew", "Rockcutter",
            "Granitehand", "Copperaxe", "Orebasher", "Forgeborn", "Flintanvil", "Hearthstone", "Hammersmith", "Anvilstone", "Ironhand", "Bronzeforge",
            "Smithson", "Copperbeard", "Goldanvil", "Sledgehammer", "Rockblade", "Ironhelm", "Stoneshaper", "Stonecleaver", "Goldbeard", "Silverhand",
            "Axeblade", "Thunderforge", "Granitehammer", "Goldbrow", "Steelgrinder", "Ironshaper", "Coppersmith", "Bronzehammer", "Rockbreaker", "Copperstrike",
            "Stoneheart", "Silverstone", "Goldensmith", "Bronzestone", "Graniteforge", "Stonesmith", "Ironstone", "Bronzecutter", "Silverbrow", "Rocksmith",
            "Stonegrinder", "Ironbrow", "Copperheart", "Silverbrow", "Bronzecutter", "Steelbrow", "Stoneblade", "Rockbrow", "Goldensmith", "Ironstrike",
            "Silvercut", "Coppergrinder", "Steelanvil", "Stonecutter", "Granitegrinder", "Rockstrike", "Goldenshaper", "Bronzehand", "Ironcleaver", "Stoneshaper",
            "Silversmith", "Bronzevein", "Steelbreaker", "Stonevein", "Ironcutter", "Goldensmith", "Silverbrow", "Bronzecleaver", "Steelhammer", "Rockgrinder",
            "Silverstrike", "Ironforge", "Stonecleaver", "Bronzehammer", "Steelcutter", "Rockgrinder", "Ironbrow", "Goldforge", "Stonebeard", "Bronzecutter",
            "Steelbeard", "Silveranvil", "Stonecleaver", "Bronzeanvil", "Steelcleaver", "Ironhammer", "Goldenshaper", "Bronzehand", "Stonesmith", "Graniteforge"

    };
    public static final String[] ORC_FIRSTNAMES = {
            "Groth",   "Gruk",    "Nazar",  "Drog",   "Throk",  "Drak",   "Morg",    "Grak",    "Zog",     "Gorn",
            "Krug",    "Snag",    "Grish",  "Uruk",   "Thrak",  "Hrak",   "Lok",     "Brak",    "Krog",    "Vorak",
            "Grom",    "Ugar",    "Drub",   "Hrok",   "Krag",   "Razak",  "Urg",     "Norok",   "Grunk",   "Druk",
            "Narok",   "Murg",    "Vorn",   "Skrag",  "Gnar",   "Hurak",  "Snarl",   "Darnak",  "Gulok",   "Zorn",
            "Brunk",   "Thrug",   "Narg",   "Ruk",    "Trak",   "Draz",   "Gruul",   "Grol",    "Snagok",  "Gornak",
            "Krunk",   "Zark",    "Grag",   "Thruk",  "Krunar", "Zornak", "Snurk",   "Hraknar", "Zarnak",  "Brurn",
            "Kurug",   "Snar",    "Gruum",  "Lornak", "Skruk",  "Grar",   "Draznar", "Krarn",   "Drarn",   "Kruul",
            "Grunkar", "Druum",   "Zarn",   "Dralk",  "Hrnak",  "Gral",   "Krol",    "Snork",   "Grarn",   "Ghrak",
            "Dornak",  "Grukash", "Thrunk", "Zulok",  "Gurnak", "Grash",  "Thrun",   "Grulk",   "Gromar",  "Krash",
            "Brunkar", "Snarg",   "Thrag",  "Durak",  "Krar",   "Skar",   "Durnak",  "Zrak",    "Snorkar", "Grum"
    };
    public static final String[] ORC_SURNAMES = {
            "Skullcrusher",  "Ironhide",    "Bloodaxe",     "Darkblade",    "Doomhammer",    "Bonecrusher", "Gorefang",      "Blackfang",    "Shadowmaw",     "Grimskull",
            "Warstrike",     "Battlefury",  "Blackhand",    "Ironskull",    "Rageshadow",    "Deathblade",  "Skullsplitter", "Stormrage",    "Thunderstrike", "Nightfang",
            "Ironfist",      "Ragemaw",     "Steelheart",   "Deathgrip",    "Frostwolf",     "Rocksmasher", "Flamebringer",  "Grimjaw",      "Shadowblade",   "Stormreaver",
            "Thunderfist",   "Grimhand",    "Blazefury",    "Stormgrip",    "Stonecrusher",  "Thunderfury", "Frostgore",     "Ironjaw",      "Ragemaw",       "Blackmaw",
            "Grimheart",     "Shadowfury",  "Thundermaw",   "Frostcrusher", "Grimskull",     "Deathgaze",   "Flameheart",    "Thunderheart", "Ironrage",      "Shadowrage",
            "Frostfist",     "Rageshadow",  "Thunderblade", "Deathhand",    "Shadowfist",    "Steelrage",   "Stormheart",    "Grimfury",     "Doomgrip",      "Frostblade",
            "Shadowgore",    "Bloodrage",   "Stormgore",    "Blackheart",   "Frostjaw",      "Thundergore", "Darkfury",      "Deathstrike",  "Rageshadow",    "Stoneheart",
            "Thunderstrike", "Flameblade",  "Grimstrike",   "Ironblade",    "Shadowcrusher", "Froststrike", "Thunderjaw",    "Deathmaw",     "Grimfist",      "Ironstrike",
            "Skullfury",     "Blackstrike", "Shadowhand",   "Frostgaze",    "Thundermaw",    "Doomfang",    "Warblood",      "Fireaxe",      "Grimshield",    "Skullsplitter",
            "Bonecrusher",   "Shadowrage",  "Goreblade",    "Ironmaw",      "Rageheart",     "Thunderfang", "Stormcrusher",  "Frostbiter",   "Deathgrip",     "Darkfist"
    };
    Random nameGen= new Random();

    public String createHuman(){
    String randomHumanName = HUMAN_FIRSTNAMES[nameGen.nextInt(HUMAN_FIRSTNAMES.length)]
            + " " + HUMAN_SURNAMES[nameGen.nextInt(HUMAN_SURNAMES.length)];
            return randomHumanName;
    }
    public String createElf(){
        String randomElfName = ELF_FIRSTNAMES[nameGen.nextInt(ELF_FIRSTNAMES.length)]
                + " " + ELF_SURNAMES[nameGen.nextInt(ELF_SURNAMES.length)];
        return randomElfName;
    }
    public String createDwarf(){
        String randomDwarfName = DWARF_FIRSTNAMES[nameGen.nextInt(DWARF_FIRSTNAMES.length)]
                + " " + DWARF_SURNAMES[nameGen.nextInt(ELF_SURNAMES.length)];
        return randomDwarfName;
    }
    public String createOrc(){
        String randomDwarfName = ORC_FIRSTNAMES[nameGen.nextInt(ORC_FIRSTNAMES.length)]
                + " " + ORC_SURNAMES[nameGen.nextInt(ORC_SURNAMES.length)];
        return randomDwarfName;
    }
}
