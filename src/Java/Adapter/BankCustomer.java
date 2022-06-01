package Java.Adapter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Adapter class = Adapter
 */
public class BankCustomer extends BankDetails implements CreditCard{


    @Override
    public void giveBankDetails() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name:");
            String accHolderName = bufferedReader.readLine();
            System.out.println("\n");

            System.out.println("Enter the account number:");
            long accNumber = Long.parseLong(bufferedReader.readLine());
            System.out.println("\n");

            System.out.println("Enter the bank name:");
            String bankName = bufferedReader.readLine();

            setAccHolderName(accHolderName);
            setAccNumber(accNumber);
            setBankName(bankName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNumber = getAccNumber();
        String accHolderName = getAccHolderName();
        String bankName = getBankName();

        return("The Account number: "+accNumber+" of "
                +accHolderName+" in "+bankName+
                " bank is valid and authenticated for issuing the credit card. ");
    }



    public static void main(String args[]){
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }






}
