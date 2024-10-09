//WAp which take 2 integers values i.e. month and day . print true if 12 feb- 11 aug else return false
import java.util.*;
public class SpringSeason{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int d = sc.nextInt();
if(m>=1 &&  m<=12 && d>=1 && d<=31){
if(2<=m && m<=4){
if(m==2){
if(d<12){
System.out.println("False");
}
else{
System.out.println("True");
}
}
if(m==4){
if(d>11){
System.out.println("False");
}
else{
System.out.println("True");
}

}
else{
System.out.println("True");
}
}
else{
System.out.println("False");
}
}
else{
System.out.println("Not valid");
}
}
}
