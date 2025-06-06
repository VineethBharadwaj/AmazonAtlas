// public class Task001 {
//     public static void main(String[] args) {
//         System.out.println("Hello! Have a great day 😊");
//     }
// }

// public class Task001 {
    
//     public static void add() {
//         int a = 5;
//         int b = 10;
//         int sum = a + b;
//         System.out.println("Sum is: " + sum);
//     }

//     public static void main(String[] args) {
//         add(); 
//         add();  
//         add();  
//     }
// }
// import java.util.Scanner;

// public class Task001 {

    // Task003: Add Two Numbers
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println("Output: " + sum);
//    }

    // Task004: Swap Two Numbers
//    public static void main(String[] args) {
//        int a = 2;
//        int b = 5;
//        System.out.println("Before swap: a = " + a + ", b = " + b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("After swap: a = " + a + ", b = " + b);
//    }

    // Task005: add, subtract, multiply, divide
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    public static int subtract(int a, int b) {
//        return a - b;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public static int divide(int a, int b) {
//        return a / b;
//    }
//
//    public static void main(String[] args) {
//        int x = 20;
//        int y = 10;
//        System.out.println("Main started");
//        System.out.println("Sum of 2 numbers is " + add(x, y));
//        System.out.println("Diff of 2 numbers is " + subtract(x, y));
//        System.out.println("Product of 2 numbers is " + multiply(x, y));
//        System.out.println("Division of 2 numbers is " + divide(x, y));
//        System.out.println("Main ended");
//    }

    // Task006: Ternary Operator
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        String result = (a > b) ? "a is greater" : "b is greater";
//        System.out.println(result);
//    }

    // Task007: Input ID and Pwd
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Id: ");
//        String id = sc.nextLine();
//        System.out.print("Pwd: ");
//        String pwd = sc.nextLine();
//        String maskedPwd = "*".repeat(pwd.length());
//        System.out.println("\nHi,\n\tYour login id is " + id);
//        System.out.println("And your pwd is " + maskedPwd);
//    }
// }
 // Task008: Customer class and object call
//    static class Customer {
//        void accept() {
//            System.out.println("accept customer called");
//        }
//        void display() {
//            System.out.println("display customer called");
//        }
//    }
//
//    public static void main(String[] args) {
//        Customer cobj = new Customer();
//        cobj.accept();
//        cobj.display();
//    }

    // Task009: Check greater of 2 numbers using if else
//    public static void main(String[] args) {
//        int num1 = 25;
//        int num2 = 40;
//        if (num1 > num2) {
//            System.out.println("num1 is greater");
//        } else {
//            System.out.println("num2 is greater");
//        }
//    }

    // Task010: Check greater of 3 numbers using else if
//    public static void main(String[] args) {
//        int num1 = 25;
//        int num2 = 40;
//        int num3 = 35;
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("num1 is greatest");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("num2 is greatest");
//        } else {
//            System.out.println("num3 is greatest");
//        }
//    }
//}

