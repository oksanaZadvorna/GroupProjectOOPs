package GroupProjectOOPs;
/*
7. We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public abstract class Marks {
    int mathScore;
    int biologyScore;
    int itScore;

    public Marks(int mathScore, int biologyScore, int itScore) {
        this.mathScore = mathScore;
        this.biologyScore = biologyScore;
        this.itScore = itScore;
    }
    public abstract int getPercentage();
}
class A extends Marks{

    public A(int mathScore, int biologyScore, int itScore) {
        super(mathScore, biologyScore, itScore);
    }

    @Override
    public int getPercentage() {
        return (mathScore+biologyScore+itScore)/3*100;
    }
}
class B extends Marks{
    int javaSubject;

    public B(int mathScore, int biologyScore, int itScore, int javaSubject) {
        super(mathScore, biologyScore, itScore);
    }

    @Override
    public int getPercentage() {
        return (mathScore+biologyScore+itScore+javaSubject)/4*100;
    }
}
class MarksTester {
    public static void main(String[] args) {
       Marks[]marks={new A(85, 90, 75), new B(80, 96, 95, 100)};
        for (Marks mark : marks) {
            System.out.println(mark.getPercentage());
        }
    }
}
