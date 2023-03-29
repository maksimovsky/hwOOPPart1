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
        return super.toString() + ", благородство: " + nobility + ", честь: " + honor + ", храбрость: " + bravery;
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
        Gryffindor studentA = getStudentByName(gryffindors, a);
        Gryffindor studentB = getStudentByName(gryffindors, b);
        if (studentA.bravery + studentA.honor + studentA.nobility >
                studentB.bravery + studentB.honor + studentB.nobility) {
            System.out.println(studentA.getName() + " лучший Гриффиндорец, чем " + studentB.getName());
        } else {
            System.out.println(studentB.getName() + " лучший Гриффиндорец, чем " + studentA.getName());
        }
    }

    private static Gryffindor getStudentByName(Gryffindor[] gryffindors, String name) {
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor.getName().equals(name)) {
                return gryffindor;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Гриффиндор!");
    }
}
