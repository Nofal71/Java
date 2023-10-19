public class Main {
  
  public static void main(String[] args) {

    System.out.println(" --------------\n| JAVA LEARNING |\n --------------" );
    //Println is used to endline , while print() line not ending
    // Without "" to display numbers:
   
    System.out.println(" --------------------\n| USE OF MAthematical|\n|    Operations      |\n --------------------");
   
    System.out.println("Addition of Two Numbers : 1 + 5 = " + 1+5);
    System.out.println("Multiplication of Two Numbers : 2 * 8 = " +2*8);
    System.out.println("Division of Two Numbers : 6/10 = " + 6/10);
    //Variables
    String name = "Nofal";
    int mynum = 12;
    char myLetter = 'D';
    System.out.println("String \" NOFAL\" = "+name);
    System.out.println("int Number = "+mynum);
    System.out.println("Char Character = "+ myLetter);
    // combining variables
   
    System.out.println("Adding Two Words In String : ");
    String firstname = "Nofal";
    String Lastname = " Hassaan";
    String Fullname = firstname + Lastname;
    
    System.out.println("First Name : "+firstname);
    System.out.println("Last Name : "+Lastname);
    System.out.println("First Name + Last Name : "+Fullname);

    //Type casting
    // Narrrow to wide

    System.out.println(" --------------\n| TYPE CASTING |\n --------------\n NARROW TO WIDE : " );
    int myint = 12;
    double mydouble = myint;

    System.out.println("int Myint : "+myint);
    System.out.println("double myDouble : "+mydouble);

    // wide to Narrow
    System.out.println(" WIDE TO NARROW ");
    System.out.println("For Example : ");
    double weight = 105.70;
    int FinalWeight = (int) weight;
    char unit = 'g';  //Used as a unit of weught
    
    
    System.out.print("double weight : "+weight);
    System.out.println( unit);
    System.out.print("int weight : (int) = "+FinalWeight);
    System.out.println( unit);

    // Java logics
   System.out.println(" --------------\n| JAVA LOGICS |\n --------------" );

    // And,Or
    int x = 5;
    int y = 3;
    System.out.println("x > y && y < x = ");
    System.out.println(x > y && y < x); // True if both are true
    System.out.println("x > y || y == x = ");
    System.out.println(x > y || y == x); // True if one is are true
     System.out.println("(!(x > y &&  y == x)) = ");
    System.out.println(!(x > y &&  y == x)); // Reverse the Result
    
    // Advance of Strings
     System.out.println(" --------------\n| JAVA STRINGS |\n --------------" );
    String MyText = "Alphabets";
    System.out.println("To Lower Case : " + MyText.toLowerCase());
    System.out.println("To Upper Case : " +MyText.toUpperCase());  
    System.out.println("Locate Position of 'e' in Alphabets : " +MyText.indexOf("e"));//Location of Text in String

    // To Concatention of strings + is used 
    // to goto new line

    System.out.println("GOING TO NEW LINE \nHello");
    // tab
    System.out.println("Spacing \tHello");
    //  backspace
    System.out.println("Use of Bar \bHello");

    // Java Math
   System.out.println(" --------------\n| JAVA MATH |\n --------------" );
    System.out.println("MAX (10 ,12): " +Math.max(10,12 ));
    System.out.println("MIN (9 , 19): " +Math.min(9,19));
    System.out.println("Squre Root (89): " +Math.sqrt(89));
    System.out.println("Absolute Value (88.22): " +Math.abs(88.22));

    // Java booleans or said to be condition of true or false
    System.out.println(" --------------\n| BOOLEAN |\n --------------" );
    Boolean javaIsFun = true ;
    Boolean javaIsNotFun = false;
    System.out.println("Java is Fun " +javaIsFun);
    System.out.println("Java is not Fun " +javaIsNotFun);

    // Some Examples related to integers

    int g = 5;
    int h = 3;
    System.out.println("x > y = ");
    System.out.println(g > h); // True
    System.out.println("x < y = ");
    System.out.println(g < h); // fasle
    System.out.println("x == y = ");
    System.out.println(g == h);// fasle

    // real life Example
   System.out.println(" --------------\n| EXAMPLE |\n --------------" );
    int myAge = 18, myBrosAge = 12;
    System.out.println("My Age < My Brother age = ");
    System.out.println(myAge<myBrosAge);
    System.out.println("My Age > My Brother age = ");
    System.out.println(myAge>myBrosAge);

    // use of if else to apply conditions
   System.out.println(" --------------\n| JAVA CONDITIONS |\n --------------" );
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

   System.out.println(" --------------\n| WHILE LOOP |\n --------------" );
    int q=0;
  while(q < 5){
    System.out.println(q);
    q++; 
  }
    // use of do-while loop
  System.out.println(" --------------\n| DO-WHILE LOOP |\n --------------" );
  do{
    System.out.println(q);
    q++;
  }
  while(q<5);

  System.out.println(" --------------\n| FOR LOOP |\n --------------" );
  // For loop

  for (int u=1; u<5; u++)
  {
    System.out.println(u);

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
 System.out.println(" --------------\n| Break/Continue |\n --------------" );
 
 for(int t = 1 ; t<10 ; t++)
 {
  if(t==5){
    break;
  }
 System.out.println(t); 

}

 for(int t = 1 ; t<10 ; t++)
 {
  if(t==5){
    continue;
  }
 System.out.println(t); 

}
 System.out.println("Also used in Switch statement");

}
}
}
