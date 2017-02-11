package Alexandr_Nikitchenko;
/*
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
Если имена и длины имен разные — ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        //Ввод данных с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();

        // Сравнение имен
        if(s1.equals(s2)){
            System.out.println("Имена идентичны");
        } else if(s1 != s2){
            if(s1.length() == s2.length()){
                System.out.println("Длины имен равны");
            }
        }
    }
}
