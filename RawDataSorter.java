import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
class RawDataSorter
{
    //Implementing the Recursive Insertion Sorting algorithm
    public static void InsertionSort(int[] array, int len)
    {
        if(len <= 1)
           return;
        else
        {
            InsertionSort(array,len-1);

            int latestVal = array[len - 1];
            int cnt = len-2;

            while (cnt >= 0 && array[cnt] > latestVal)
            {
                array[cnt+1] = array[cnt];
                cnt--;
            }
            array[cnt+1] = latestVal;

        } 
    }
    //Giving context to user
    public static void display()
    {
        System.out.println("###################################");
        System.out.println("    WELCOME TO RAW DATA SORTER     ");
        System.out.println("###################################");
    }
    public static void main(String[] args) throws IOException
    {
        //Invoking display()
        display();
        //Creating IOStream obj to take input
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(">> How many datas do you have : ?");
        try{
            //try catch to avoid encountering errors
            int dataCount = Integer.parseInt(read.readLine());
            //Data count should be more than 0
            if(dataCount <= 0)
                System.out.println(">> Invalid number of data");
            else{
                //Stroing values in array
                int[] numArray = new int[dataCount];
                for(int i=0; i < dataCount; i++)
                {
                    System.out.println(">> Enter value at index " + i);
                    numArray[i] = Integer.parseInt(read.readLine());
                }
                System.out.println(">> Raw data collected array : ");
                System.out.println(Arrays.toString(numArray));
                //Sorting it. Using call by reference as advantage
                InsertionSort(numArray, dataCount);
                //Printing array
                System.out.println(">> Sorted array is : ");
                System.out.println(Arrays.toString(numArray));
            }
        }catch(Exception e){
            System.out.println(">> Invalid number of data");
        }
        

    }
}