
package App1;
/**
 *
 * @author Admin
 */

public class App11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int dem=0;
		for(int i=0;i<=20;i++)
			{
			for(int j=0;j<=10;j++)
			{
				for(int k=0;k<=4;k++)
					if(i*10 + j*20 + k*50==200)
					{	System.out.println(i+" to10k   "+ j +" to20k   "+k+"  to50k" );
						dem++;
					}
			}
			}
		System.out.println("co "+dem+" phuong an");  
    }
}
