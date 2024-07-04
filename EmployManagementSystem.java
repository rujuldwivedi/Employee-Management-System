import java.util.Scanner;
import java.io.IOException;

public class EmployManagementSystem
{
    public static void main(String[] args)
    {
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        Employee_Show epv = new Employee_Show();
        int i = 0;
        MainMenu obj1 = new MainMenu();
        obj1.menu();
        while(i < 6)
        {
            System.out.print("\nPlease Enter choice :");
            i = Integer.parseInt(sc.nextLine());
            switch (i)
            {
                case 1:
                {
                    Employee_Add ep = new Employee_Add();
                    ep.createFile();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 2:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s = sc.nextLine();
                    try
                    {
                        epv.viewFile(s);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 3:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s = sc.nextLine();
                    Employee_Remove epr = new Employee_Remove();
                    epr.removeFile(s);
                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    obj1.menu();
                    break;
                }
                case 4:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String I = sc.nextLine();
                    try
                    {
                        epv.viewFile(I);
                    }
                    catch (Exception e)
                    {
                        System.out.println(e);
                    }
                    Employee_Update epu = new Employee_Update();
                    System.out.print("Please Enter the detail you want to Update :");
                    System.out.print("\nFor Example :\n");
                    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
                    String s = sc.nextLine();
                    System.out.print("Please Enter the Updated Info :");
                    String n = sc.nextLine();
                    try
                    {
                        epu.updateFile(I, s, n);
                        System.out.print("\nPress Enter to Continue...");
                        sc.nextLine();
                        System.out.print("\033[H\033[2J");
                        obj1.menu();
                        break;
                    }
                    catch (IOException e)
                    {
                        System.out.println(e);
                    }
                }
                case 5:
                {
                    CodeExit obj = new CodeExit();
                    obj.out();
                }
            }
        }
        sc.close();
    }
}