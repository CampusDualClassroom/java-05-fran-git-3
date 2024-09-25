package com.campusdual.classroom;

public class Exercise05 {


    public static void main(String[] args) {
        int n1=5;
        int n2=0;
        int n3= -2;
        checkLessOrGreaterEqual(n1,n2);
        checkMultiply(n1,n2);
        checkPositiveNegative(n3);
    }



        public static void checkLessOrGreaterEqual(int n1, int n2) {
            if (n1 < n2) {
                System.out.println(n1 + " es menor que " + n2);
            } else if (n1 == n2) {
                //esto está mal en el texto debería ser n1 igual que n2
                System.out.println(n1 + " es mayor o igual que " + n2);
            } else{
                System.out.println(n1 + " es mayor o igual que " + n2);
            }
        }


        public static void checkMultiply(int n1, int n2) {
            if (n2 != 0 && n1 % n2 == 0) {
                System.out.println(n1 + " es múltiplo de " + n2);
            } else {
                System.out.println(n1 + " no es múltiplo de " + n2);
            }
        }

        public static void checkPositiveNegative(int n) {
            if (n > 0) {
                System.out.println(n + " es positivo.");
            } else if (n == 0) {
                System.out.println(n + " es positivo.");
            } else {
                System.out.println(n + " es negativo.");
            }
        }
}

