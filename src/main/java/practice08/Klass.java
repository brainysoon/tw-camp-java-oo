package practice08;

public class Klass {

    private Integer number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %s", this.number);
    }

    public boolean isSameClassOf(Klass klass) {
        return this.number.equals(klass.getNumber());
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student student) {
        this.leader = student;
    }
}
