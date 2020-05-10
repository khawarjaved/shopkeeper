package khawar.jk.shopkeeper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listitem extends AppCompatActivity {

    ListView listview;
    String mTitle[] = {"Laptop1", "Laptop2", "Laptop3", "Laptop4", "Laptop5","Laptop6","Laptop7","Laptop8","Laptop9","Laptop10"};
    String mDescription[] = {"laptop Description", "laptop Description", "laptop Description", "laptop Description", "laptop Description" +
            "","laptop Description","laptop Description","laptop Description","laptop Description","laptop Description"};
    int mImages[]={R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,
            R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);
        listview = findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter( this, mTitle , mDescription , mImages);
         listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
                if (position== 0){
                    Toast.makeText(listitem.this,"laptop Description",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




        class MyAdapter extends ArrayAdapter<String> {
            Context context;
            String mTitle[];
            String mDescription[];
            int mimages[];
            MyAdapter(Context c, String[] title, String[] description, int[] i) {
                super(c, R.layout.row, R.id.textView1, title);
                this.context = c;
                this.mTitle = title;
                this.mDescription = description;
                this.mimages = mImages;

                

            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row  = layoutInflater.inflate(R.layout.row,parent,false);
                ImageView images = row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.textView1);
                TextView myDescription = row.findViewById(R.id.textView2);

                myTitle.setText(mTitle[position]);
                myDescription.setText(mDescription[position]);
                images.setImageResource(mimages[position]);

                return row;
            }
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar,menu);
        return true;
    }
    
}



