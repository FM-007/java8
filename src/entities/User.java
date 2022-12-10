package entities;

public class User {

    private String name;
    private int points;
    private boolean moderatory;

    public User(String name, int points) {
        this.name = name;
        this.points = points;
        this.moderatory = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isModeratory() {
        return moderatory;
    }

    public void setModeratory(boolean moderatory) {
        this.moderatory = moderatory;
    }
}
