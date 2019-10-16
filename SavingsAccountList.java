import javax.swing.*;
import java.util.ArrayList;
        public class SavingsAccountList {


            public static void main(String[] args) {

                ArrayList<SavingsAccount> accounts = new ArrayList<>();
                double balance;
                int tax, accNum;
                String name, address;
                boolean checkBook;

                int size = Integer.parseInt(JOptionPane.showInputDialog("Enter number of Savings Accounts you wish to enter"));

                for (int i = 0; i < size; i++) {
                    name = JOptionPane.showInputDialog("Enter Account Holder Name");
                    address = JOptionPane.showInputDialog("Enter Account Holder Address");
                    accNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
                    balance = Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
                    tax = Integer.parseInt(JOptionPane.showInputDialog("Enter tax rate"));

                    SavingsAccount savingsAccount = new SavingsAccount(new Person(name), accNum, balance, tax);

                    accounts.add(savingsAccount);

                    while (JOptionPane.showConfirmDialog(
                            null, "Are you finished?") == JOptionPane.NO_OPTION) {

                        JOptionPane.showInputDialog("Enter Account Holder Name");
                       JOptionPane.showInputDialog("Enter Account Holder Address");
                         Integer.parseInt(JOptionPane.showInputDialog("Enter Account Number"));
                       Double.parseDouble(JOptionPane.showInputDialog("Enter balance"));
                       Integer.parseInt(JOptionPane.showInputDialog("Enter tax rate"));
                        SavingsAccount savingsAccount2 = new SavingsAccount(new Person(name), accNum, balance, tax);


                        accounts.add(savingsAccount);

                    }

                    JTextArea jta = new JTextArea("Bank Accounts\n\n");

                    for (SavingsAccount bkacc : accounts) {
                        jta.append(bkacc.toString());
                    }

                    JOptionPane.showMessageDialog(null, jta);

                }

            }
        }
