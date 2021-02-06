import javax.swing.JOptionPane;

public class ATM {

    public ATM(){

        int savingsAccountBalance = 1000;
        int checkingAccountBalance = 2000;

        String mainMenu = JOptionPane.showInputDialog(null, "Welcome to your Bank Account\n\nPress:\n0: Exit\n1: Checking Account   $" + checkingAccountBalance + "\n2: Savings Account      $" + savingsAccountBalance);

        if(mainMenu.equals("0")){
            System.exit(0);
        }

        else if(mainMenu.equals("1")){
            
            checkingAccount(checkingAccountBalance, savingsAccountBalance);
        }

        else if(mainMenu.equals("2")){
            savingsAccount(checkingAccountBalance, savingsAccountBalance);
            
        }
    }



    public void checkingAccount(int checkingAccountBalance, int savingsAccountBalance){
        String subMenuChecking = JOptionPane.showInputDialog(null, "Checking Account\n\n0: Exit\n1: View Account Balance\n2: Transfer money to your Savings Account\n3: Deposit money into Checking Account");


        if(subMenuChecking.equals("0")){
            System.exit(0);
        }

        else if(subMenuChecking.equals("1")){
            JOptionPane.showMessageDialog(null, "Current Balance: " + checkingAccountBalance);
        }

        else if(subMenuChecking.equals("2")){
            String transferMoneyInput = JOptionPane.showInputDialog(null, "How much money would you like to transfer to your Savings Account?");
            savingsAccountBalance = savingsAccountBalance + Integer.parseInt(transferMoneyInput);
            checkingAccountBalance = checkingAccountBalance - Integer.parseInt(transferMoneyInput);

            JOptionPane.showMessageDialog(null, "Savings Account Balance: $" + savingsAccountBalance + "\nChecking Account Balance: $" + checkingAccountBalance);
        }

        else if(subMenuChecking.equals("3")){
            String depositMoneyInput = JOptionPane.showInputDialog(null, "How much money would you like to deposit into your Checking Account?");
            checkingAccountBalance = checkingAccountBalance + Integer.parseInt(depositMoneyInput);

            JOptionPane.showMessageDialog(null, "Checking Account Balance: " + checkingAccountBalance);
        }
    }



    public void savingsAccount(int checkingAccountBalance, int savingsAccountBalance){
        String subMenuChecking = JOptionPane.showInputDialog(null, "Checking Account\n\n0: Exit\n1: View Account Balance\n2: Transfer money to your Savings Account\n3: Deposit money into Checking Account");
        
        if(subMenuChecking.equals("0")){
            System.exit(0);
        }

        else if(subMenuChecking.equals("1")){
            JOptionPane.showMessageDialog(null, "Current Balance: " + savingsAccountBalance);
        }

        else if(subMenuChecking.equals("2")){
            String transferMoneyInput = JOptionPane.showInputDialog(null, "How much money would you like to transfer to your Checking Account?");
            savingsAccountBalance = savingsAccountBalance - Integer.parseInt(transferMoneyInput);
            checkingAccountBalance = checkingAccountBalance + Integer.parseInt(transferMoneyInput);

            JOptionPane.showMessageDialog(null,  "Checking Account Balance: $" + checkingAccountBalance + "\nSavings Account Balance: $" + savingsAccountBalance);
        }

        else if(subMenuChecking.equals("3")){
            String depositMoneyInput = JOptionPane.showInputDialog(null, "How much money would you like to deposit into your Savings Account?");
            savingsAccountBalance = savingsAccountBalance + Integer.parseInt(depositMoneyInput);

            JOptionPane.showMessageDialog(null, "Savings Account Balance: " + savingsAccountBalance);
        }

    }
}
