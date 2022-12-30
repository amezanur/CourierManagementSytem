/*
 * Group Project : Courier Management System
 * Section       : 01
 * Group Members : Ameza, Afifah, Fakhira, Hafiz, Omar
 */
package couriermanagementsystem;

public class Destination implements destinationPrint {
    int quantity ;
    int destinationID ;
    private double destinationPrice ;
    double totalDestination ;

    public Destination(){
        destinationID = 1; 
    }
    
    public Destination(int destinationID) {
        this.destinationID = destinationID;
    }
    
    public int getDestinationID() {
        return destinationID;
    }
    
    public void setDestinationID(int destinationID) {
        this.destinationID = destinationID;
    }
    
    public double calcDestination(int destinationID) {
        
        totalDestination=0;
        
        if(destinationID == 1)
        {
            destinationPrice = 3.00;
        }
        else
        {
            destinationPrice = 8.50;
        }
        
        totalDestination = totalDestination + destinationPrice;

        return totalDestination;
    }

    /**
     *
     * @param destinationID
     */
    @Override
     public void getDestinationName(int destinationID){
         if(destinationID == 1){
             System.out.println("Destination: Semenanjung");
         }
         else {
             System.out.println("Destination: Sabah/ Sarawak");
         }
     }
}


