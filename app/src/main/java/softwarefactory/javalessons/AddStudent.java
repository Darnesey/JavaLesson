package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static softwarefactory.javalessons.MainActivity.*;

public class AddStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }


    public void onClickSubmit(View v){
        Button view = (Button) v;
        String name = getInput();
        try {
            Start.addStudent(name);
            setConfirmation(true, "Student added successfully");
        } catch (Exception e) {
            setConfirmation(false, "Error adding student");
        }

        //go back to main
        finish();
    }

    public String getInput(){
        EditText input = (EditText) findViewById(R.id.inputField);
        String data = input.getText() + "";

        return data;
    }
}
