package sg.edu.rp.c346.id21024750.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    String examTipsArray[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvExamTips = findViewById(R.id.listViewExamTips);


        examTipsArray = new String[5];
        examTipsArray[0] = "1. Don't just read the code, code it as much as possible during each practical session";
        examTipsArray[1] = "2. Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examTipsArray[2] = "3. Prepare your template source code for each topic";
        examTipsArray[3] = "4. Create a few empty Android projects to speed up your coding during the exam";
        examTipsArray[4] = "5. Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, examTipsArray);

        lvExamTips.setAdapter(adapter);

    }
}
