package entities;

public class Student {
    public int firstTrimester;
    public int secondTrimester;
    public int thirdTrimester;

    public int finalGrade(){
        return firstTrimester + secondTrimester + thirdTrimester;
    }
}
