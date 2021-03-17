package exercises.lsn6technology;

public class SmartPhone extends Computer {
    private boolean fingerprintReader;
    private boolean portraitMode;

    public SmartPhone(String name, String model, boolean fingerprintReader) {
        super(name, model);
        this.fingerprintReader = fingerprintReader;
        this.portraitMode = true;
    }

    public void changeToLandscapeMode() {
        if (isPortraitMode()) {
            System.out.println("Changed to landscape mode");
            portraitMode = false;
        } else
            System.out.println("Already landscape mode");
    }

    public void changeToPortraitMode() {
        if (!isPortraitMode()) {
            System.out.println("Changed to portrait mode");
            portraitMode = true;
        } else
            System.out.println("Already portrait mode");
    }
    @Override
    public String toString() {
        return "Smartphone(" +
                "ID: " + getId() +
                ", Name: " + getName() +
                ", Brand: " + getBrand() +
                ", Is on: " + isOn() +
                ", Fingerprint Reader: " + isFingerprintReader() +
                ")";
    }

    // Getters and Setters
    public boolean isFingerprintReader() {
        return fingerprintReader;
    }

    public void setFingerprintReader(boolean fingerprintReader) {
        this.fingerprintReader = fingerprintReader;
    }

    public boolean isPortraitMode() {
        return portraitMode;
    }
}
