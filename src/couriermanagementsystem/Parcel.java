/*
 * Group Project : Courier Management System
 * Section       : 01
 * Group Members : Ameza, Afifah, Fakhira, Hafiz, Omar
 */
package couriermanagementsystem;

public class Parcel {
    
    int parcelID;
    double weight ;
    double weightPrice ;
    int quantity ;
    double totalWeightPrice ;

    public Parcel(Destination destination){
        parcelID =1000;
    }
    public Parcel (int parcelID, double weight){
       this.parcelID =  parcelID;
       this.weight = weight;
     
    }

    public int getparcelID(){
        return parcelID;
    }
    
    public void setparcelID(int parcelID){
        this.parcelID = parcelID;
    }
    
    public double calcWeight(){
        totalWeightPrice=0;
        
        if (weight < 0.5)
            weightPrice= 4.50; 
        else if (weight < 1)
            weightPrice = 7.00;
        else if (weight <= 2)
            weightPrice = 10.00;
        else
            weightPrice = (weight-2)*5+10.00;
           
        totalWeightPrice = totalWeightPrice + weightPrice;
           
        return totalWeightPrice;
    }
}
