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
        return super.toString() + ", ум: " + intellect + ", мудрость: " + wisdom + ", остроумие: " + wit +
                ", творчество: " + creativity;
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
        Ravenclaw studentA = getStudentByName(ravenclaws, a);
        Ravenclaw studentB = getStudentByName(ravenclaws, b);
        if (studentA.intellect + studentA.wisdom + studentA.wit + studentA.creativity >
                studentB.intellect + studentB.wisdom + studentB.wit + studentB.creativity) {
            System.out.println(studentA.getName() + " лучший Когтевранец, чем " + studentB.getName());
        } else {
            System.out.println(studentB.getName() + " лучший Когтевранец, чем " + studentA.getName());
        }
    }

    private static Ravenclaw getStudentByName(Ravenclaw[] ravenclaws, String name) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw.getName().equals(name)) {
                return ravenclaw;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Когтевран!");
    }
}
