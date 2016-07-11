package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrintStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_student);
    }

    public void onClickDone(View v) {
        Button done = (Button) v;
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}
