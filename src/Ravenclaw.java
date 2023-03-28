public class Ravenclaw extends Hogwarts {
    private final int intellect, wisdom, wit, creativity;

    public Ravenclaw(String name, String surname, int magic, int transgression,
                     int intellect, int wisdom, int wit, int creativity) {
        super(name, surname, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + ", магия: " + getMagic() + ", трансгрессия: " + getTransgression() +
                ", ум: " + intellect + ", мудрость: " + wisdom + ", остроумие: " + wit + ", творчество: " + creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public static void compareByNames(Ravenclaw[] ravenclaws, String a, String b) {
        Ravenclaw pupilA = getPupilByName(ravenclaws, a);
        Ravenclaw pupilB = getPupilByName(ravenclaws, b);
        if (pupilA.intellect + pupilA.wisdom + pupilA.wit + pupilA.creativity >
                pupilB.intellect + pupilB.wisdom + pupilB.wit + pupilB.creativity) {
            System.out.println(pupilA.getName() + " лучший Когтевранец, чем " + pupilB.getName());
        } else {
            System.out.println(pupilB.getName() + " лучший Когтевранец, чем " + pupilA.getName());
        }
    }

    private static Ravenclaw getPupilByName(Ravenclaw[] ravenclaws, String name) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name)) {
                return ravenclaw;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Когтевран!");
    }
}
