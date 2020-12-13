package consoleAndMenu;

import dao.StaffDAO;
import dao.UserDAO;
import dto.Staff;

import java.util.ArrayList;
import java.util.List;

public class Menu {
Console console = new Console();
StaffDAO staffDAO= new StaffDAO();
UserDAO userDAO= new UserDAO();
String user;
String password;
Boolean flagToContinue=true;
   public void displayMenu()
   {
       System.out.println("\n**** Welcome to School Management system ****");
       user= console.getStringInput("Enter your user name :");
       password= console.getStringInput("Enter your password :");
       Boolean flag = userDAO.checkUserPassword(user,password);
       if(flag) {
           getChoice();
       }
       else {
           System.out.println("User does not have access to the system , re-try");
            displayMenu();
       }


   }

    private void getChoice() {
        System.out.println("\n**** MENU ****");
        System.out.println("1.Display Staff");
        System.out.println("2.Display Students");
        System.out.println("3.Exit");
        int choice = console.getIntegerInput("Please enter your choice:");
        decideonChoice(choice);
    }

    private void decideonChoice(int choice) {
       // while (flagToContinue) {
            switch (choice) {
                case 1:
                    List<Staff> staffMembers = new ArrayList<Staff>();

                    System.out.println("************* Display all Staff Members *****************");

                    staffMembers = staffDAO.findAllStaff();
                    for (int i = 0; i < staffMembers.size(); i++) {
                        System.out.printf("\nId:%5d | First Name:%-15s | Last Name:%-15s | Email:%-40s | Gender:%-10s | DOB:%td/%tm/%ty | Salary:%8.2f | Contact Number : %-15s | ", staffMembers.get(i).getStaffId(), staffMembers.get(i).getFirstName(), staffMembers.get(i).getLastName(), staffMembers.get(i).getEmail(), staffMembers.get(i).getGender(), staffMembers.get(i).getDOB(), staffMembers.get(i).getDOB(), staffMembers.get(i).getDOB(), staffMembers.get(i).getSalary(), staffMembers.get(i).getContactNumber());
                        //  System.out.println(staffMembers.get(i).toString());
                    }
                    getChoice();
                    break;
                case 2: //call for Students
                    getChoice();
                    break;

                case 3:
                  //  flagToContinue = false;
                    System.out.print("Quiting the system, Program Ending");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice...Enter again");
                    getChoice();
                    break;

            }
        }
   // }

}
