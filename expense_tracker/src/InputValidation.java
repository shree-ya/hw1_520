
public class InputValidation {
    public static boolean isAmountValid(double amount) {
        // Amount should be greater than 0 and less than 1000
        return amount > 0 && amount < 1000 ;
    }

    public static boolean isCategoryValid(String category) {
        // List of valid categories
        String[] validCategories = {"food", "travel", "bills", "entertainment", "other"};
        
        // Check if the category is in the list of valid categories (case insensitive)
        for (String validCategory : validCategories) {
            if (validCategory.equalsIgnoreCase(category)) {
                return true;
            }
        }
        return false;
    }
}
