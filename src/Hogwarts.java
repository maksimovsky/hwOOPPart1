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

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", магия: " + getMagic() + ", трансгрессия: " + getTransgression();
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
        Hogwarts studentA = getStudentByName(gryffindors, hufflepuffs, ravenclaws, slytherins, a);
        Hogwarts studentB = getStudentByName(gryffindors, hufflepuffs, ravenclaws, slytherins, b);
        if (studentA.magic + studentA.transgression > studentB.magic + studentB.transgression) {
            System.out.println(studentA.getName() + " " + studentA.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + studentB.getName() + " " + studentB.getSurname());
        } else {
            System.out.println(studentB.getName() + " " + studentB.getSurname() +
                    " обладает бОльшей мощностью магии, чем " + studentA.getName() + " " + studentA.getSurname());
        }
    }

    private static Hogwarts getStudentByName(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws,
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
