package exercises.lsn6technology;

public class Program {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Work laptop", "Dell", 1000, false);
        System.out.println(laptop1);
        laptop1.openLaptop();
        laptop1.openLaptop();
        laptop1.pressPowerButton();
        laptop1.startProgram("Microsoft Word");
        laptop1.pressPowerButton();
        laptop1.closeLaptop();

        System.out.println();
        SmartPhone smartPhone1 = new SmartPhone("Personal cell", "Samsung", false);
        System.out.println(smartPhone1);
        smartPhone1.pressPowerButton();
        smartPhone1.changeToLandscapeMode();
        smartPhone1.pressPowerButton();

        System.out.println();
        Laptop laptop2 = new Laptop("Gaming laptop", "Alienware", 2500, true);
        laptop2.startProgram("Zoom");
        System.out.println(laptop2);
    }
}
