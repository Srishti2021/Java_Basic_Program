//write a program to compare  lengths of two lines
//print the mid point of largest line among the two


import java.util.*;
public class CompareLengths{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int l1 = sc.nextInt();
int l2 = sc.nextInt();

if(l1>l2){
System.out.println(l1/2);
}
else{
System.out.println(l2/2);
}
}
}
