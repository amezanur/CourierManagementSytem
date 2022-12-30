/*
 * Group Project : Courier Management System
 * Section       : 01
 * Group Members : Ameza, Afifah, Fakhira, Hafiz, Omar
 */
package couriermanagementsystem;

import java.util.Scanner;

public class Staff extends User {
    
    Scanner input = new Scanner(System.in);
    
    String []staffID = new String [5];
    String []staffName = new String [5];
    String []staffContactNo = new String [5];
    String []staffAdd = new String [5];
    int people;
    int staffNum;

    public Staff(){
        staffID[0] = "S1001" ;
        staffName[0] = "Amir";
        staffContactNo[0] = "01125615352";
        staffAdd[0] = "Jalan Ahmad";
    }
    
    public Staff(String []staffID, String []userName, String []usercontactNo, String []userAddress) {
        super(userName, usercontactNo, userAddress);
        this.staffID = staffID;
        this.userName = staffName;
        this.usercontactNo = staffContactNo;
        this.userAddress = staffAdd;
 
    }
    
    public int getstaffNum()
    {
        return staffNum;
    }
    public void setstaffNum(int staffNum)
    {
        this.staffNum = staffNum;
    }
    
    public String []getstaffID()
    {
        return staffID;
    }
    public void setstaffID(String []staffID)
    {
        this.staffID = staffID;
    }
    
    @Override
    public String []getuserName()
    {
        return staffID;
    }
    public void setstaffName(String []staffName)
    {
        this.staffName = staffName;
    }
    
    @Override
    public String []getusercontactNo()
    {
        return staffContactNo;
    }
    public void setstaffContactNo(String []staffContactNo)
    {
        this.staffContactNo= staffContactNo;
    }
    
    @Override
    public String []getuserAddress()
    {
        return staffAdd;
    }
    public void setstaffAdd(String []staffAdd)
    {
        this.staffAdd = staffAdd;
    }
    
    @Override
    void getRecord(){
        
        System.out.print("\nEnter Number of Staff: ");
        staffNum = input.nextInt();
        for(int i=0; i< staffNum; i++)
        {
            System.out.print("\nEnter Details of staff  " +(i+1)+ ":");
            System.out.print("\nEnter Staff ID: ");
            this.staffID[i] = input.next();
            System.out.print("Enter Name: ");
            this.staffName[i] = input.next();
            System.out.print("Enter Address: ");
            this.staffAdd[i] = input.next();
            System.out.print("Enter Contact Number: ");
            this.staffContactNo[i] = input.next();
            }
    }
    
    @Override
    void getPrint(){
        for(int i=0; i<staffNum; i++)
        {
        System.out.println("\n\n\t   Updated details for "+this.staffID[i]+"  ");
            System.out.println("\t...........................");
            System.out.println("\nStaff ID: "+this.staffID[i]);
            System.out.println("Staff Name: "+this.staffName[i]);
            System.out.println("Staff Address: "+this.staffAdd[i]);
            System.out.println("Staff Contact Number: "+this.staffContactNo[i]);
            }
    }
    
}
