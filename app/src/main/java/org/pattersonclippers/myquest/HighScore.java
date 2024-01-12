package org.pattersonclippers.myquest;

public class HighScore {
    private int finalScore;
    private String name;

    public HighScore(){
        finalScore = 0;
        name = "name";
    }

    public HighScore(int finalScore, String name) {
        this.finalScore = finalScore;
        this.name = name;
    }


    public int getFinalScore() {
        return finalScore;
    }

    public String getName() {
        return name;
    }

    public void setFinalScore(int finalScore) {
        this.finalScore = finalScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HighScore{" +
                "finalScore=" + finalScore +
                ", name='" + name + '\'' +
                '}';
    }
}
