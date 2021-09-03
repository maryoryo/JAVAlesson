// public class Myapp {
  // comment
  /*
  */
  
  // public static void main(String[] args) {
    
    // char a = 'a';

    // int x = 10;

    // long y = 55555555555L;

    // double d = 23243.542;

    // float f = 32.33F;

    // boolean flag = true;

    // String msg;
    // msg = "Hello World Again!";

    // String msg = "Hello World Again!!!";
    // System.out.println(msg);

    // int i;

    // i = 10 / 3;
    // System.out.println(i);
    // i = 10 % 3;
    // System.out.println(i);
    // int x = 5;
    // x++;
    // System.out.println(x);
    // x--;
    // System.out.println(x);

    // int x = 5;
    // x = x + 12;
    // System.out.println(x);

    // String s;
    // s= "hello" + "world";
    // System.out.println(s);

    // double d = 54333.23;
    // int i = (int)d;
    // System.out.println(i);

    // int i = 10;
    // double d = (double)i / 4;
    // System.out.println(d);


    // int score = 45;
    // if (score > 80) {
    //   System.out.println("Great!");
    // } else if (score > 60) {
    //   System.out.println("Good!");
    // } else {
    //   System.out.println("so so ...");
    // }
    // System.out.println();

    // String msg = score > 80 ? "Great!" : "so so ...";
    // System.out.println(msg);


    // String signal = "green";
    // switch (signal) {
    //   case "red":
    //     System.out.println("stop!");
    //     break;
    //   case "yellow":
    //     System.out.println("caution!");
    //     break;
    //   case "blue":
    //   case "green":
    //     System.out.println("go!");
    //     break;
    //   default:
    //     System.out.println("wrong signal");
    // }


    // int i = 0;
    // // while (i < 10) {
    // //   System.out.println(i);
    // //   i++;
    // // }

    // do {
    //   System.out.println(i);
    //   i++;
    // } while (i < 10);


    // for (int i = 0; i < 10; i++) {
    //   if (i == 5) {
    //     // break;
    //     continue;
    //   }
    //   System.out.println(i);
    // }


    // int[] sales;
    // sales = new int[3];
    
    // sales[0] = 100;
    // sales[1] = 200;
    // sales[2] = 300;
    
    // int[] sales;
    // sales = new int[] {100, 200, 300};

    // int[] sales = {100, 200, 300};
    
    // System.out.println(sales[1]);
    
    // sales[1] = 1000;
    
    // System.out.println(sales[1]);
    // int[] sales = {700, 400, 500};
    // for (int i = 0; i < 3; i++) {
    // for (int i = 0; i < sales.length; i++) {
    //   System.out.println(sales[i]);
    // }

    // for (int sale : sales) {
    //   System.out.println(sale);

    // }
    // int x = 10;
    // int y = x;
    // y = 5;
    // System.out.println(x);
    // System.out.println(y);
    
    // int[] a = {3, 5, 7};
    // int[] b = a;
    // b[1] = 8;
    // System.out.println(a[1]);
    // System.out.println(b[1]);
    
    // String s = "hello";
    // String t = s;
    // t = "world";
    // int[] a = {3, 5, 7};
    // int[] b = a;
    // b[1] = 8;
    // System.out.println(s);
    // System.out.println(t);
    


    
  // }
  // public static void sayHi(String name) {
  // public static String sayHi(String name) {
  //   // System.out.println("Hi!" + name);
  //   return "Hi!" + name;
  // }


  // public static void main(String[] args) {
  //   // sayHi("Tom");
  //   // sayHi("Bob");
  //   String msg = sayHi("Steve");
  //   System.out.println(msg);
  // }


    // public static void sayHi(String name) {
    //   // int x = 10;
    //   System.out.println("Hi!" + name);
    // }

    // public static void sayHi() {
    //   System.out.println("Hi! Nobody!");
    // }

    // public static void main(String[] args) {
    //   sayHi();
    //   sayHi("Steve");
    //   // System.out.println(name);
    //   // System.out.println(x);
    // }



    
    
    // }

  // class User {
  //   String name;

  //   User(String name) {
  //     this.name = name;
  //   }
    
  //   User() {
  //     // this.name = "Me!";
  //     this("Me!");
  //   }

  //   void sayHi() {
  //     System.out.println("Hi!" + this.name);
  //   }
  // }


  // class AdminUser extends User {

  //   AdminUser(String name) {
  //     super(name);
  //   }

  //   void sayHello() {
  //     System.out.println("Hello!" + this.name);
  //   }

  //   // @Override
  //   void sayHi() {
  //     System.out.println("[admin] Hi!" + this.name);
  //   }

  // }

    
  // public class Myapp {
  //   public static void main(String[] args) {

  //     User tom = new User("Tom");
  //     System.out.println(tom.name);
  //     tom.sayHi();

  //     AdminUser bob = new AdminUser("bob");
  //     System.out.println(bob.name);
  //     bob.sayHi();
  //     bob.sayHello();
  //   }
  // }


// class User {
//   private String name;
//   private int score;

//   public User(String name, int score) {
//     this.name = name;
//     this.score = score;
//   }

//   public int getScore() { //getter
//     return this.score;
//   }

//   public void setScore(int score) { //setter
//     if (score > 0) {
//       this.score = score;
//     }
//   }
// }

// public class Myapp {

//   private static int score;

//   public static void main(String[] args) {
//     User tom = new User("tom", 65);
//     tom.setScore(85);
//     tom.setScore(-22);
//     score = tom.getScore();
//     System.out.println(score);
//   }
// }


// class User {
//   private String name;
//   private static int count;

//   static {
//     User.count = 0;
//     System.out.println("Static initializer");
//   }

//   {
//     System.out.println("instance initializer");
//   }

//   public User(String name) {
//     this.name = name;
//     User.count++;
//     System.out.println("Constructor");
//   }

//   public static void getInfo() {
//     System.out.println("# of instances: " + User.count);
//   }
// }

// public class Myapp {

//   public static void main(String[] args) {
//     User.getInfo();
//     User tom = new User("tom");
//     User.getInfo();
//     User bob = new User("bob");
//     User.getInfo();
//   }
// }


// abstract class User {
//   public abstract void sayHi();
// }

// class JapaneseUser extends User {
//   @Override
//   public void sayHi() {
//     System.out.println("こんにちは");
//   }
// }

// class AmericanUser extends User {
//   @Override
//   public void sayHi() {
//     System.out.println("Hi");
//   }
// }

// public class Myapp {
//   public static void main(String[] args) {
//     AmericanUser tom = new AmericanUser();
//     JapaneseUser aki = new JapaneseUser();
//     // System.out.println("hi!");
//     tom.sayHi();
//     aki.sayHi();
//   }
// }


// interface Printable {
//   //定数
//   double VERSION = 1.2;
  
//   void print();
//   //default
//   public default void getInfo() {
//     System.out.println("I/F ver." + Printable.VERSION);
//   }
//   //static

// }

// class User implements Printable {
//   @Override
//   public void print() {
//     System.out.println("Now printing user profile ...");
//   }
// }

// public class Myapp {

//   public static void main(String[] args) {
//     User tom = new User();
//     tom.print();
//     tom.getInfo();
//   }

// }


// enum Result {
//   SUCCESS,
//   ERROR,
// }

// public class Myapp {

//   public static void main(String[] args) {
//     Result res;

//     res = Result.ERROR;

//     switch (res) {
//       case SUCCESS:
//         System.out.println("OK");
//         System.out.println(res.ordinal());
//         break;
//       case ERROR:
//         System.out.println("NG");
//         System.out.println(res.ordinal());
//         break;
//     }
    
//   }
// }


// class MyException extends Exception {
//   public MyException(String s) {
//     super(s);
//   }
// }

// public class Myapp {

//   public static void div(int a, int b) {
//     try {
//       if (b < 0) {
//         throw new MyException("not nimus");
//       }
//       System.out.println(a / b);
//     } catch (ArithmeticException e) {
//       System.err.println(e.getMessage());
//     } catch (MyException e) {
//       System.err.println(e.getMessage());
//     } finally {
//       System.out.println("--end--");
//     }
//   }

//   public static void main(String[] args) {
//     div(3, 0);
//     div(5, -2);
//   }
// }


// public class Myapp {

//   public static void main(String[] args) {
//     // Integer i = new Integer(32);
//     // int n = i.intValue();

//     Integer i = 32;
//     i = null;
//     int n = i;
//   }

// }



// class MyInteger {
//   public void getThree(int x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

// class MyDate<T> {
//   public void getThree(T x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

// public class Myapp {
  
//   public static void main(String[] args) {
//     // MyInteger mi = new MyInteger();
//     // mi.getThree(55);
//     MyDate<Integer> i = new MyDate<>();
//     i.getThree(32);
//     MyDate<String> s = new MyDate<>();
//     s.getThree("Hello");
//   }
// }


// class MyRunnable implements Runnable {
//   @Override
//   public void run() {
//     for(int i = 0; i < 500; i++) {
//       System.out.print('*');
//     }
//   }
// }

// public class Myapp {

//   public static void main(String[] args) {
//     // MyRunnable r = new MyRunnable();
//     // Thread t = new Thread(r);
//     // t.start();

//     // new Thread(new Runnable() {
//     //   @Override
//     //   public void run() {
//     //     for(int i = 0; i < 500; i++) {
//     //       System.out.print('*');
//     //     }
//     //   }
//     // }).start();
    
//     new Thread(() -> {
      
//       for(int i = 0; i < 500; i++) {
//         System.out.print('*');
//       }
    
//     }).start();



//     for(int i = 0; i < 500; i++) {
//       System.out.print('.');
//     }
//   }

// }


// public class Myapp {

//   public static void main(String[] args) {
//     String s = "abcdef";
//     System.out.println(s.length());
//     System.out.println(s.substring(2, 5));
//     System.out.println(s.replaceAll("cd", "CD"));

//     String s1 = "ab";
//     String s2 = "ab";

//     if (s1.equals(s2)) {
//       System.out.println("same");
//     }
    
//     if (s1 == s2) {
//       System.out.println("same same");
//     }
    
//     String ss1 = new String("ab");
//     String ss2 = new String("ab");
    
//     if (ss1 == ss2) {
//       System.out.println("same same same");
//     }
//   }

// }


// public class Myapp {

//   public static void main(String[] args) {
    
//     int score = 50;
//     double height = 165.8;
//     String name = "taguchi";

//     System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);
//     System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score, height);

//     String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
//     System.out.println(s);
//   }

// }


// import java.util.Random;

// public class Myapp {

//   public static void main(String[] args) {
//     double d = 53.234;
//     System.out.println(Math.ceil(d));
//     System.out.println(Math.floor(d));
//     System.out.println(Math.round(d));
//     System.out.println(Math.PI);

//     Random r = new Random();
//     System.out.println(r.nextDouble());
//     System.out.println(r.nextInt(100));
//     System.out.println(r.nextBoolean());
//   }
// }


// import java.util.*;

// public class Myapp {

//   public static void main(String[] args) {

//     // ArrayList<Integer> sales = new ArrayList<>();
//     List<Integer> sales = new ArrayList<>();

//     sales.add(10);
//     sales.add(20);
//     sales.add(30);

//     for (int i = 0; i < sales.size(); i++) {
//       System.out.println(sales.get(i));
//     }

//     sales.set(0, 100);
//     sales.remove(2);
    
//     for (Integer sale : sales) {
//       System.out.println(sale);
//     }

//   }
// }


// import java.util.*;

// public class Myapp {

//   public static void main(String[] args) {

//     // HashSet<Integer> sales = new HashSet<>();
//     Set<Integer> sales = new LinkedHashSet<>();

//     sales.add(10);
//     sales.add(20);
//     sales.add(30);
//     sales.add(10);
    
//     System.out.println(sales.size());

//     for (Integer sale : sales) {
//       System.out.println(sale);
//     }
    
//     sales.remove(30);
    
//     for (Integer sale : sales) {
//       System.out.println(sale);
//     }
//   }
// }


// import java.util.*;

// public class Myapp {

//   public static void main(String[] args) {

//     // HashMap<String, Integer> sales = new HashMap<>();
//     Map<String, Integer> sales = new HashMap<>();

//     sales.put("tom", 10);
//     sales.put("bob", 20);
//     sales.put("steve", 30);

//     System.out.println(sales.get("tom"));
//     System.out.println(sales.size());

//     for (Map.Entry<String, Integer> sale : sales.entrySet()) {
//       System.out.println(sale.getKey() + ":" + sale.getValue());
//     }

//     sales.put("tom", 100);
//     sales.remove("steve");

//     for (Map.Entry<String, Integer> sale : sales.entrySet()) {
//       System.out.println(sale.getKey() + ":" + sale.getValue());
//     }

//   }
// }


// import java.util.*;

// public class Myapp {

//   public static void main(String[] args) {
    
//     List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
//     // for (Integer sale : sales) {
//     //   System.out.println(sale);
//     // }

//     sales
//       .stream()
//       .filter(e -> e % 3 == 0)
//       .map(e -> "(" + e + ")")
//       .forEach(System.out::println);

//   }
// }



import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Myapp {

  public static void main(String[] args) {
    LocalDateTime d = LocalDateTime.now();
    // LocalDateTime d = LocalDateTime.of(2016, 1, 1, 10, 10, 10);
    // LocalDateTime d = LocalDateTime.parse("2016-01-01T10:10:10");
    
    System.out.println(d.getYear());
    System.out.println(d.getMonth());
    System.out.println(d.getMonth().getValue());
    
    System.out.println(d.plusMonths(2).minusDays(3));

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy!MM!dd!");
    System.out.println(d.format(dtf));
  }
} 

