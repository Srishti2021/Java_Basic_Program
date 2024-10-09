//find common elements among two arrays
import java.util.*;
public class CommonElements{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int[] arr1 = new int[n1];
int[] arr2 = new int[n2];
for(int i=0;i<n1;i++){
arr1[i] = sc.nextInt();
}

for(int i=0;i<n2;i++){
arr2[i] = sc.nextInt();
}

HashSet<Integer> set = new HashSet<>();
//add elements if the first array to the set
for(int i=0;i<arr1.length;i++){
set.add(arr1[i]);
}

for(int i=0;i<arr2.length;i++){
if(set.contains(arr2[i])){
System.out.print(arr2[i]+" ");
}
}
}
}
