/*
 * Group Project : Courier Management System
 * Section       : 01
 * Group Members : Ameza, Afifah, Fakhira, Hafiz, Omar
 */
package couriermanagementsystem;

import java.util.Scanner;

public class Customer extends User {
    
     Scanner input = new Scanner(System.in);
     String []customerID = new String [5];
     String []customerName = new String [5];
     String []customercontactNo = new String [5];
     String []customerAddress = new String [5];
     private Parcel parcel;
     int numofCust;
    
    
    public Customer(){
        customerID[0] = "C1001";
    }
    public Customer(String []customerID,String []userName, String []usercontactNo, String []userAddress) {
        super(userName, usercontactNo, userAddress);
        this.customerID = customerID;
        this.userName = customerName;
        this.usercontactNo = customercontactNo;
        this.userAddress = customerAddress;
    }
    
    public String []getcustID()
    {
        return customerID;
    }
    public void setcustID(String []customerID)
    {
        this.customerID = customerID;
    }
    
    @Override
    public String []getuserName()
    {
        return customerName;
    }
    public void setName(String []customerName)
    {
        this.customerName = customerName;
    }
    
    @Override
    public String []getusercontactNo()
    {
        return customercontactNo;
    }
    public void setcustcontNo(String []customercontactNo)
    {
        this.customercontactNo = customercontactNo;
    }
    
    @Override
    public String []getuserAddress()
    {
        return customerAddress;
    }
    public void setcustAdd(String []customerAddress)
    {
        this.customerAddress = customerAddress;
    }
    public Parcel getparcel(){
        return parcel;
    }
    public void setparcel(Parcel parcel){
        this.parcel=parcel;
    }
    int j=0;
     @Override
    void getRecord(){
        
        
        System.out.print("\n|-------------------------------------------------|");
            System.out.println("\n|  Kindly Enter Your Details // cutomer: "+(j+1)+"        |");
            System.out.println("|-------------------------------------------------|");
            
            System.out.print("\nEnter Customer ID: ");
            this.customerID[j] = input.next();
            System.out.print("Enter Name: ");
            this.customerName[j] = input.next();
            System.out.print("Enter Address: ");
            this.customerAddress[j] = input.next();
            System.out.print("Enter Contact Number: ");
            this.customercontactNo[j] = input.next();
            j++;
            
    }
    int x=0;
     @Override
    void getPrint(){
        
            System.out.println("\n\n\t   Customer " + (x+1) + "Details");
            System.out.println("\t......................");
            System.out.println("Customer ID: "+this.customerID[x]);
            System.out.println("Name: "+this.customerName[x]);
            System.out.println("Address: "+this.customerAddress[x]);
            System.out.println("Contact Number: "+this.customercontactNo[x]);
        
            x++;
        }
    }


