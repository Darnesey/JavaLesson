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
        ((Button) v).setText("Clicked");
        Start.main();
    }

    public static void print(String output){
        out.setText(output);
    }

    public static void println(String output){
        out.setText(output + "\n");
    }

}
