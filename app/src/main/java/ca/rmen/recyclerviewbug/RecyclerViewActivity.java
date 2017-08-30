package ca.rmen.recyclerviewbug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerViewActivity extends AppCompatActivity {
    private static final String EXTRA_SIZE = "size";

    static void start(Context context, int size) {
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        intent.putExtra(EXTRA_SIZE, size);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_activity);
        int size = getIntent().getIntExtra(EXTRA_SIZE, 0);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(size);
        recyclerView.setAdapter(adapter);
    }
}
