package khawar.jk.shopkeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
EditText username;
EditText userpassword;
Spinner spinner;
Button buttonlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      username  = (EditText) findViewById(R.id.username);
      userpassword = (EditText) findViewById(R.id.userpassword);
      spinner = (Spinner) findViewById(R.id.spinner);
      buttonlogin = (Button) findViewById(R.id.buttonlogin);


        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.usertype,R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = spinner.getSelectedItem().toString();
                if (username.getText().toString().equals("admin")&& userpassword.getText().toString().equals("admin")&& item.equals("admin"));
                
            }
        });
    }
}
