import java.util.Scanner;
class Student implements Comparable<Student> {
    String studentname;
    String dob;
    int sub1;
    int sub2;
    int sub3;
    int total;
    String reservation;

    Student(String studentname, String dob, int sub1, int sub2, int sub3, String reservation) {
        this.studentname = studentname;
        this.dob = dob;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.total = total;
        this.reservation = reservation;
    }
    public String getStudentname() {
        return studentname;
    }
    public String getdob() {
        return dob;
    }
    public int getsub1() {
        return sub1;
    }
    public int getsub2() {
        return sub2;
    }
    public int getsub3() {
        return sub3;
    }
    public int gettotal() {
        return total;
    }
    public String getreservation() {
        return reservation;
    }

    public int compareTo(final Student that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        }
        if (this.gettotal() < that.gettotal()) {
            return -1;
        }
        if (this.getsub3() > that.getsub3()) {
            return 1;
        }
        if (this.getsub3() < that.getsub3()) {
            return -1;
        }
        if (this.getsub2() > that.getsub2()) {
            return 1;
        }
        if (this.getsub2() < that.getsub2()) {
            return -1;
        }
 return 0;
}
}

class Insertion {
    private Student[] students;
    private int size;
    Insertion() {
        students = new Student[100];
        size = 0;
    }
    public boolean less(final Student a, final Student b) {
        return a.compareTo(b) == -1;
    }
    public void sort(final Student[] arr) {
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0; j--) {
                if (less(students[j - 1], students[j])) {
                    //exchange(students, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }
}
