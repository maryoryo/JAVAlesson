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

  class User {
    String name;

    User(String name) {
      this.name = name;
    }
    
    User() {
      // this.name = "Me!";
      this("Me!");
    }

    void sayHi() {
      System.out.println("Hi!" + this.name);
    }
  }


  class AdminUser extends User {

    AdminUser(String name) {
      super(name);
    }

    void sayHello() {
      System.out.println("Hello!" + this.name);
    }

    // @Override
    void sayHi() {
      System.out.println("[admin] Hi!" + this.name);
    }

  }

    
  public class Myapp {
    public static void main(String[] args) {

      User tom = new User("Tom");
      System.out.println(tom.name);
      tom.sayHi();

      AdminUser bob = new AdminUser("bob");
      System.out.println(bob.name);
      bob.sayHi();
      bob.sayHello();
    }
  }


