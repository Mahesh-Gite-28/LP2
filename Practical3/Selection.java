import java.util.*;

public class Selection
{
    // Selection Sort Function
    public static void Selection(int arr[])
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int minidx = i;

            // Find Minimum Element
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[minidx])
                {
                    minidx = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // User Input for Size
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // User Input for Elements
        System.out.println("Enter Array Elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Calling Selection Sort
        Selection(arr);

        // Printing Sorted Array
        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}




/*
| Complexity | Value    |
| ---------- | -------- |
| Best TC    | (O(n^2)) |
| Average TC | (O(n^2)) |
| Worst TC   | (O(n^2)) |
| SC         | (O(1))   |

*\