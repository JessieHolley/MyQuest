package org.pattersonclippers.myquest;

public class Question {

    private String qText;

    private boolean CorrectAns;

    public  Question() {
        qText = "";
        CorrectAns = false;
    }

    public Question(String newQText, boolean newCorrectAnswer) {
        qText = newQText;
        CorrectAns = newCorrectAnswer;
    }

    public String getQText() { return qText; }

    public boolean getCorrectAns() { return CorrectAns; }

    public void setqText(String newQText) {qText = newQText; }

    public void setCorrectAns(boolean NewCorrectAnswer) { CorrectAns = NewCorrectAnswer; }

}
