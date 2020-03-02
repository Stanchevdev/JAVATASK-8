package fmi.informatics.StudentSort;
import fmi.informatics.extending.Student;
import fmi.informatics.functional.MySimpleInterface2;

import java.util.Arrays;
import java.util.List;

public class StudentSortClass implements SortInterface {


    public static void SortDescending() {
        List<Student> StudentsGen = Arrays.asList
                (
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make()
                );
        StudentsGen.sort((a, b) -> b.getSpeciality().compareTo(a.getSpeciality()));
        System.out.println(StudentsGen + "\n");

    }



    public static void testFunction(MySimpleInterface2 msi2) {
        String concat = msi2.concatenate("P1", "P2");
        System.out.print(concat);
    }

    // ЗАЩО АЛГОРИТЪМЪТ ЗА ВЪЗХОДЯЩО СОРТИРАНЕ НЕ РАБОТИ ПО ОБРАТНАТА ЛОГИКА НА КОДА ЗА НИЗХОДЯЩ?
    public static void SortAscending() {
        List<Student> StudentsGen = Arrays.asList
                (
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make(),
                        Student.StudentGenerator.make()
                );
        StudentsGen.sort((b, a) -> a.getSpeciality().compareTo(b.getSpeciality()));
        System.out.println(StudentsGen + "\n");
        }

    @Override
    public String concat(String someString, String someString2) {
        StringBuilder builder = new StringBuilder();
        builder.append(someString);
        builder.append(" ");
        builder.append(someString2);
        return builder.toString();
    }
}
