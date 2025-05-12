import java.util.Scanner;//input from an array 

public class arrayinput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter arr valuess");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=1;j<arr.length;j++){
            System.out.print(arr[j]);
        
        }
        int sum=0;
        
    }
    
}
