package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        out = (TextView) findViewById(R.id.output);
    }


    public void onClickButton(View v) {
        Button button = (Button) v;
        button.setText("Enter input");
        Start.main();
    }

    public void onClickClear(View v) {
        out.setText("");
    }

    public void onClickAddStudent(View v){
        Intent add = new Intent(this, AddStudent.class);
        startActivity(add);
    }

    public void onClickDeleteStudent(View v) {
        Intent delete = new Intent(this, DeleteStudent.class);
        startActivity(delete);
    }

    public void onClickPrintStudents(View v) {
        Intent print = new Intent(this, PrintStudent.class);
        startActivity(print);
    }

    public static void print(String output){
        output = out.getText() + output;
        out.setText(output);
    }

    public static void println(String output){
        output = out.getText() + output + "\n";
        out.setText(output);
    }

    public static void println(){
        out.setText(out.getText() + "\n");
    }
}
