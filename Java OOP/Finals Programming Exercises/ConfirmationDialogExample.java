import javax.swing.*;

public class ConfirmationDialogExample {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to proceed?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            System.out.println("User clicked Yes");
            // Your code to proceed
        } else {
            System.out.println("User clicked No or canceled");
            // Your code to handle cancellation
        }
    }
}