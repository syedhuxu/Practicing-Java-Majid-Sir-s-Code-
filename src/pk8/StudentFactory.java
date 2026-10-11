package pk8;

class StudentFactory {

    static Student createStudent(String name, int marks) {
        Student student = new Student(name, marks);

        return student;
    }

    static Student addBonus(Student student) {
        student.marks += 5;

        return student;
    }

    static Student createCopy(Student student) {
        return new Student(student.name, student.marks);
    }
}

