package sg.edu.rp.c346.id21014919.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvC105, tvC203, tvC206, tvC218, tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvC105 = findViewById(R.id.firstModule);
        tvC203 = findViewById(R.id.secondModule);
        tvC206 = findViewById(R.id.thirdModule);
        tvC218 = findViewById(R.id.fourthModule);
        tvC346 = findViewById(R.id.fifthModule);

        tvC105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C105");
                startActivity(intent);

            }
        });

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C203");
                startActivity(intent);

            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C206");
                startActivity(intent);

            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C218");
                startActivity(intent);

            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent (MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Module", "C346");
                startActivity(intent);

            }
        });

    }
}