package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static softwarefactory.javalessons.MainActivity.setConfirmation;

public class DeleteStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_student);
    }

    public void onClickDelete(View v){
        Button view = (Button) v;
        String name = getInput();
        boolean successful = Start.deleteStudent(name);

        if(!successful)
            setConfirmation(false, "Student not found!");
        else
            setConfirmation(true, "Student deleted successfully");
        //go back to main
        finish();
    }

    public String getInput(){
        EditText input = (EditText) findViewById(R.id.deleteField);
        String data = input.getText() + "";

        return data;
    }
}
