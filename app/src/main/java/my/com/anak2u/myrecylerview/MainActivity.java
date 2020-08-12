package my.com.anak2u.myrecylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            datas.add("This is data "+i);
        }
        CustomAdapter adapter = new CustomAdapter();
        adapter.items = datas;
        recyclerView.setLayoutManager(new LinearLayoutManager(
                MainActivity.this));
        recyclerView.setAdapter(adapter);

    }
}
