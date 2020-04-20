package homework5;

import javax.swing.JOptionPane;


    public class CompanySales {
        public static void main(String[] args) {
            
                     
            int    data,ID,HourlyRate,Hoursworked;
            int i;
            for (i = 0; i < 4; i++) {
                          
                    String dataString = JOptionPane.showInputDialog("Enter Account #:");
                    data = Integer.parseInt(dataString);             
                    
                    String dataStringID = JOptionPane.showInputDialog("Enter ID:");
                    ID = Integer.parseInt(dataStringID);
                    
                    String dataStringRate = JOptionPane.showInputDialog("Enter Hourly Rate:");
                    HourlyRate = Integer.parseInt(dataStringRate);
                    
                    String dataStringHours = JOptionPane.showInputDialog("Enter Hours:");
                    Hoursworked = Integer.parseInt(dataStringHours);
                    
                    
                    
                    String input = JOptionPane.showInputDialog (null, "Service or Supplies?");
                    Account[] accounts = new Account[4];

                    if(input.equals("Service")) {
                        accounts[i] = new Supplies(ID,HourlyRate,Hoursworked);
                        } else if (input.equals("Supplies")) {
                        accounts[i] = new Services(ID,HourlyRate,Hoursworked);
                        } else{
                    JOptionPane.showInputDialog("NOT A PROPER VALUE");}
                
                                    JOptionPane.showInputDialog(accounts[i]);}

    }
}

.
