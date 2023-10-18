public class Main {
  
  public static void main(String[] args) {

    System.out.println("   JAVA LEARNING  ");
    //Println is used to endline , while print() line not ending
    // Without "" to display numbers:
   
    System.out.println("   USE OF MAthematical Operations  ");
   
    System.out.println("Addition of Two Numbers : 1+5 = " + 1+5);
    System.out.println("Multiplication of Two Numbers : 2*8 = " +2*8);
    System.out.println("Division of Two Numbers : 6/10 = " + 6/10);
    //Variables
    String name = "Nofal";
    int mynum = 12;
    char myLetter = 'D';
    System.out.println("String \" NOFAL\" = "+name);
    System.out.println("int Number = "+mynum);
    System.out.println("Char Character = "+ myLetter);
    // combining variables
   
    System.out.println("Adding Tow Words In String : ");
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
    System.out.println(MyText.indexOf("C"));//Location of Text in String

    // To Concatention of strings + is used 
    // to goto new line

    System.out.println("GOING TO NEW LINE \nHello");
    // tab
    System.out.println("GOING TO NEW LINE \tHello");
    //  backspace
    System.out.println("GOING TO NEW LINE \bHello");

    // Java Math
  
    System.out.println(Math.max(10,12 ));
    System.out.println(Math.min(9,19));
    System.out.println(Math.sqrt(89));
    System.out.println(Math.abs(88.22));

    // Java booleans or said to be condition of true or false

    Boolean javaIsFun = true ;
    Boolean javaIsNotFun = false;
    System.out.println(javaIsFun);
    System.out.println(javaIsNotFun);

    // Some Examples related to integers

    System.out.println(10==30);
    System.out.println(10<=30);
    System.out.println(10>=30);
    System.out.println(10>30);
    System.out.println(10<30);

    // real life Example

    int myAge = 18, myBrosAge = 12;
    System.out.println(myAge<myBrosAge);
    System.out.println(myAge>myBrosAge);

    // use of if else to apply conditions

    if(myAge>myBrosAge)
  {
    System.out.println("You are Elder");
  }
  else
    System.out.println("You are not Elder");

    // switch is used for condition

    System.out.println("USE OF SWITCH CASE");

    int age = 12;
  switch(age){
  case 12:
    System.out.println("Your Age is 12");
  break;
  default:
    System.out.println("Default");

    // use of while loop
    // To print 1 to 5

  
    int q=0;
  while(q < 5){
    System.out.println(q);
    q++; 
  }
    // use of do-while loop
  
  do{
    System.out.println(q);
    q++;
  }
  while(q<5);
  
  // For loop

  for (int h=1; h<5; h++)
  {
    System.out.println(h);

  }
  
  // Nested Loop Exexcute 2 times

  for (int f = 1 ; f<=12;f++)
  {
    System.out.println(f);

    for(int p = 0 ; p>20; p++)
    {
      System.out.println(p);
    }   
  }


}
}
}
