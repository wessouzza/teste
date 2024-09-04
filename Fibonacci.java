import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Informe um número: ");
    
    int num = scanner.nextInt();
    scanner.close();

    boolean isFibonacci = isFibonacci(num);

    if (isFibonacci) {
      System.out.println(num + " pertence à sequência.");
    } else {
      System.out.println(num + " não pertence à sequência.");
    }
  }

  public static boolean isFibonacci(int num) {
    int a = 0;
    int b = 1;
    while (b < num) {
      int temp = a;
      a = b;
      b = temp + b;
    }
    return b == num;
  }
}
