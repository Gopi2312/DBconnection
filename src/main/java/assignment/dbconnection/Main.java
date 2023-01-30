package assignment.dbconnection;
import java.util.*;
public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DataBase URL: ");
        String database = sc.nextLine();
        System.out.println("Enter UserName: ");
        String username = sc.nextLine();
        System.out.println("Enter Password: ");
        String password = sc.nextLine();
        DBConnection db = DBConnection.getInstance(database,username,password);

        boolean b = true;
        
        while(b==true)
        {
        	System.out.println("1.connection 2.close 3.exit");
            System.out.println("Enter Choice");
            int n = sc.nextInt();
        	switch(n)
        	{
        		case 1:
        		{
        			db.connection();
        			break;
        		}
        		case 2:
        		{
        			db.close();
        			break;
        		}
        		case 3:
        		{
        			System.exit(0);
        			b=false;
        			break;
        		}
        		default:
        		{
        			System.out.println("Invalid");
        			break;
        		}
        		
        	}
        }
        
    }
}
