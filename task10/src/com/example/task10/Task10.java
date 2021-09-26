package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        boolean res = true;

        if (Float.isInfinite(a) && Float.isInfinite(b))
            res = a == b;

        else if(Float.isNaN(a) && Float.isNaN(b))
            res = true;

        else
            res = Math.abs(a - b) < Math.pow(10, -precision);

        return res;

    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        //boolean result = compare(sum, c, 2);
        boolean result = compare(1.1f, 1.0f, 2);
        System.out.println(result);

    }

}
