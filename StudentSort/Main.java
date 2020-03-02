package fmi.informatics.StudentSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StudentSortClass sortClass = new StudentSortClass();
        sortClass.testFunction((a1, a2) -> a1 + a2);
        System.out.println();
        System.out.println("For Ascending press 1");
        System.out.println("For Descending press 2");
        Scanner Sort = new Scanner(System.in);
        byte number;
        while(true){
            number = Sort.nextByte();
            if (number == 1){
                System.out.println("Ascending order sorting");
                sortClass.SortAscending();
                System.out.println();
                break;
            }
            else if (number == 2){
                System.out.println("Descending order sorting");
                sortClass.SortDescending();
                System.out.println();
                break;
            }else{

            }
        }
    }
}