public class Hogwarts {
    private final String name;
    private final String surname;
    private final int magic;
    private final int transgression;

    public Hogwarts(String name, String surname, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public static void compareByNames(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws,
                                      Slytherin[] slytherins, String a, String b) {
        Hogwarts pupilA = getPupilByName(gryffindors, hufflepuffs, ravenclaws, slytherins, a);
        Hogwarts pupilB = getPupilByName(gryffindors, hufflepuffs, ravenclaws, slytherins, b);
        if (pupilA.magic + pupilA.transgression >
                pupilB.magic + pupilB.transgression) {
            System.out.println(pupilA.getName() + " " + pupilA.getSurname() + " обладает бОльшей мощностью магии, чем " +
                    pupilB.getName() + " " + pupilB.getSurname());
        } else {
            System.out.println(pupilB.getName() + " " + pupilB.getSurname() + " обладает бОльшей мощностью магии, чем " +
                    pupilA.getName() + " " + pupilA.getSurname());
        }
    }

    private static Hogwarts getPupilByName(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws,
                                           Slytherin[] slytherins, String name) {

        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name)) {
                return gryffindor;
            }
        }

        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name)) {
                return hufflepuff;
            }
        }

        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name)) {
                return ravenclaw;
            }
        }

        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name)) {
                return slytherin;
            }
        }

        throw new RuntimeException("Ученик " + name + " не найден в Хогвартсе!");
    }
}
