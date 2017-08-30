package ca.rmen.recyclerviewbug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void onSmallButtonClicked(View view) {
        RecyclerViewActivity.start(this, 250);
    }

    public void onLargeButtonClicked(View view) {
        RecyclerViewActivity.start(this, 5000);
    }
}
