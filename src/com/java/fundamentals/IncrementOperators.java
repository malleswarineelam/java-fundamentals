package com.java.fundamentals;

import java.sql.SQLOutput;

public class IncrementOperators {
    public static void main(String[] args) {
        int no1 = 10;
        int no2 = 20;
        //  int res = no1++ - --no2 + no2-- * ++no1 + --no1;
        //int res = no1 + no2 - 30 * 40 / 50 % 60;

        //int res = no1 + (no2-30) * 40 / 50 % 60;
        //System.out.println(res);
        /* relational operators ==, !=, >,<,>=,<=
        logical operators &&,||
        && ->
        F F -----> F
        T F -----> F
        F T -----> F
        T T -----> T
         */
        System.out.println(no1++ > 10 || ++no1 > 5);
        System.out.println(no1);



    }
}
