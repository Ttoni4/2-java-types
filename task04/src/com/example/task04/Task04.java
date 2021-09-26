package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        float res = (float)0.0;

        if(operation == "+")
            res = (float)((float)a + (float)b);

        else if(operation == "-")
            res = (float)((float)a - (float)b);

        else if(operation == "*")
            res = (float)((float)a * (float)b);

        else if(operation == "/")
            res = (float)((float)a / (float)b);

        return res;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
