import java.util.*;//Scanner class 
public class FCFS
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("================================================================");
		System.out.print("Enter the number of processes: ");
		int n=sc.nextInt();//No. of processes
		System.out.print("-----------------------------------------------------------------");
		System.out.println();
		int cbt[]=new int[n],wt[]=new int[n];//for containing the list of cpu bus time
		float sum=0;
		sum=sum+wt[0];
		for(int i=0;i<n;i++)//DATA ENTRY and WT calculation
		{
		    System.out.print("Enter the CBT of  P"+(i+1)+": ");
		    cbt[i]=sc.nextInt();//CBT at positions
            if(i!=0)
            {
                wt[i]=wt[i-1]+cbt[i-1];sum+=wt[i];
            }
		}
		System.out.print("-------------------------------------------------------------------");
		System.out.println();
        System.out.println("WT for last process: "+wt[n-1]+" ms.\nSum of WT: "+sum);
		float avg=sum/n;//Average WT
		System.out.println("Average waiting time of the processes is "+ String.format("%.3f", avg)+" ms.");
		System.out.print("===================================================================");
        sc.close();
    }
}