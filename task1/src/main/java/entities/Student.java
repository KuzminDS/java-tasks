package entities;

public class Student {

    private String name;
    private float averageScore;
    private boolean isBlockchain;

    public Student() {}

    public Student(String name, float averageScore, boolean isBlockchain) {
        this.name = name;
        this.averageScore = averageScore;
        this.isBlockchain = isBlockchain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }

    public boolean getIsBlockchain() {
        return isBlockchain;
    }

    public void setIsBlockchain(boolean isBlockchain) {
        this.isBlockchain = isBlockchain;
    }
}
