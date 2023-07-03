import java.util.*;
class sumofarrayele
{
    public static void main(String[] args)
    {
        int n,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            temp=temp+arr[i];
        }
        System.out.println(temp);
    }
    
}