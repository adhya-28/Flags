package newapp.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Flag> flagList;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flagList = new ArrayList<>();



        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        flagList.add(
                new Flag(
                        "INDIA","https://www.mapsofindia.com/maps/india/images/flag-wallpapers/india-flag-wallpaper.jpg"
                        ));


        Flag_Adapter adapter = new Flag_Adapter(this,flagList);
recyclerView.setAdapter(adapter);
    }
}
