package exercises.lsn6technology;

public class Laptop extends Computer{
    private double hardDriveSize;
    private boolean touchScreen;
    private boolean isOpen;

    public Laptop(String name, String model, double hardDriveSize, boolean touchScreen) {
        super(name, model);
        this.hardDriveSize = hardDriveSize;
        this.touchScreen = touchScreen;
        this.isOpen = false;
    }

    public void openLaptop() {
        if (!isOpen) {
            System.out.println(displayName() + " opened");
            isOpen = true;
        }
        else
            System.out.println(displayName() + " is already open");
    }

    public void closeLaptop() {
        if (isOpen) {
            System.out.println(displayName() + " closed");
            isOpen = false;
        }
        else
            System.out.println(displayName() + " is not open");
    }

    @Override
    public void pressPowerButton() {
        if (isOpen)
            super.pressPowerButton();
        else
            System.out.println(displayName() + "is not open");
    }

    @Override
    public String toString() {
        return "Laptop(" +
                "ID: " + getId() +
                ", Name: " + getName() +
                ", Brand: " + getBrand() +
                ", Is on: " + isOn() +
                ", Hard Drive Size (in GB): " + getHardDriveSize() +
                ", Touchscreen: " + isTouchScreen() +
                ")";
    }

    private String displayName() {
        return getBrand() + " " + getName();
    }

    // Getters and Setters
    public double getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(double hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
