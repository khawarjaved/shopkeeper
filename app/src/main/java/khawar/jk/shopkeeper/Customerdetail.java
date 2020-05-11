package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Customerdetail extends AppCompatActivity {
Button addbutton,viewbutton;
EditText editcustomername;
DatabaseHalper mDatabasehalper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetail);
        addbutton = findViewById(R.id.addbutton);
        viewbutton = findViewById(R.id.viewbutton);
        editcustomername= findViewById(R.id.editcustomername);

        mDatabasehalper = new DatabaseHalper(this);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editcustomername.getText().toString();
                if (editcustomername.length() != 0){
                    AddData(newEntry);
                    editcustomername.setText("");
                }else {
                    toastMessage("you must put the something in text filed");
                }
            }
        });
        viewbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Customerdetail.this,Customerlist.class);
                startActivity(intent);
            }
        });
    }
    public void AddData(String newEntry){
        boolean insertData = mDatabasehalper.addData(newEntry);
        if (insertData){
            toastMessage("Data successfully inserted");
        }else {
            toastMessage("Something went wrong");
        }
    }

    private void toastMessage(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}
