public class TableItem {
    String item;
    String Description;
    String DueDate;
    boolean complete=false;

    //declare an array of items

    public String getItem(){
        // In here the user will need to put the name of the item that it's going to be in the todo-list
        // Max of 256 items
        //minimum of three characters
        //Scan for the String input by the user
        // Add the item to the array
        return item;
    }

    public void addItem(){
        // User prompts for a new name, new description, and new due date
        // Creates a new instance of the list
        // add to the list's list
    }


    public void removeItem(){
        // User deletes the item's whole row
        // return the string of the name of the to do list the user is on
        // remove the string from the list (list.remove)
    }

    public String getDescription(){
        // Here the user will need to put the description of the item
        return Description;
        // Scan for the string input by the user
        // added to the list
    }

    public void editDescription(){
        // User selects from the edit's dropdown menu "Description"
        // The description box's turns to editable and the user inputs the new description
        // Once the user hits any other space of the to do list, closes the app or even click on enter it saves automatically
        // encounters the string and replaces it
        // updates the list
    }


    public String getDueDate(){
        // here the user will inout the due date of the item
        // format 'YYYY-MM-DD'
        return DueDate;
        // encounters the date that is going to be replaced
        // switch the old date with the new one
        // update the list
    }

    public void editDueDate(){
        // User selects from the edit's dropdown menu "Due Date"
        // The description box's turns to editable and the user inputs the new description
        // Once the user hits any other space of the to do list, closes the app or even click on enter it saves automatically
        // encounters the string and replaces it
        // updates the list
    }

    public void completion(){
        // When the item is done the user checks on the checkbox as complete
        // Default is incomplete
        // Scan for the integer, either true or false
    }


}
