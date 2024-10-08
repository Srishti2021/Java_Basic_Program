import java.util.*;
public class FavouritePlaces{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String[] arr = new String[5];
for(int i=0;i<5;i++){
    arr[i] = sc.next();
}
for(int i=0;i<5;i++){
System.out.print(arr[i]+",");
}
}
}
