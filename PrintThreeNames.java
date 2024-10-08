import java.util.*;
public class PrintThreeNames{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n   = 3;
String[] arr = new String[n];
for(int i=0;i<n;i++){
arr[i] = sc.next();
}

//AMan , akbar, auhthony
//fli, auththony, akbar and aman


String[] arr2 = new String[n+2];
arr2[0] =  "fli";
arr2[3] = "and";
for(int i=1;i<=2;i++){
arr2[i] =  arr[arr.length-i];
}

arr2[arr2.length-1] = arr[0];


for(int i=0;i<arr2.length;i++){
System.out.print(arr2[i]+" ");
}
}
}
