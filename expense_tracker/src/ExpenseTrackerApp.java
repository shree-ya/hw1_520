import javax.swing.table.DefaultTableModel;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

  public static void main(String[] args) {
    
    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");
    

    
    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(e -> {
      
      // Get transaction data from view
      double amount = view.getAmountField(); 
      String category = view.getCategoryField();
      boolean isAmountValid = InputValidation.isAmountValid(amount);
      boolean isCategoryValid = InputValidation.isCategoryValid(category);
      if (isAmountValid && isCategoryValid) {

      // Create transaction object
      Transaction t = new Transaction(amount, category);

      // Call controller to add transaction
      view.addTransaction(t);
      } else {
          // Handle invalid input data (e.g., show an error message)
          // You can implement this part based on your application's requirements.
          // For example, display an error message to the user.
          System.out.println("Invalid input data.");
      }
    });

  }

}