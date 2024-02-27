package ma.enset.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameInput = findViewById(R.id.nameInput);
        EditText emailInput = findViewById(R.id.emailInput);

        Button addButton = findViewById(R.id.addButton);

        ListView listView = findViewById(R.id.listView);

        List<String> data = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);

        addButton.setOnClickListener(v -> {
            String name=nameInput.getText().toString();
            String email=emailInput.getText().toString();
            data.add("Name : "+name+"\nEmail : "+email);
            adapter.notifyDataSetChanged();
            nameInput.getText().clear();
            emailInput.getText().clear();
        });

    }
}