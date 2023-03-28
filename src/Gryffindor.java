public class Gryffindor extends Hogwarts {
    private final int nobility, honor, bravery;

    public Gryffindor(String name, String surname, int magic, int transgression,
                      int nobility, int honor, int bravery) {
        super(name, surname, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", магия: " + getMagic() + ", трансгрессия: " + getTransgression() +
                ", благородство: " + nobility + ", честь: " + honor + ", храбрость: " + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public static void compareByNames(Gryffindor[] gryffindors, String a, String b) {
        Gryffindor pupilA = getPupilByName(gryffindors, a);
        Gryffindor pupilB = getPupilByName(gryffindors, b);
        if (pupilA.bravery + pupilA.honor + pupilA.nobility >
                pupilB.bravery + pupilB.honor + pupilB.nobility) {
            System.out.println(pupilA.getName() + " лучший Гриффиндорец, чем " + pupilB.getName());
        } else {
            System.out.println(pupilB.getName() + " лучший Гриффиндорец, чем " + pupilA.getName());
        }
    }

    private static Gryffindor getPupilByName(Gryffindor[] gryffindors, String name) {
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name)) {
                return gryffindor;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Гриффиндор!");
    }
}
