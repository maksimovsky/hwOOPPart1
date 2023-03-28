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
        return getName() + " " + getSurname() + ", магия: " + getMagic() + ", трансгрессия: " + getTransgression() +
                ", хитрость: " + trick + ", решительность: " + determination + ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness + ", жажда власти: " + lustForPower;
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
        Slytherin pupilA = getPupilByName(slytherins, a);
        Slytherin pupilB = getPupilByName(slytherins, b);
        if (pupilA.trick + pupilA.determination + pupilA.ambition + pupilA.resourcefulness + pupilA.lustForPower >
                pupilA.trick + pupilB.determination + pupilB.ambition + pupilB.resourcefulness + pupilB.lustForPower) {
            System.out.println(pupilA.getName() + " лучший Слизеринец, чем " + pupilB.getName());
        } else {
            System.out.println(pupilB.getName() + " лучший Слизеринец, чем " + pupilA.getName());
        }
    }

    private static Slytherin getPupilByName(Slytherin[] slytherins, String name) {
        for (Slytherin slytherin : slytherins) {
            if (slytherin.getName().equals(name)) {
                return slytherin;
            }
        }
        throw new RuntimeException("Ученик " + name + " не найден на факультете Слизерин!");
    }
}
