package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
    }


    public void onClickSubmit(View v){
        Button view = (Button) v;
        String name = getInput();
        Start.addStudent(name);

        //go back to main
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public String getInput(){
        EditText input = (EditText) findViewById(R.id.inputField);
        String data = input.getText() + "";

        return data;
    }
}
