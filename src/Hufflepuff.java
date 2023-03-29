public class Hufflepuff extends Hogwarts {
    private final int industriousness, loyalty, honesty;

    public Hufflepuff(String name, String surname, int magic, int transgression,
                      int industriousness, int loyalty, int honesty) {
        super(name, surname, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие: " + industriousness + ", верность: " + loyalty +
                ", честность: " + honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public static void compareByNames(Hufflepuff[] hufflepuffs, String a, String b) {
        Hufflepuff studentA = getStudentByName(hufflepuffs, a);
        Hufflepuff studentB = getStudentByName(hufflepuffs, b);
        if (studentA.industriousness + studentA.loyalty + studentA.honesty >
                studentB.industriousness + studentB.loyalty + studentB.honesty) {
            System.out.println(studentA.getName() + " лучший Пуффендуец, чем " + studentB.getName());
        } else {
            System.out.println(studentB.getName() + " лучший Пуффендуец, чем " + studentA.getName());
        }
    }

    private static Hufflepuff getStudentByName(Hufflepuff[] hufflepuffs, String name) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name)) {
                return hufflepuff;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Пуффендуй!");
    }
}
