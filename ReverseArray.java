//create an  array by taking user input. print the array in reverse order. find the average of  even numbers
import java.util.*;
public class ReverseArray{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
int[] arr2 = new int[n];
for(int i=0;i<n;i++){
arr[i] = sc.nextInt();
}

for(int i=0;i<n;i++){
arr2[i] = arr[n-i-1];
}

for(int i=0;i<n;i++){
System.out.print(arr2[i]+" ");
}

int count =0;
int sum = 0;
for(int i=0;i<n;i++){
//int count =0;
//int sum =0;
if(arr[i] % 2==0){
count++;
sum = sum+arr[i];
}
}
float avg = sum/count;
System.out.println("Average"+ avg);

}
}
