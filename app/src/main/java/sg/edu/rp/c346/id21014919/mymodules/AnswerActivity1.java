package sg.edu.rp.c346.id21014919.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvModule = findViewById(R.id.textView);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");

        String msg1 = "";
        String msg2 = "";
        String msg3 = "";

        if (moduleSelected.equals("C105")) {
            msg1 = getString(R.string.firstModuleCode);
            msg2 = getString(R.string.firstModuleName);
            msg3 = getString(R.string.firstModuleVenue);
        } else if (moduleSelected.equals("C203")) {
            msg1 = getString(R.string.secondModuleCode);
            msg2 = getString(R.string.firstModuleName);
            msg3 = getString(R.string.firstModuleVenue);
        } else if (moduleSelected.equals("C206")) {
            msg1 = getString(R.string.thirdModuleCode);
            msg2 = getString(R.string.firstModuleName);
            msg3 = getString(R.string.firstModuleVenue);
        } else if (moduleSelected.equals("C218")) {
            msg1 = getString(R.string.fourthModuleCode);
            msg2 = getString(R.string.firstModuleName);
            msg3 = getString(R.string.firstModuleVenue);
        } else if (moduleSelected.equals("C346")) {
            msg1 = getString(R.string.fifthModuleCode);
            msg2 = getString(R.string.firstModuleName);
            msg3 = getString(R.string.firstModuleVenue);
        }

        tvModule.setText(msg1 + "\n" + "\n" + msg2 + "\n" + "\n" + "Academic Year: 2022"
                + "\n" + "\n" +"Semester: 1" + "\n" + "\n" + "Module Credit: 4" + "\n" +
                "\n" + msg3);


    }
}