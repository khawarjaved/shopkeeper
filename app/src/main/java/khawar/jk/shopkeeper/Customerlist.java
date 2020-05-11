package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Customerlist extends AppCompatActivity {

    private static final  String TAG = "Customerlist";
    DatabaseHalper mDatabaseHalper;
    private ListView listCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerlist);
        listCustomer = findViewById(R.id.listCustomer);
        mDatabaseHalper = new DatabaseHalper(this);

populateListview();

    }

    private void populateListview() {

    }
}
