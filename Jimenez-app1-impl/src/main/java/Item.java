
import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Serializable {
    String Item;
    private String Description;
    private LocalDate DueDate;
    boolean complete;

    public Item(String item, String description, LocalDate dueDate, boolean complete) {
        this.Item= item;
        this.Description = description;
        this.DueDate = dueDate;
        this.complete = false;
    }

    public Item() {

    }

    public String getItem() {
        return Item;
    }

    public void setItem(String item) {
        Item = item;
    }

    //Due Date ----
    public LocalDate getDueDate() {
        return DueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.DueDate = dueDate;
    }

    public LocalDate editDueDate(LocalDate newDueDate){
        DueDate = newDueDate;
        return DueDate;
    }

    //CheckBox ----
    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    //Description----
    public String getDescription() {

        return Description;
    }

    public void setDescription(String Description) {

        this.Description = Description;
    }

    public String editDescription(String newDescription){
        this.Description= newDescription;
        return Description;
    }

    @Override
    public String toString() {
        if(isComplete()){
            return Description + "\n" + DueDate + "\n" + "Complete";
        }else{
            return Description + "\n" +DueDate + "\n" + "Incomplete";
        }
    }

}

