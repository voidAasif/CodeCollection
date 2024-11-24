package javaHub.FrameCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javaHub.FrameCollection.pojo.j001_student;

public class j002_collectionClass {
    public static void main(String[] args) {
        j001_student stu1 = new j001_student("abc", 05);
        j001_student stu2 = new j001_student("def", 25);
        j001_student stu3 = new j001_student("ghi", 10);
        j001_student stu4 = new j001_student("jkl", 30);
        j001_student stu5 = new j001_student("mno", 05);

        System.out.println(stu1.equals(stu2));
        System.out.println(stu1.equals(stu5));

        //now i need to sort these students by rollNo;

        // Use ArrayList to create a mutable list
        List<j001_student> studentList = new ArrayList<>();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);
        studentList.add(stu4);
        studentList.add(stu5);

        Collections.sort(studentList);

        System.out.println(studentList);

    }
}
