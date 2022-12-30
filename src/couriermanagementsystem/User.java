/*
 * Group Project : Courier Management System
 * Section       : 01
 * Group Members : Ameza, Afifah, Fakhira, Hafiz, Omar
 */
package couriermanagementsystem;

abstract public class User{

    protected String []userName = new String [5];
    protected String []usercontactNo = new String [5];
    protected String []userAddress = new String [5];
    
    public User()
    {
        userName[0] = "Ahmad";
        usercontactNo[0] = "0129095000";
        userAddress[0] = "LorongTeratai";
    }

    public User (String []userName, String []usercontactNo, String []userAddress)
    {
        this.userName = userName;
        this.usercontactNo = usercontactNo;
        this.userAddress  = userAddress;
    }

    protected String []getuserName()
    {
        return userName;
    }

    protected void setuserName(String []userName)
    {
        this.userName = userName;
    }

    protected String []getusercontactNo()
    {
        return usercontactNo;
    }

    protected void setusercontactNo(String []usercontactNo)
    {
        this.usercontactNo = usercontactNo;
    }

    protected String []getuserAddress()
    {
        return userAddress;
    }

    protected void setuserAddress(String []userAddress)
    {
        this.userAddress = userAddress;
    }

    void getRecord() {
        System.out.println(this.userName);
        
    }

    void getPrint() {
        System.out.println(this.userName);
    }

}   
