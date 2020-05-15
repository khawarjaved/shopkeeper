package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Customerdetail extends AppCompatActivity {
 private Button addbutton,viewbutton;
private EditText editcustomername,editcustomersurname,editcustomerphone;
DatabaseHalper myDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetail);
        addbutton = findViewById(R.id.addbutton);
        viewbutton = findViewById(R.id.viewbutton);
        editcustomername= findViewById(R.id.editcustomername);
        editcustomersurname= findViewById(R.id.editcustomersurname);
        editcustomerphone= findViewById(R.id.editcustomerphone);
        myDB = new DatabaseHalper(this);
        AddData();
    }
        public void AddData(){
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              boolean isInserted =  myDB.insertData(editcustomername.getText().toString(),editcustomersurname.getText().toString(),
                        editcustomerphone.getText().toString());
              if (isInserted = true)
                  Toast.makeText(Customerdetail.this,"Data Inserted",Toast.LENGTH_LONG).show();
                  else
                  Toast.makeText(Customerdetail.this,"Data not Inserted",Toast.LENGTH_LONG).show();

            }
        });
    }
}
