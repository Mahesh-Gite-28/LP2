import java.util.*;

class Job {

    char id;
    int deadline;
    int profit;

    Job(char id, int deadline, int profit) {

        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobScheduling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Job> jobs = new ArrayList<>();

        // Number of jobs
        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        // Input jobs
        for(int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Job " + (i + 1));

            System.out.print("Enter Job ID: ");
            char id = sc.next().charAt(0);

            System.out.print("Enter Deadline: ");
            int deadline = sc.nextInt();

            System.out.print("Enter Profit: ");
            int profit = sc.nextInt();

            jobs.add(new Job(id, deadline, profit));
        }

        // Sort jobs by profit in descending order
        Collections.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find maximum deadline
        int maxDeadline = 0;

        for(Job j : jobs) {

            maxDeadline = Math.max(maxDeadline, j.deadline);
        }

        // Create slots
        char result[] = new char[maxDeadline];
        boolean slot[] = new boolean[maxDeadline];

        int totalProfit = 0;

        // Job Scheduling Logic
        for(Job j : jobs) {

            for(int k = j.deadline - 1; k >= 0; k--) {

                if(slot[k] == false) {

                    slot[k] = true;
                    result[k] = j.id;

                    totalProfit += j.profit;

                    break;
                }
            }
        }

        // Output
        System.out.println("\nSelected Jobs:");

        for(int i = 0; i < maxDeadline; i++) {

            if(slot[i]) {

                System.out.print(result[i] + " ");
            }
        }

        System.out.println("\nTotal Profit: " + totalProfit);

        sc.close();
    }
}




/*
| Complexity | Value    |
| ---------- | -------- |
| TC         | (O(n^2)) |
| SC         | (O(n))   |

*\