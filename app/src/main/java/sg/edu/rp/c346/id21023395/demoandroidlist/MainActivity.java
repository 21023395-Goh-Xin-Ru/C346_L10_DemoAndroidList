package sg.edu.rp.c346.id21023395.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<AndroidVersion> alAndroidVersions;
    CustomAdapter aaAndroidVersions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listViewAndroidVersions);
        alAndroidVersions = new ArrayList<>();
        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");
        AndroidVersion item4 = new AndroidVersion("Marshmallow", "6.0 - 6.01");
        AndroidVersion item5 = new AndroidVersion("Lollipop", "5.0 - 5.1.1");
        AndroidVersion item6 = new AndroidVersion("KitKat", "4.4 - 4.4.4");
        AndroidVersion item7 = new AndroidVersion("Jelly Bean", "4.1 - 4.3.1");

        alAndroidVersions.add(item1);
        alAndroidVersions.add(item2);
        alAndroidVersions.add(item3);
        alAndroidVersions.add(item4);
        alAndroidVersions.add(item5);
        alAndroidVersions.add(item6);
        alAndroidVersions.add(item7);

        aaAndroidVersions = new CustomAdapter(this,
                R.layout.row, alAndroidVersions);

        lv.setAdapter(aaAndroidVersions);
    }
}