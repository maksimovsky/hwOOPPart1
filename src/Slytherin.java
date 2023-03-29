public class Slytherin extends Hogwarts {
    private final int trick, determination, ambition, resourcefulness, lustForPower;

    public Slytherin(String name, String surname, int magic, int transgression,
                     int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", хитрость: " + trick + ", решительность: " + determination +
                ", амбициозность: " + ambition + ", находчивость: " + resourcefulness +
                ", жажда власти: " + lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public static void compareByNames(Slytherin[] slytherins, String a, String b) {
        Slytherin studentA = getStudentByName(slytherins, a);
        Slytherin studentB = getStudentByName(slytherins, b);
        if (studentA.trick + studentA.determination + studentA.ambition + studentA.resourcefulness + studentA.lustForPower >
                studentA.trick + studentB.determination + studentB.ambition + studentB.resourcefulness + studentB.lustForPower) {
            System.out.println(studentA.getName() + " лучший Слизеринец, чем " + studentB.getName());
        } else {
            System.out.println(studentB.getName() + " лучший Слизеринец, чем " + studentA.getName());
        }
    }

    private static Slytherin getStudentByName(Slytherin[] slytherins, String name) {
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name)) {
                return slytherin;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Слизерин!");
    }
}
