package homework.oop;

public class State {
    //满意度
    private int score = 0;
    //评论
    private String comment = "";

    public State(int score, String comment) {
        this.score = score;
        this.comment = comment;
    }

    public String toString() {
        return "分数：" + score + ",反馈:" + comment;
    }
}
