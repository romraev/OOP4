package org.example;

import java.util.*;

interface Iterator <E>{

    E next();
    boolean hasNext();
    void remove();
}
class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

// Класс УчебнаяГруппа
class StudyGroup {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    // Внутренний класс УчебнаяГруппаИтератор, реализующий интерфейс Iterator
    private class StudyGroupIterator implements Iterator<Student> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < students.size();
        }

        @Override
        public Student next() {
            return students.get(currentIndex++);
        }

        @Override
        public void remove() {
            students.remove(currentIndex - 1);
            currentIndex--;
        }
    }

    // Метод, возвращающий объект итератора для учебной группы
    public Iterator<Student> iterator() {
        return new StudyGroupIterator();
    }
}

class Stream{
    private ArrayList<StudyGroup> strlist = new ArrayList<>();
    public void addGroup(StudyGroup group) {
        strlist.add(group);
    }

    public List<StudyGroup> getStream() {
        return strlist;
    }

    public int getSize() {
        return strlist.size();
    }
    private class StreamIterator implements Iterator<StudyGroup>{
        private int currentInd = 0;
        @Override
        public StudyGroup next() {
            return strlist.get(currentInd++);
        }

        @Override
        public boolean hasNext() {
            return currentInd< strlist.size();
        }

        @Override
        public void remove() {
             strlist.remove(currentInd - 1);
             currentInd --;
        }
    }
}
class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.getSize() - o2.getSize();
    }

    @Override
    public Comparator<Stream> reversed() {
        return Comparator.super.reversed();
    }
}

class StreamService {
    public void sort(List<Stream> strserv){
        StreamComparator comp = new StreamComparator();
        strserv.sort(new StreamComparator());
    }
}

class Controller {
    private StreamService ss;
    public Controller(){
        ss = new StreamService();
    }
    public void StreamSort(List<Stream> strserv){
        ss.sort(strserv);
    }
}
public class Main {
    public static void main(String[] args) {
        
// Создание объектов студентов
            Student student1 = new Student("Иванов", 1);
            Student student2 = new Student("Петров", 2);
            Student student3 = new Student("Сидоров", 3);

        Student student4 = new Student("Иванов", 1);
        Student student5 = new Student("Петров", 2);
        Student student6 = new Student("Сидоров", 3);

        Student student7 = new Student("Иванов", 1);
        Student student8 = new Student("Петров", 2);
        Student student9 = new Student("Сидоров", 3);

        Student student10 = new Student("Иванов", 1);
        Student student11 = new Student("Петров", 2);
        Student student12 = new Student("Сидоров", 3);

        Student student13 = new Student("Иванов", 1);
        Student student14 = new Student("Петров", 2);
        Student student15 = new Student("Сидоров", 3);


        Student student16 = new Student("Иванов", 1);
        Student student17 = new Student("Петров", 2);
        Student student18 = new Student("Сидоров", 3);


            // Создание объекта учебной группы
            StudyGroup group1 = new StudyGroup();
            group1.addStudent(student1);
            group1.addStudent(student2);
            group1.addStudent(student3);

        StudyGroup group2 = new StudyGroup();
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student6);

        StudyGroup group3 = new StudyGroup();
        group3.addStudent(student7);
        group3.addStudent(student8);
        group3.addStudent(student9);

        StudyGroup group4 = new StudyGroup();
        group4.addStudent(student10);
        group4.addStudent(student11);
        group4.addStudent(student12);

        StudyGroup group5 = new StudyGroup();
        group5.addStudent(student13);
        group5.addStudent(student14);
        group5.addStudent(student15);

        StudyGroup group6 = new StudyGroup();
        group6.addStudent(student16);
        group6.addStudent(student17);
        group6.addStudent(student18);


            // Использование итератора для прохода по студентам и вывода их данных
            Iterator<Student> iterator = group1.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                System.out.println(student);
            }

            // Удаление студента из учебной группы с помощью итератора
            iterator = group1.iterator();
            while (iterator.hasNext()) {
                Student student = iterator.next();
                if (student.getId() == 2) {
                    iterator.remove();
                }
            }

            // Проверка, что студент был удален
            System.out.println("Студент с ID 2 был удален из учебной группы.");
            for (Student student : group1.getStudents()) {
                System.out.println(student);
            }

            Stream str1 = new Stream();
            str1.addGroup(group1);
            str1.addGroup(group2);
            str1.addGroup(group3);

        Stream str2 = new Stream();
        str2.addGroup(group4);
        str2.addGroup(group5);

        Stream str3 = new Stream();
        str3.addGroup(group6);

        List<Stream> str = new ArrayList<>();

        Controller c = new Controller();
        c.StreamSort(str);


    }
}