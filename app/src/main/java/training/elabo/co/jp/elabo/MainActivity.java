package training.elabo.co.jp.elabo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mAriesView;
    ImageView mTaurusView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAriesView = findViewById(R.id.btn_aries);
        mTaurusView = findViewById(R.id.btn_taurus);

    }

    @Override
    public void onResume() {
        super.onResume();

        mAriesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mTaurusView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
