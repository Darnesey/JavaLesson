package softwarefactory.javalessons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PrintStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_student);
        TextView list = (TextView) findViewById(R.id.printList);
        list.setText(Start.printStudents());
    }

    public void onClickDone(View v) {
        Button done = (Button) v;
        finish();
    }
}
