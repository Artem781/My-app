package com.mycompany.javaintroonline.lesson1;


//4. Дано действительное число К вида ппп. ааа (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class Task4 {
    public static double replaceThreeNumber(double k) {
        String str = Double.toString(k);
        String[] split = str.split("\\.");
        String result = split[1] + "." + split[0];
        return Double.parseDouble(result);
    }


}
