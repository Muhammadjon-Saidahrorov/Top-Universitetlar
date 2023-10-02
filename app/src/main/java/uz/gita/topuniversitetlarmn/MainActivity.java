package uz.gita.topuniversitetlarmn;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton infoBtn = findViewById(R.id.infoBtn);

        FrameLayout massachusetts = findViewById(R.id.massachusetts);
        FrameLayout stanford = findViewById(R.id.stanford);
        FrameLayout harvard = findViewById(R.id.harvard);
        FrameLayout california = findViewById(R.id.california);
        FrameLayout oxford = findViewById(R.id.oxford);
        FrameLayout eth = findViewById(R.id.eth);
        FrameLayout cambridge = findViewById(R.id.cambridge);
        FrameLayout imperial = findViewById(R.id.imperial);
        FrameLayout chicago = findViewById(R.id.chicago);
        FrameLayout ucl = findViewById(R.id.ucl);

        massachusetts.setOnClickListener(v -> openInfo(0));
        stanford.setOnClickListener(v -> openInfo(1));
        harvard.setOnClickListener(v -> openInfo(2));
        california.setOnClickListener(v -> openInfo(3));
        oxford.setOnClickListener(v -> openInfo(4));
        eth.setOnClickListener(v -> openInfo(5));
        cambridge.setOnClickListener(v -> openInfo(6));
        imperial.setOnClickListener(v -> openInfo(7));
        chicago.setOnClickListener(v -> openInfo(8));
        ucl.setOnClickListener(v -> openInfo(9));

        infoBtn.setOnClickListener(v -> openDialog());
    }

    private void openInfo(int number) {
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("POSITION", number);
        startActivity(intent);
    }

    private void openDialog() {
        View view1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_info, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(view1)
                .create();
        dialog.show();
    }


}