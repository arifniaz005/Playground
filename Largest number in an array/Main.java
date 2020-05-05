import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int arrs=in.nextInt();
      int arr[]=new int[arrs];
      for(int idx=0;idx<=arrs-1;idx++)
      {
        arr[idx]=in.nextInt();
      }
      int maxno;
      if(arr[0]>arr[1])
      {
        maxno=arr[0];
      }
      else
      {
        maxno=arr[1];
      }
      for(int idx=0;idx<=arrs-1;idx++)
      {
        if(maxno<arr[idx])
        {
          maxno=arr[idx];
        }
      }
      System.out.println(maxno);
    }
}