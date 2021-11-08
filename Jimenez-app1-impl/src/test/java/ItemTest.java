import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    String date = "2021-11-07";
    String newdate = "2021-12-09";
    LocalDate localDate= LocalDate.parse(date);
    LocalDate newlocalDate= LocalDate.parse(newdate);
    ObservableList x= new ObservableListBase(localDate, "cat eats", false);

    @Test
        void getItem(){


    }

    @Test
    void getDueDate(){
        assertEquals(localDate, x.getDued);


    }

    @Test
    void addItem(){
        // add the item into the list
        // print the list
    }

    @Test
    void removeItem(){
        // Set up the items and delete for one of them
        // print out the list to see if it was deleted
        // compare
    }

    @Test
        void getDescription(){
        // for loop until 256 items
        // actual and expected a name for the description
        //print description
    }

    @Test
    void editDescription(){
        // input a new description for the item
        // test to see if it replaces the new with the old one
    }

    @Test
    void completion(){
        //if it is true = 0
        // if it is false =1
    }

}