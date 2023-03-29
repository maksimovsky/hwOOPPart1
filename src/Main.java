public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 20, 34,
                        27, 41, 29),
                new Gryffindor("Гермиона", "Грейнджер", 25, 29,
                        30, 27, 26),
                new Gryffindor("Рон", "Уизли", 23, 32,
                        29, 36, 33),
        };

        for (Gryffindor gryffindor : gryffindors) {
            System.out.println(gryffindor);
        }
        System.out.println();

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 25, 37,
                        30, 43, 30),
                new Hufflepuff("Седрик", "Диггори", 29, 42,
                        33, 29, 39),
                new Hufflepuff("Джастин", "Финч-Флетчли", 30, 35,
                        43, 40, 28),
        };

        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println(hufflepuff);
        }
        System.out.println();

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 29, 38,
                        35, 42, 32, 30),
                new Ravenclaw("Падма", "Патил", 43, 39,
                        39, 38, 30, 45),
                new Ravenclaw("Маркус", "Белби", 31, 37,
                        43, 38, 33, 29),
        };

        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println(ravenclaw);
        }
        System.out.println();

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 27, 40,
                        35, 29, 45, 32, 39),
                new Slytherin("Грэхэм", "Монтегю", 35, 39,
                        26, 23, 45, 37, 40),
                new Slytherin("Грегори", "Гойл", 37, 43,
                        30, 46, 36, 30, 24),
        };
        for (Slytherin slytherin : slytherins) {
            System.out.println(slytherin);
        }
        System.out.println();

        Gryffindor.compareByNames(gryffindors, "Рон", "Гарри");
        Hufflepuff.compareByNames(hufflepuffs, "Седрик", "Захария");
        Ravenclaw.compareByNames(ravenclaws, "Маркус", "Чжоу");
        Slytherin.compareByNames(slytherins, "Грэхэм", "Драко");
        System.out.println();

        Hogwarts.compareByNames(gryffindors, hufflepuffs, ravenclaws, slytherins, "Седрик", "Драко");
    }
}