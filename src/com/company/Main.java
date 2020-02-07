package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        StaffApplication sa = new StaffApplication();
        // First Employee
        /*int staff1Id = 1;
        String staff1Name = "Naruto Uzumaki";
        BigDecimal staff1Wage = BigDecimal.valueOf(5000);
        String staff1Position = "Hokage";
        Staff staff1= new Staff(staff1Id, staff1Name, staff1Wage, staff1Position);
        sa.insert(staff1);*/
        // Second Employee
        /*int staff2Id = 2;
        String staff2Name = "Sasuke Uchiha";
        BigDecimal staff2Wage = BigDecimal.valueOf(10000);
        String staff2Position = "Ninja";
        Staff staff2= new Staff(staff2Id, staff2Name, staff2Wage, staff2Position);
        sa.insert(staff2);
*/
        // Third Employee
        /*int staff3Id = 3;
        String staff3Name = "Itachi Uchiha";
        BigDecimal staff3Wage = BigDecimal.valueOf(20000);
        String staff3Position = "Akatsuki";
        Staff staff3 = new Staff(staff3Id, staff3Name, staff3Wage, staff3Position);
        sa.insert(staff3);*/


        // delete
//        int staffToDelete = 1;
//        sa.delete(staffToDelete);

        // get
        /*int staffToGet = 1;
        sa.getById(staffToGet);*/

        // update name
        /*int staffToUpdateName = 2;
        String newName = "Hinata Hyuga";
        sa.updateName(staffToUpdateName, newName);
        sa.getById(staffToUpdateName);*/

        // update wage
        /*int staffToUpdateWage = 3;
        BigDecimal newWage = BigDecimal.valueOf(500000);
        sa.updateWage(staffToUpdateWage, newWage);
        sa.getById(staffToUpdateWage);*/

        // update position
        /*int staffToUpdatePosition = 2;
        String newPosition = "Konoha";
        sa.updatePosition(staffToUpdatePosition, newPosition);
        sa.getById(staffToUpdatePosition);*/

        Scanner in = new Scanner(System.in);
        int res;
        do {
            System.out.println();
            System.out.println("Enter the number to execute the operation: ");
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. GetRecordsByID");
            System.out.println("5. DisplayAllRecords");
            System.out.println("6. Exit");
            res = in.nextInt();
            if (res == 1) {
                // enter the information by user
                System.out.println("Enter the Name");
                String name = in.next();
                System.out.println("Enter the Wage");
                BigDecimal wage = BigDecimal.valueOf(in.nextInt());
                System.out.println("Enter the Position");
                String position = in.next();
                // get the last id from the staff table
                int id = sa.returnTheLastestId();
                // set the new id
                int newId = id + 1;
                // create new staff object
                Staff staff = new Staff(newId, name, wage, position);
                sa.insert(staff);
            } else if (res == 2) {
                // enter the id
                System.out.println("Enter the Staff ID: ");
                int id = in.nextInt();
                System.out.println("Which one you want to change? Name(n), Wage(w), or Position(p)? ");
                String option = in.next();
                if (option.equals("name") || option.equals("Name") || option.equals("n") || option.equals("NAME")) {
                    System.out.println("Enter the New Name: ");
                    String newName = in.next();
                    sa.updateName(id, newName);
                } else if (option.equals("wage") || option.equals("Wage") || option.equals("w") || option.equals("WAGE")) {
                    System.out.println("Enter the New Wage: ");
                    BigDecimal newWage = BigDecimal.valueOf(in.nextInt());
                    sa.updateWage(id, newWage);
                } else if (option.equals("position") || option.equals("Position") || option.equals("p") || option.equals("POSITION")) {
                    System.out.println("Enter the New Position: ");
                    String newPosition = in.next();
                    sa.updatePosition(id, newPosition);
                }
            } else if (res == 3) {
                System.out.println("Enter the Staff ID: ");
                int id = in.nextInt();
                sa.delete(id);
            } else if (res == 4) {
                System.out.println("Enter the Staff ID: ");
                int id = in.nextInt();
                sa.getById(id);
            } else if (res == 5) {
                sa.findAll();
            } else if (res == 6) {
                sa.exit();
            }
        } while (res <= 6 && res >= 1);

    }
}
