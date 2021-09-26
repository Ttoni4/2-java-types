package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int numDigits = 0;

        long sum = (long)x + (long)y;

        while(sum != 0){
            numDigits += 1;
            sum /= 10;
        }

        return numDigits == 0 ? 1 : numDigits;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(-111, -222);
        System.out.println(result);

    }

}
