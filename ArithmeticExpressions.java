import java.util.*;
public class ArithmeticExpressions{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
int s1 = a+b+c;
int s2 = a*b*c;
int s3 =c+(a/b);
int s4 =(a%b)+c;
System.out.println("a+b+c"+" "+s1);
System.out.println("a*b*c"+" "+ s2);
System.out.println("c+a/b"+" "+s3);
System.out.println("a%b+c"+" "+s4);
}
}
