package sk.itsovy.dolinsky;

import java.util.Arrays;
import java.util.Date;

/**
 * @author Martin Dolinsky
 */
public class Main {

    public static void main(String[] args) {
        Student erik = new Student("Erik","Lorincz",2000,10,10);
        Student filip = new Student("Filip","Andrasik",1999,10,10);
        Student zuzana = new Student("Zuzana","Zuzanova ",8,0,6);
        Student jozo = new Student("Jozo","Lorincz",1993,10,8);

        Group g = new Group("1.N",5);

        g.addStudent(erik);
        g.addStudent(filip);
        g.addStudent(zuzana);
        g.deleteStudent(erik);
        g.addStudent(jozo);

        System.out.println(g.getArr());
        g.print();
        g.sort();
        g.print();
        System.out.println(g.randomStudent());
        System.out.println(zuzana.getMonthOfBirth() + " " + filip.getMonthOfBirth() + " " + jozo.getMonthOfBirth());
        System.out.println(zuzana.getYearOfBirth() + " " + filip.getYearOfBirth() + " " + jozo.getYearOfBirth());
        System.out.println(Arrays.toString(g.getStudent(10)));
        System.out.println(zuzana.getAge());
        System.out.println(zuzana.getZodiacSign());
        System.out.println(jozo.getZodiacSign());
        System.out.println(filip.getZodiacSign());
        jozo.addSubject("ASF");
        jozo.addSubject("PRO");
        jozo.addSubject("EKO");
        for (String s:jozo.getSubjects()) {
            System.out.print(s + " ");

        }



    }
}
