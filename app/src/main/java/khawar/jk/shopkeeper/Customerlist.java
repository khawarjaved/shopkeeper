package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

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
        Log.d(TAG,"populateListview: Displaying data in the ListView.");

        Cursor data = mDatabaseHalper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while (data.moveToNext()){
            listData.add(data.getString(1));
        }
        ListAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listData);
        listCustomer.setAdapter(adapter);
    }
}
