package khawar.jk.shopkeeper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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
    String mTitle[] = {"Laptop0","Laptop1", "Laptop2", "Laptop3", "Laptop4", "Laptop5","Laptop6","Laptop7","Laptop8","Laptop9","Laptop10"};
    String mDescription[] = {"laptop Description", "laptop Description", "laptop Description", "laptop Description", "laptop Description" +
            "","laptop Description","laptop Description","laptop Description","laptop Description","laptop Description"};
    int mImages[]={R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,R.drawable.lapimage,
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
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                    intent.putExtra("position",""+0);
                    startActivity(intent);

                }
                if (position== 1){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                    intent.putExtra("position",""+1);
                    startActivity(intent);

                }
                if (position== 2){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                    intent.putExtra("position",""+2);
                    startActivity(intent);

                }
                if (position== 3){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                    intent.putExtra("position",""+3);
                    startActivity(intent);

                }
                if (position== 4){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                    intent.putExtra("position",""+4);
                    startActivity(intent);


                }
                if (position== 5){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                    intent.putExtra("position",""+5);
                    startActivity(intent);


                }
                if (position== 6){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[6]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                    intent.putExtra("position",""+6);
                    startActivity(intent);


                }
                if (position== 7){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                    intent.putExtra("position",""+7);
                    startActivity(intent);


                }
                if (position== 8){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                    intent.putExtra("position",""+8);
                    startActivity(intent);


                }
                if (position== 9){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[9]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[9]);
                    intent.putExtra("description", mDescription[9]);
                    intent.putExtra("position",""+9);
                    startActivity(intent);


                }
                if (position== 10){
                    Intent intent = new Intent(getApplicationContext(),Main2Activity.class);

                    Bundle bundle = new Bundle();
                    bundle.putInt("image", mImages[10]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[10]);
                    intent.putExtra("description", mDescription[10]);
                    intent.putExtra("position",""+10);
                    startActivity(intent);


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
    }





