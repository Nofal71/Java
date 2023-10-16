public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
    System.out.println("Nofal hassaan");
    System.out.println("My First Repository");
    //Println is used to endline , whilw print() line not ending
    // Without "" to display numbers:
    System.out.println(1+5);
    System.out.println(2*8);
    System.out.println(6/10);
    //Variables
    String name = "Nofal";
    int mynum = 12;
    char myLetter = 'D';
    System.out.println(name);
    System.out.println(mynum);
    System.out.println(myLetter);
    // combining variables

    String firstname = "Nofal";
    String Lastname = " Hassaan";
    String Fullname = firstname + Lastname;
    
    System.out.println(Fullname);

    //Type casting
    // Narrrow to wide

    System.out.println("ITS A TYPE CASTING FROM NARROW TO WIDE");
    int myint = 12;
    double mydouble = myint;

    System.out.println(myint);
    System.out.println(mydouble);

    // wide to Narrow
    System.out.println("ITS A TYPE CASTING FROM WIDE TO NARROW ");
    System.out.println("For Example : ");
    double weight = 105.70;
    int FinalWeight = (int) weight;
    char unit = 'g';  //Used as a unit of weught
    
    System.out.print("Accurate Weight(in decimals) = ");
    System.out.print(weight);
    System.out.println(unit);
    System.out.print("Approximate Amount = ");
    System.out.print(FinalWeight);
    System.out.println(unit);

    // Java logics

    int x = 5;
    int y = 3;
    System.out.println(x > y); // True
    System.out.println(x < y); // fasle
    System.out.println(x == y);// fasle
    // And,Or
    System.out.println(x > y && y < x); // True if both are true
    System.out.println(x > y || y == x); // True if one is are true
    System.out.println(!(x > y &&  y == x)); // Reverse the Result
    
    // Advance of Strings
    System.out.println("Some Advance Uses of Strings : ");
    String MyText = "CASE";
    System.out.println(MyText.toLowerCase());
    System.out.println(MyText.toUpperCase());  
    System.out.println(MyText.indexOf("E"));
    System.out.println(MyText.indexOf("B"));
    System.out.println(MyText.indexOf("C"));//Location of Text in String
    
    
  }
}
