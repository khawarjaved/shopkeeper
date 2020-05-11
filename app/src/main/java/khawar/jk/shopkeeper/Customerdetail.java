package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Customerdetail extends AppCompatActivity {
Button addbutton,viewbutton;
EditText editcustomername;
DatabaseHalper mDatabasehalper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetail);
    }
}
