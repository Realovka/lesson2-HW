package com.company;
import java.lang.String;
public class Main {

    public static void main(String[] args) {
        String[] name = new String[]{
                "1 Иванов И.И. ", "2 Петров П.П.", "3 Сидоров С.С.", "4 Галкин Г.Г."};
        float[] marks = new float[]{
                4.2f, 2.7f, 9.8f, 6.5f};
        System.out.print(name[0]);
        System.out.println(marks[0]);
        System.out.print(name[1]);
        System.out.println(marks[1]);
        System.out.print(name[2]);
        System.out.println(marks[2]);
        System.out.print(name[3]);
        System.out.println(marks[3]);


        if (marks[0] <= 3.0) {
            System.out.println(name[0]+"- двоечник" );
        } else if (marks[0] >= 3.0 && marks[0] <= 7.0) {
            System.out.println(name[0]+"- хорошист");

        } else if (marks[0] > 7.0)
            System.out.println(name[0]+ "- отличник");




     if (marks[1] <= 3.0) {
        System.out.println(name[1]+"- двоечник" );
    } else if (marks[1] >= 3.0 && marks[1] <= 7.0) {
        System.out.println(name[1]+"- хорошист");

    } else if (marks[1] > 7.0)
            System.out.println(name[1]+ "- отличник");



        if (marks[2] <= 3.0) {
            System.out.println(name[2]+"- двоечник" );
        } else if (marks[2] >= 3.0 && marks[2] <= 7.0) {
            System.out.println(name[2]+"- хорошист");
        } else if (marks[2] > 7.0)
            System.out.println(name[2]+ "- отличник");


        if (marks[3] <= 3.0) {
            System.out.println(name[3]+"- двоечник" );
        } else if (marks[3] >= 3.0 && marks[3] <= 7.0) {
            System.out.println(name[3]+"- хорошист");
        } else if (marks[3] > 7.0)
            System.out.println(name[3]+ "- отличник");
    }
    }






