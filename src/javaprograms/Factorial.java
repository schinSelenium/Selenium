package javaprograms;

public class Factorial {

    public static void main(String[] args) {

        int num = 5;
        int a = 1;
        for(int i = num; i >= 1; i--)
        {
            a=a*i;
        }
        System.out.printf("Factorial of " + num +" = "+ a);
    }
}