package exercises.lsn6technology;

public abstract class Computer extends AbstractEntity {
    private String name;
    private String brand;
    private boolean isOn;

    public Computer(String name, String brand) {
        super();
        this.name = name;
        this.brand = brand;
        this.isOn = false;
    }

    public void pressPowerButton() {
        if (isOn) {
            isOn = false;
            System.out.println(brand + " " + name + " turned off");
        } else {
            isOn = true;
            System.out.println(brand + " " + name + " turned on");
        }
    }

    public void startProgram(String program) {
        System.out.println("Attempting to start " + program + " ...");
        if (!isOn)
            System.out.println(brand + " " + name + " is not on!");
        else
            System.out.println(program + " has been started");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOn() {
        return isOn;
    }
}
