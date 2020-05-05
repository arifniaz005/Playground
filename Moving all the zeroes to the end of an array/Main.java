import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      int size=in.nextInt();
      int arr[]=new int[size];
      for(int idx=0;idx<=size-1;idx++)
      {
        arr[idx]=in.nextInt();
      }
      seg(arr,size);
      {
        for(int idx=0;idx<=size-1;idx++)
        {
          System.out.print(arr[idx]+" ");
        }
      }
    }
  public static void seg(int arr[],int size)
  {
    int count=0;
    for(int idx=0;idx<=size-1;idx++)
    {
      if(arr[idx]!=0)
      {
      int temp=arr[idx];
      arr[idx]=arr[count];
      arr[count]=temp;
      count++;
    }
  }
}

    }
