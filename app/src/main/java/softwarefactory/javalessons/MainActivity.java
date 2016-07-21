package softwarefactory.javalessons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Start.main();
    }

    public void onClickClear(View v) {
        out.setText("");
    }

    public static void print(String output){
        output = out.getText() + output;
        out.setText(output);
    }

    public static void println(String output){
        output = out.getText() + output + "\n";
        out.setText(output);
    }

    public static void print(int output){
        String print;
        print = out.getText() + String.valueOf(output);
        out.setText(print);
    }


    public static void println(int output){
        String print;
        print = out.getText() + String.valueOf(output) + "\n";
        out.setText(output);
    }

    public static void println(){
        out.setText(out.getText() + "\n");
    }
}
