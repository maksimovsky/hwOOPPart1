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
        return getName() + " " + getSurname() + ", магия: " + getMagic() + ", трансгрессия: " + getTransgression() +
                ", трудолюбие: " + industriousness + ", верность: " + loyalty + ", честность: " + honesty;
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
        Hufflepuff pupilA = getPupilByName(hufflepuffs, a);
        Hufflepuff pupilB = getPupilByName(hufflepuffs, b);
        if (pupilA.industriousness + pupilA.loyalty + pupilA.honesty >
                pupilB.industriousness + pupilB.loyalty + pupilB.honesty) {
            System.out.println(pupilA.getName() + " лучший Пуффендуец, чем " + pupilB.getName());
        } else {
            System.out.println(pupilB.getName() + " лучший Пуффендуец, чем " + pupilA.getName());
        }
    }

    private static Hufflepuff getPupilByName(Hufflepuff[] hufflepuffs, String name) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff.getName().equals(name)) {
                return hufflepuff;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Пуффендуй!");
    }
}
