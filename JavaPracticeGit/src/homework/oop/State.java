package homework.oop;

public class State {
    //�����
    private int score = 0;
    //����
    private String comment = "";

    public State(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public String toString() {
        return "������" + score + ",����:" + comment;
    }
}
