//\r,\n,\t
//java.time.LocalTime
//java.time.Format.DateTimeFormat
//pre and post increment
//infinite for lopp
//local, instance, static
//final variables
//pass by value and pass by ref


























//public class PreAndPost{
//public static void main(String[] args){
//int a =1;
//a++ = a=a+1;
//System.out.println(a++);

//++a
//System.out.println(++a);

//System.out.println(a++);
//System.out.println(a);

//int a;

//for(a=1;a<5;a++){
//}

//System.out.println(a);


//int a;
//int b=0;
//for(a=1;a<5;a++){  //try for ++a and a++
//b=b+a;
//System.out.println(b);
//}

//System.out.println(b);


//control + c  to come out
//for( ; ;){
//System.out.println("Printing");
//}




//for(int i=0; ; i++){
//System.out.println("Printing");
//}

//for(int i=0;i<=2;){
//System.out.println("Printng");
//}

//Demo demo = new Demo();
//System.out.println(demo.name);
//}
//}




//class Demo{
//public static String name ="Srishti";

//}






//pass by value
/*public class PreAndPost{
public static void main(String[] args){
Demo.printing("Srishti");
}
}

class Demo{
public static void printing(String name){
System.out.println(name);
}
}*/














//pass by reference
public class PreAndPost{
public static void main(String[] args){
Demo demo = new Demo("Srishti");
Demo.printing(demo);
}
}



class Demo{
private String name;
public Demo(String name){
this.name = name;
}
public static void printing(Demo demo){
System.out.println(demo.name);
}
}

