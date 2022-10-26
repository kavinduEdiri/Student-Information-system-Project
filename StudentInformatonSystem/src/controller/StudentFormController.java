package controller;

import com.mysql.cj.Session;
import entity.Student;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import utill.HibernateUtill;

import javax.transaction.Transaction;
import java.io.Serializable;

public class StudentFormController {

    public TextField txtName;
    public TextField text;
    public TextField txtAddress;
    public RadioButton btnMale;
    public RadioButton btnFemale;
    public Button upload;
    public Button save;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colGender;
    public TableColumn colOption;
    public TextField txtid;

    public void UploadOnAction(ActionEvent actionEvent) {
    }

    public void SaveOnAction(ActionEvent actionEvent) {

        Student student=new Student(
                Long.parseLong(txtid.getText()),txtName.getText(),txtAddress.getText(),
                btnFemale.isSelected()?"Female":"Male"
        );


        Session session= HibernateUtill.getSession();
        Transaction transaction=session.beginTransacion();
        Serializable save =session.save(student);
        System.out.println(save);
        transaction.commit();
    }
}
