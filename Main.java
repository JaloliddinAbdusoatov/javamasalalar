
// 1

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println(a*4);

// }
// }

// 2

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// System.out.println(a*a);

// }
// }

// 3

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// // int s = sc.nextInt(a*b);
// // int p = sc.nextInt(2*(a+b));

// System.out.println(a*b);
// System.out.println(2*(a+b));

// }
// }

// 4

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();

// System.out.println(a/100);

// }
// }

// 5

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();

// System.out.println(a/1000);

// }
// }

// 6

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();

// System.out.println(a/1024);

// }
// }

// 7

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();

// int b = a/10;
// int d = a%10;
// int c = d + b;
// System.out.println(c);

// }
// }

// =========================================================================================

// BOOLEAN

// 1

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();

// boolean b = (a>0);

// System.out.println(b);

// }
// }

// 2

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();

// boolean b = a%2 == 0;

// System.out.println(b);

// }
// }

// 3

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         boolean c = a > 2;
//         boolean d = b <= 3;

//         System.out.println(c + " " + d);

//     }
// }

// =====================================================================================================

// SHART OPERATORI

// 1

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if (a > 0) {
//             System.out.println(a + 1);
//         } else {
//             System.out.println(a);
//         }

//     }
// }

// 3

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if (a > 0) {
//             System.out.println(a + 1);
//         } else if (a < 0) {
//             System.out.println(a - 2);
//         }
//         if (a == 0) {
//             System.out.println(10);
//         }

//     }
// }

// 4

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a > 0) {
//             System.out.println(a);
//         }
//         if (b > 0) {
//             System.out.println(b);
//         }
//         if (c > 0) {
//             System.out.println(c);
//         }

//     }
// }

// 5

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a > 0) {
//             System.out.println("a musbat");
//         } else {
//             System.out.println("a manfiy");
//         }
//         if (b > 0) {
//             System.out.println("a musbat");
//         } else {
//             System.out.println("b manfiy");
//         }
//         if (c > 0) {
//             System.out.println("a musbat");
//         } else {
//             System.out.println("c manfiy");
//         }

//     }
// }

// 6

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a > b) {
//             System.out.println("a katta");
//         } else {
//             System.out.println("b katta");
//         }
//     }
// }

// 7

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a > b) {
//             System.out.println("ikkinchi");
//         } else {
//             System.out.println("birinchi");
//         }
//     }
// }

// 8

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         if (a > b) {
//             System.out.println(a);
//         } else {
//             System.out.println(b);
//         }
//     }
// }

// 12

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (b > a && c > a) {
//             System.out.println(a);
//         }
//         if (a > b && c > b) {
//             System.out.println(b);
//         }
//         if (c > a && b > c) {
//             System.out.println(c);
//         }
//     }
// }

// 13

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (b < a && a < c) {
//             System.out.println(a);
//         } else if (a < b && b < c) {
//             System.out.println(b);
//         } else if (c < a && c < b) {
//             System.out.println(c);
//         }
//     }
// }

// 14 o'xshamagan

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a > b && b > c) {
//             System.out.println(c);
//         }
//     }
// }

// 15

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a + b > c) {
//             System.out.println(a + b);
//             System.out.println("a");
//             System.out.println("b");
//         } else if (a + c > b) {
//             System.out.println(a + c);
//             System.out.println("a");
//             System.out.println("c");
//         } else if (b + c > a) {
//             System.out.println(b + c);
//             System.out.println("b");
//             System.out.println("c");
//         }
//     }
// }

// 16

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a < b && b < c) {
//             System.out.println(2 * a);
//             System.out.println(2 * b);
//             System.out.println(2 * c);
//         } else if (a > b && b > c) {
//             System.out.println(-a);
//             System.out.println(-b);
//             System.out.println(-c);
//         }
//     }
// }

// 17

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a < b && b < c || a > b && b > c) {
//             System.out.println(2 * a);
//             System.out.println(2 * b);
//             System.out.println(2 * c);
//         } else {
//             System.out.println(-a);
//             System.out.println(-b);
//             System.out.println(-c);
//         }
//     }
// }

// 18

// import java.util.Scanner;

// public class Main {
//     // private static PrintStream out;
//     public static void main(String[] args) {
//         var sc = new Scanner(System.in);
//         int a, b, c;

//         a = sc.nextInt();
//         b = sc.nextInt();
//         c = sc.nextInt();
//         if (a == b) {
//             System.out.println(3);
//         } else if (a == c) {
//             System.out.println(2);
//         } else if (b == c) {
//             System.out.println(1);
//         }

//     }

// }

// 19

// import java.util.Scanner;

// public class Main {
//     // private static PrintStream out;
//     public static void main(String[] args) {
//         var sc = new Scanner(System.in);
//         int a, b, c, d;

//         a = sc.nextInt();
//         b = sc.nextInt();
//         c = sc.nextInt();
//         d = sc.nextInt();
//         if (a == b && a == c) {
//             System.out.println("to'rtinchi");
//         } else if (b == a && b == d) {
//             System.out.println("uchinchi");
//         } else if (c == a && c == d) {
//             System.out.println("ikkinchi");
//         } else if (d == c && d == b) {
//             System.out.println("birinchi");
//         }
//     }
// }

// 24

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x > 0) {
//             System.out.println(2 * (Math.sin(x)));
//         } else if (x <= 0) {
//             System.out.println(x - 6);
//         }
//     }
// }

// 25

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x > 2 || x < -2) {
//             System.out.println(2 * x);
//         } else {
//             System.out.println(-3 * x);
//         }
//     }
// }

// 26

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x <= 0) {
//             System.out.println(-x);
//         }
//         if (0 < x && x < 2) {
//             System.out.println(Math.pow(x, 2));
//         }
//         if (x >= 2) {
//             System.out.println(4);
//         }
//     }
// }

// 27

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x < 0) {
//             System.out.println(0);
//         }
//         if (0 < x && x < 2) {
//             System.out.println(Math.pow(x, 2));
//         }
//         if (x >= 2) {
//             System.out.println(4);
//         }
//     }
// }

// 28

// import java.util.Scanner;

// public class Main {
//     // private static PrintStream out;
//     public static void main(String[] args) {
//         var sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if (a % 400 == 0 || a % 4 == 0 && a % 100 != 0) {
//             System.out.println("kabisa yili");
//         } else {
//             System.out.println("kabisa yili emas");
//         }

//     }
// }

// 29

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         if (a % 2 == 0 && a > 0) {
//             System.out.println("musbat juft son");
//         } else if (a % 2 == 0 && a < 0) {
//             System.out.println("manfiy juft son");
//         } else if (a == 0) {
//             System.out.println("son nolga teng");
//         }
//     }
// }

// 30

// import java.util.Scanner;

// public class Main{
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int a = sc.nextInt();

// if(a%2 == 0 && a>0){
// System.out.println("juft son");
// }
// else if(a%2 ==0 && a>9){
// System.out.println("ikki xonali juft son");
// }else if(a%2 == 0 && a>99){
// System.out.println("uch xonali juft son");
// }else if(a==0){
// System.out.println("son nolga teng");
// }else if(a%2 !=0 && a>9 ){
// System.out.println("uch xonali musbat son");
// }else if(a%2 != 0 && a>99){
// System.out.println("uch xonali toq son");
// }else if(a%2 ==0 && a<0){
// System.out.println("manfiy juft son");
// }
// else if(a%2 !=0 && a < 0){
// System.out.println("manfiy toq son");
// }
// else if(a%2 !=0 && a<-9){
// System.out.println("manfiy, toq, ikki xonali son");
// }else if(a%2 !=0 && a<-99){
// System.out.println("manfiy, toq, uch xonali son");
// }else if(a%2 == 0 && a<0){
// System.out.println("manfiy, juft son");
// }else if(a%2 == 0 && a<-9){
// System.out.println("manfiy, juft, ikki xonali son");
// }else if(a%2 == 0 && a<-99){
// System.out.println("manfiy, juft, uch xonali son");
// }
// }
// }

// ===================================================================================================

// TANLASH OPERATORI

// 1

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("Dushanba");
//                 break;

//             case 2:
//                 System.out.println("Seshanba");
//                 break;

//             case 3:
//                 System.out.println("Chorshanba");
//                 break;

//             case 4:
//                 System.out.println("Payshanba");
//                 break;

//             case 5:
//                 System.out.println("Juma");
//                 break;

//             case 6:
//                 System.out.println("Shanba");
//                 break;

//             case 7:
//                 System.out.println("Yakshanba");
//                 break;

//             default:
//                 System.out.println("Bunday hafta kuni yo'q");
//         }
//     }
// }

// 2

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("yomon");
//                 break;

//             case 2:
//                 System.out.println("qoniqarsiz");
//                 break;

//             case 3:
//                 System.out.println("qoniqarli");
//                 break;

//             case 4:
//                 System.out.println("yaxshi");
//                 break;

//             case 5:
//                 System.out.println("a'lo");
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//     }
// }

// 3

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("qish");
//                 break;

//             case 2:
//                 System.out.println("qish");
//                 break;

//             case 3:
//                 System.out.println("bahor");
//                 break;

//             case 4:
//                 System.out.println("bahor");
//                 break;

//             case 5:
//                 System.out.println("bahor");
//                 break;

//             case 6:
//                 System.out.println("yoz");
//                 break;

//             case 7:
//                 System.out.println("yoz");
//                 break;

//             case 8:
//                 System.out.println("yoz");
//                 break;

//             case 9:
//                 System.out.println("kuz");
//                 break;

//             case 10:
//                 System.out.println("kuz");
//                 break;

//             case 11:
//                 System.out.println("kuz");
//                 break;

//             case 12:
//                 System.out.println("qish");
//                 break;

//             default:
//                 System.out.println("Bunday oy yo'q");
//         }
//     }
// }

// 4

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         switch (a) {
//             case 1:
//                 System.out.println("31 kun");
//                 break;

//             case 2:
//                 System.out.println("27 yoki 28 kun");
//                 break;

//             case 3:
//                 System.out.println("31 kun");
//                 break;

//             case 4:
//                 System.out.println("30 kun");
//                 break;

//             case 5:
//                 System.out.println("31 kun");
//                 break;

//             case 6:
//                 System.out.println("30 kun");
//                 break;

//             case 7:
//                 System.out.println("31 kun");
//                 break;

//             case 8:
//                 System.out.println("31 kun");
//                 break;

//             case 9:
//                 System.out.println("30 kun");
//                 break;

//             case 10:
//                 System.out.println("31 kun");
//                 break;

//             case 11:
//                 System.out.println("30 kun");
//                 break;

//             case 12:
//                 System.out.println("31 kun");
//                 break;

//             default:
//                 System.out.println("Bunday oy yo'q");
//         }
//     }
// }

// 5

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         switch (c) {
//             case 1:
//                 System.out.println(a + b);
//                 break;

//             case 2:
//                 System.out.println(a - b);
//                 break;

//             case 3:
//                 System.out.println(a / b);
//                 break;

//             case 4:
//                 System.out.println(a * b);
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//     }
// }

// 6

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         int c = sc.nextInt();

//         switch (c) {
//             case 1:
//                 System.out.println(a / 10);
//                 break;

//             case 2:
//                 System.out.println(a * 1000);
//                 break;

//             case 3:
//                 System.out.println(a / 1);
//                 break;

//             case 4:
//                 System.out.println(a / 1000);
//                 break;

//             case 5:
//                 System.out.println(a / 100);
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//     }
// }

// 7

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         int c = sc.nextInt();

//         switch (c) {
//             case 1:
//                 System.out.println(a / 1);
//                 break;

//             case 2:
//                 System.out.println(a / 1000000);
//                 break;

//             case 3:
//                 System.out.println(a / 1000);
//                 break;

//             case 4:
//                 System.out.println(a * 1000);
//                 break;

//             case 5:
//                 System.out.println(a / 100);
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//     }
// }

// 8

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int d = sc.nextInt();

//         int m = sc.nextInt();

//         switch (m) {
//             case 1:
//                 System.out.println("yanvar");
//                 break;

//             case 2:
//                 System.out.println("F");
//                 break;

//             case 3:
//                 System.out.println("m");
//                 break;

//             case 4:
//                 System.out.println("aprel");
//                 break;

//             case 5:
//                 System.out.println("may");
//                 break;

//             case 6:
//                 System.out.println("iyun");
//                 break;

//             case 7:
//                 System.out.println("iyul");
//                 break;

//             case 8:
//                 System.out.println("avgust");
//                 break;

//             case 9:
//                 System.out.println("sentabr");
//                 break;

//             case 10:
//                 System.out.println("oktabr");
//                 break;

//             case 11:
//                 System.out.println("noyabr");
//                 break;

//             case 12:
//                 System.out.println("dekabr");
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//         System.out.println(d);
//     }
// }

// 9

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int d = sc.nextInt();

//         int m = sc.nextInt();

//         switch (m) {
//             case 1:
//                 System.out.println("fevral");
//                 break;

//             case 2:
//                 System.out.println("mart");
//                 break;

//             case 3:
//                 System.out.println("aprel");
//                 break;

//             case 4:
//                 System.out.println("may");
//                 break;

//             case 5:
//                 System.out.println("iyun");
//                 break;

//             case 6:
//                 System.out.println("iyul");
//                 break;

//             case 7:
//                 System.out.println("avgust");
//                 break;

//             case 8:
//                 System.out.println("sentabr");
//                 break;

//             case 9:
//                 System.out.println("oktabr");
//                 break;

//             case 10:
//                 System.out.println("noyabr");
//                 break;

//             case 11:
//                 System.out.println("dekabr");
//                 break;

//             case 12:
//                 System.out.println("yanvar");
//                 break;

//             default:
//                 System.out.println("xato");
//         }
//         System.out.println(d + 1);
//     }
// }

// 12

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int r = sc.nextInt();

//         int m = sc.nextInt();

//         switch (m) {
//             case 1:
//                 System.out.println(r);
//                 break;

//             case 2:
//                 System.out.println(2 * r);
//                 break;

//             case 3:
//                 System.out.println(2 * 3.14 * r);
//                 break;

//             case 4:
//                 System.out.println(3.14 * (r * r));
//                 break;

//             default:
//                 System.out.println("xato");
//         }

//     }
// }

// 13

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         int m = sc.nextInt();

//         switch (m) {
//             case 1:
//                 System.out.println(a);
//                 break;

//             case 2:
//                 System.out.println(a * (Math.sqrt(2)));
//                 break;

//             case 3:
//                 System.out.println((a * (Math.sqrt(2))) / 2);
//                 break;

//             case 4:
//                 System.out.println(((a * (Math.sqrt(2))) * ((a * (Math.sqrt(2))) / 2)) / 2);
//                 break;

//             default:
//                 System.out.println("xato");
//         }

//     }
// }

// 14

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();

//         int m = sc.nextInt();

//         switch (m) {
//             case 1:
//                 System.out.println(a);
//                 break;

//             case 2:
//                 System.out.println(a * ((Math.sqrt(3)) / 6));
//                 break;

//             case 3:
//                 System.out.println(2 * (a * ((Math.sqrt(3)) / 6)));
//                 break;

//             case 4:
//                 System.out.println((a * a) * ((Math.sqrt(3) / 4)));
//                 break;

//             default:
//                 System.out.println("xato");
//         }

//     }
// }

// 15

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int m = sc.nextInt();

//         switch (n) {
//             case 6:
//                 System.out.println("olti");
//                 break;

//             case 7:
//                 System.out.println("yetti");
//                 break;

//             case 8:
//                 System.out.println("sakkiz");
//                 break;

//             case 9:
//                 System.out.println("to'qqiz");
//                 break;

//             case 10:
//                 System.out.println("o'n");
//                 break;

//             case 11:
//                 System.out.println("valet");
//                 break;

//             case 12:
//                 System.out.println("dama");
//                 break;

//             case 13:
//                 System.out.println("qirol");
//                 break;

//             case 14:
//                 System.out.println("tuz");
//                 break;

//             default:
//                 System.out.println("xato");
//                 break;
//         }

//         switch (m) {
//             case 1:
//                 System.out.println("g'isht");
//                 break;

//             case 2:
//                 System.out.println("olma");
//                 break;

//             case 3:
//                 System.out.println("chillak");
//                 break;

//             case 4:
//                 System.out.println("qarg'a");
//                 break;

//             default:
//                 System.out.println("xato");
//                 break;
//         }

//     }
// }

// 16

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int m = sc.nextInt();

//         switch (m) {
//             case 20:
//             case 21:
//             case 22:
//             case 23:
//             case 24:
//             case 25:
//             case 26:
//             case 27:
//             case 28:
//             case 29:
//                 System.out.println("20-29 yosh atrofida");
//                 break;

//             case 30:
//             case 31:
//             case 32:
//             case 33:
//             case 34:
//             case 35:
//             case 36:
//             case 37:
//             case 38:
//             case 39:
//                 System.out.println("30-39 yosh atrofida");
//                 break;

//             case 40:
//             case 41:
//             case 42:
//             case 43:
//             case 44:
//             case 45:
//             case 46:
//             case 47:
//             case 48:
//             case 49:
//                 System.out.println("40-49 yosh atrofida");
//                 break;

//             case 50:
//             case 51:
//             case 52:
//             case 53:
//             case 54:
//             case 55:
//             case 56:
//             case 57:
//             case 58:
//             case 59:
//                 System.out.println("50-59 yosh atrofida");
//                 break;

//             case 60:
//             case 61:
//             case 62:
//             case 63:
//             case 64:
//             case 65:
//             case 66:
//             case 67:
//             case 68:
//             case 69:
//                 System.out.println("60-69 yosh atrofida");
//                 break;

//             default:
//                 System.out.println("xato");
//         }

//     }
// }

// ===============================================================================================================================

// FOR SIKL

// 1

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int k = sc.nextInt();
//         int n = sc.nextInt();

//         for (int i = 0; i <= k; i++) {
//             System.out.println(n);
//         }
//     }
// }

// 2

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for (int i = a; i <= b; i++) {
//             System.out.println(i);
//         }

//         int n = b - a + 1;
//         System.out.println(n);

//     }
// }

// 3

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for (int i = b; i >= a; i--) {
//             System.out.println(i);
//         }

//         int n = b - a + 1;
//         System.out.println(n);

//     }
// }

// 4

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for (int i = 1; i <= b; i++) {
//             System.out.println(i * a);
//         }
//     }
// }

// 5

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         float a = sc.nextInt();

//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i * a / 10);
//         }
//     }
// }

// 6

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         float a = sc.nextInt();

//         for (float i = 1; i <= 2; i += 0.2) {
//             System.out.println(i * a);
//         }
//     }
// }

// 7

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int k = 0;

//         for (int i = a; i <= b; i++) {
//             System.out.println(k);
//             k = k + 1;
//         }
//         System.out.println(k);
//     }
// }

// 8

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int k = 0;

//         for (int i = a; i <= b; i++) {
//             System.out.println(k);
//             k = k * 1;
//         }
//         System.out.println(k);
//     }
// }

// 9

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int k = 0;

//         for (int i = a; i <= b; i++) {
//             k += Math.pow(i, 2);
//         }
//         System.out.println(k);
//     }
// }

// 11

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int k = 0;

//         for (int i = a; i <= b; i++) {
//             k += Math.pow(i, 2);
//         }
//         System.out.println(k);
//     }
// }

// 12

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         float n = sc.nextInt();

//         for (float i = 1; i <= n; i += 0.1) {
//             System.out.println(i * n);
//         }
//     }
// }

// 14

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         float n = 4;
//         float k = 0;

//         for (float i = 1; i <= n; i++) {
//             k += (2 * i - 1);
//             System.out.println(k);
//         }
//     }
// }

// 16

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int n = sc.nextInt();
//         int b = 1;

//         for (int i = 1; i <= n; i++) {
//             b *= a;
//         }
//         System.out.println(b);
//     }
// }

// =============================================================

// WHILE

// 1

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         while (a >= b) {
//             a -= b;
//         }
//         System.out.println(a);
//     }
// }

// 2

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = 0;

//         while (a >= b) {
//             a -= b;
//             c++;
//         }
//         System.out.println(c);
//     }
// }

// 3

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = 0;

//         while (a >= b) {
//             a -= b;
//             c++;
//         }
//         System.out.println(c);
//         System.out.println(a);
//     }
// }

// 4

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int i = 1;

//         while (i < n) {
//             i *= 3;
//         }
//         if (i == n) {
//             System.out.println("3 ning darajasi ");
//         } else {
//             System.out.println("3 ning darajasi emas");
//         }

//     }
// }

// 5

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = 0;

//         while (n > 1) {
//             k++;
//             n /= 2;
//         }

//         System.out.println(k);

//     }
// }

// 6

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int p = 1;

//         while (n > 0) {
//             p *= n;
//             n = n - 2;
//         }

//         System.out.println(p);

//     }
// }

// 7

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int i = 1;

//         while (n > i * i) {
//             i++;
//         }

//         System.out.println(i);
//     }
// }

// 8

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int i = 1;

//         while (n > i * i) {
//             i++;
//         }

//         System.out.println(i - 1);
//     }}

//     9

//     let n = 16;
//     let d = 1;

//     while(3**d<=n)
//     {
//         d++;
// }console.log(d);

// 9

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int d = 1;

//         while ((Math.pow(d, 3)) <= n) {
//             d++;
//         }

//         System.out.println(d);
//     }
// }

// 10

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int d = 1;

//         while ((Math.pow(d, 3)) <= n) {
//             d++;
//         }

//         System.out.println(d - 1);
//     }
// }

// 12

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = 0;
//         int c = 0;

//         while (n > 1) {
//             k++;
//             c += k;
//             if (c >= n) {
//                 c = c - k;
//                 k = k - 1;
//                 System.out.println(k);
//                 System.out.println(c);
//                 break;
//             }
//         }
//     }
// }

// 15

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int s = sc.nextInt();
//         int p = 15;
//         int a = 0;
//         int t = 0;

//         while (s > 0) {
//             a += s / 100 * p;
//             t++;
//             if (s * 2 <= a) {
//                 System.out.println(a + " " + t);
//                 break;
//             }
//         }
//     }
// }

// 16

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int b = sc.nextInt();
//         int p = 15;
//         int c = 0;
//         int t = 0;

//         while (b > 0) {
//             c += b / 100 * p;
//             t++;
//             if (c >= 200) {
//                 System.out.println(c + " " + t);
//                 break;
//             }
//         }
//     }
// }

// 17

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int m = 3;
//         int t = n;

//         while (n > m) {
//             n = n - m;
//         }
//         t = t - n;
//         System.out.println(n + " " + t);
//     }
// }

// 18

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = 0;

//         while (n > 0) {
//             k += n % 10;
//             n = n / 10;
//             k *= 10;
//         }
//         System.out.println(k / 10);
//     }
// }

// ===================================================================================================================

// MASSIV

// 7

// import javax.swing.*;
// import java.awt.*;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = {2, 32, -22, 44, 3, 7};

//         int t;
//         for (int j = 0; j < a.length; j++) {
//             for (int i = j+1; i <a.length ; i++) {
//                 if (a[j] > a[i]) {
//                     t = a[i];
//                     a[i] = a[j];
//                     a[j] = t;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(a));
//     }
// }



// 8

// import javax.swing.*;
// import java.awt.*;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = { 4, 5, 7, 8, 6, 9 };

//         int t;
//         int s = 0;
//         for (int j = 0; j < a.length; j++) {
//             t = a[j] % 2;
//             if (t == 1) {

//                 System.out.print(a[j] + " ");
//                 s++;
//             }
//         }
//         System.out.println("toqlar soni = " + s);
//     }
// }




// 9

// import javax.swing.*;
// import java.awt.*;
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = {4, 5, 7, 8, 6, 9};

//         int t;
//         int s = 0;
//         for (int j = 0; j < a.length; j++) {
//             t = a[j] % 2;
//             if (t == 0){

//                 System.out.print(a[j] + " ");
//                 s++;
//             }
//         }
//         System.out.println("juftlar soni = " + s);
//     }
// }








