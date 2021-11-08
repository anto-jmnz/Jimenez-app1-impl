import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.ErrorManager;

public class EditItem implements Initializable{
    @FXML
    private TextField Description_Field;
    @FXML
    DatePicker itemDate;
    @FXML
    Item item;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    public void saveItem(){
        String description= Description_Field.getText().trim();
        if(itemDescription(description)==0){
            ErrorMessage("Error", "Please enter a description.");
            return;
        }

        if(itemDescription((description))==-1){
            ErrorMessage("Error","Maximum of characters reached.");
            return;
        }

        LocalDate localDate = itemDate.getValue();

        String Due_Date= DueDateGet(localDate);

        item.setDescription(description);
        item.setDueDate(localDate);

        Stage stage = (Stage) itemDate.getScene().getWindow();

    }

    public String DueDateGet (LocalDate localDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD", Locale.getDefault());
        Instant instant= Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        java.util.Date date= java.sql.Date.from(instant);
        String due_date= dateFormat.format(date);
        return due_date;
    }


    public int itemDescription(String description){
        if(description.isEmpty()){
            return 0;
        }
        if(description.length()> 256){
            return -1;
        }
        return 1;
    }


    private void ErrorMessage(String title, String message){
        Alert box= new Alert((Alert.AlertType.ERROR));
        box.setTitle(title);
        box.setContentText(message);
        box.showAndWait();
    }




}
