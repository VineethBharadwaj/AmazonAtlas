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

 // Task009: Greater of 2 numbers using if-else
//    public static void main(String[] args) {
//        int num1 = 15;
//        int num2 = 25;
//
//        if (num1 > num2) {
//            System.out.println("num1 is greater");
//        } else {
//            System.out.println("num2 is greater");
//        }
//    }

    // Task010: Greater of 3 numbers using else-if
//    public static void main(String[] args) {
//        int num1 = 30;
//        int num2 = 20;
//        int num3 = 40;
//
//        if (num1 > num2 && num1 > num3) {
//            System.out.println("num1 is greatest");
//        } else if (num2 > num1 && num2 > num3) {
//            System.out.println("num2 is greatest");
//        } else {
//            System.out.println("num3 is greatest");
//        }
//    }

 // Task011: Weekday checker using switch
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number (1–7): ");
//        int day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Sunday");
//                break;
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 7:
//                System.out.println("Saturday");
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
//        sc.close();
//    }

    // Task012: Login validation using while loop
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String loginid = "Vineeth";
//        String pwd = "12345867";
//        int count = 0;
//
//        while (loginid.equals("Vineeth") && pwd.equals("12345867")) {
//            System.out.println("You have logged in for " + count++ + " times");
//            System.out.println("Enter your login id and password:");
//            loginid = sc.nextLine();
//            pwd = sc.nextLine();
//        }
//        sc.close();
//    }

    // Task012: Login validation using do-while loop
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String loginid;
//        String pwd;
//        int count = 0;
//
//        do {
//            System.out.println("You have logged in for " + count++ + " times");
//            System.out.println("Enter your login id and password:");
//            loginid = sc.nextLine();
//            pwd = sc.nextLine();
//        } while (loginid.equals("Vineeth") && pwd.equals("12345867"));
//
//        sc.close();
//    }

    // Task013: Print 10 to 1 skipping 5 and 7
//    public static void main(String[] args) {
//        for (int i = 10; i > 0; i--) {
//            if (i == 5 || i == 7) {
//                continue;
//            }
//            System.out.println(i);
//        }
//    }

    // Task014: Array demo and out-of-bound access
//    public static void main(String[] args) {
//        char[] arr = {'a', 'e', 'i', 'o', 'u'};
//        System.out.println(arr); // prints the whole array as a string
//
//        String[] names = {"Meena", "Tina", "Veena", "Heena"};
//        System.out.println(names[0]);
//        names[1] = "Reena";
//        System.out.println(names[1]);
//        System.out.println(names.length);
//
//        // Uncomment below lines to test exceptions
//        // System.out.println(names[4]); // ArrayIndexOutOfBoundsException
//        // System.out.println(names[-1]); // Compilation error
//    }

    // Task015: String demonstration
//    public static void main(String[] args) {
//        String str1 = "Java Strings ";  // String literal
//        String str2 = new String(str1); // object creation
//        String str3 = new String("are easy to learn");
//        char[] ch = {'S', 't', 'r', 'i', 'n', 'g'};
//        String str4 = new String(ch);
//
//        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n" + str4);
//
//        // Showing immutability
//        String name = "Vineeth is a trainer";
//        name = "Hello";
//        System.out.println(name);
//    }
//}
// package Enumerations;

// enum color {
//     red, blue, green, yellow
// }

// public class Demo01 {
//     public static void main(String[] args) {
//         color c1 = color.yellow;
//         System.out.println(c1);
//     }
// }


// package Enumerations;

// enum Weekdays {
//     Sunday, Monday, Tuesday
// }

// public class Demo01 {
//     public static void main(String[] args) {
//         Weekdays c1 = Weekdays.Tuesday;
//         System.out.println(c1);
//     }
// }


// public class Person {
//     private String name;

//     // Getter
//     public String getName() {
//         return name;
//     }

//     // Setter
//     public void setName(String newName) {
//         this.name = newName;
//     }
// }
// public class Task018 {
//     public static void main(String[] args) {
//         Person myObj = new Person();
//         myObj.setName("John");
//         System.out.println(myObj.getName());
//     }
// }
