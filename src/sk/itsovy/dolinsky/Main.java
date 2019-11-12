package sk.itsovy.dolinsky;

import java.util.Date;

/**
 * @author Martin Dolinsky
 */
public class Main {

    public static void main(String[] args) {
        Student erik = new Student("Erik","Lorincz",new Date());
        Student filip = new Student("Filip","Andrasik",new Date());
        Student zuzana = new Student("Zuzana","zuzanova ",new Date());

        Group g = new Group("1.N",5);

        g.addStudent(erik);
        g.addStudent(filip);
        g.addStudent(zuzana);
        g.deleteStudent(erik);

        System.out.println(g.getArr());
        g.print();


    }
}
