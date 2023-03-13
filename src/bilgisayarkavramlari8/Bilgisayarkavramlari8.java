/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari8;

/**
 *
 * @author maytemur Java 25 video- Fibonacci serisi recursive fonksiyonla çözümü
 */
public class Bilgisayarkavramlari8 {

    public static int fib(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    //bu algoritma çok kötü 
    //fib 10 için fib9 + fib8 hesaplayacak
    //fib 9 için fib8 + fib7 hesaplayacak
    //fib 8 için fib7 + fib6 hesaplayacak
    //fib 8 için fib7 + fib6 hesaplayacak --en baştaki fib8 için
    //3 tane fib7 için fib6 + fib5 hesaplayacak
    //bu konu algortimada işleniyor genelde hafıza ve hız arasında seçim yaparak gideriz
    public static void main(String[] args) {
        //1 1 2 3 5 8 13
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }
}
