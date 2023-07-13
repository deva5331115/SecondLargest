import java.util.Scanner;
public class SecondLargest {


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter array size:");
            int size=scanner.nextInt();
            int array[]=new int[size];
            int max=Integer.MIN_VALUE;
            //getting array inputs
            for(int i=0;i<size;i++)
            {
                array[i]=scanner.nextInt();
                if(array[i]>max)
                {
                    max=array[i];
                }
            }
            System.out.println(findSecondLargest(array,max));
        }

        public static int findSecondLargest(int array[],int max)
        {
            int size=array.length;

            for (int i=0;i<size;i++)
            {
                for (int j=i+1;j<size;j++)
                {
                    if(array[i]>array[j])
                    {
                        int temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }

            for (int k=size-2;k>=0;k--)
            {
                if(array[k]!=max)
                {
                    return array[k];
                }
            }
            return -1;
        }
    }

