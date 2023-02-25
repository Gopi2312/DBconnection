package assignment.dbconnection;
import java.util.*;
import java.util.logging.*;
public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger("hi");
        log.info("Enter DataBase URL: ");
        String database = sc.nextLine();
        log.info("Enter UserName: ");
        String username = sc.nextLine();
        log.info("Enter Password: ");
        String password = sc.nextLine();
        DBConnection db = DBConnection.getInstance(database,username,password);

        boolean b;
        
        while(b)
        {
        	log.info("1.connection 2.close 3.exit");
            log.info("Enter Choice");
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
        			break;
        		}
        		default:
        		{
        			log.info("Invalid");
        			break;
        		}
        		
        	}
        }
        
    }
}
