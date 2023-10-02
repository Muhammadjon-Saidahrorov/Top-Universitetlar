package uz.gita.topuniversitetlarmn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        AppCompatImageView backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(v -> finish());

        loadData();
    }

    private void loadData() {
        ImageView imageId  = findViewById(R.id.imageId);
        TextView titleId = findViewById(R.id.titleId);
        TextView textId = findViewById(R.id.textId);
        ImageView logo = findViewById(R.id.logo);
        TextView logoInfo = findViewById(R.id.info);


        int position = getIntent().getIntExtra("POSITION", 0);

        switch (position){

            case 0:
                imageId.setImageResource(R.drawable.massachusetts);
                titleId.setText(R.string.massachusetts);
                textId.setText(R.string.massachusettsInfo);
                logo.setImageResource(R.drawable.massachusetts_logo);
                logoInfo.setText(R.string.logoInfo1);
                break;
            case 1:
                imageId.setImageResource(R.drawable.stanford);
                titleId.setText(R.string.stanford);
                textId.setText(R.string.stenfordInfo);
                logo.setImageResource(R.drawable.stanford_logo);
                logoInfo.setText(R.string.logoInfo2);
                break;
            case 2:
                imageId.setImageResource(R.drawable.harvard);
                titleId.setText(R.string.harvard);
                textId.setText(R.string.harvardInfo);
                logo.setImageResource(R.drawable.harvard_logo);
                logoInfo.setText(R.string.logoInfo3);
                break;
            case 3:
                imageId.setImageResource(R.drawable.california);
                titleId.setText(R.string.california);
                textId.setText(R.string.californiaInfo);
                logo.setImageResource(R.drawable.california_logo);
                logoInfo.setText(R.string.logoInfo4);
                break;
            case 4:
                imageId.setImageResource(R.drawable.oxford);
                titleId.setText(R.string.oxford);
                textId.setText(R.string.oxfordInfo);
                logo.setImageResource(R.drawable.oxford_logo);
                logoInfo.setText(R.string.logoInfo5);
                break;
            case 5:
                imageId.setImageResource(R.drawable.eth);
                titleId.setText(R.string.eth);
                textId.setText(R.string.ethInfo);
                logo.setImageResource(R.drawable.eth_logo);
                logoInfo.setText(R.string.logoInfo6);
                break;
            case 6:
                imageId.setImageResource(R.drawable.cambridge);
                titleId.setText(R.string.cambridge);
                textId.setText(R.string.cambridgeInfo);
                logo.setImageResource(R.drawable.cambridge_logo);
                logoInfo.setText(R.string.logoInfo7);
                break;
            case 7:
                imageId.setImageResource(R.drawable.imperial);
                titleId.setText(R.string.imperial);
                textId.setText(R.string.imperialInfo);
                logo.setImageResource(R.drawable.imperial_logo);
                logoInfo.setText(R.string.logoInfo8);
                break;
            case 8:
                imageId.setImageResource(R.drawable.chicago);
                titleId.setText(R.string.chicago);
                textId.setText(R.string.chicagoInfo);
                logo.setImageResource(R.drawable.chicago_logo);
                logoInfo.setText(R.string.logoInfo9);
                break;
            case 9:
                imageId.setImageResource(R.drawable.ucl);
                titleId.setText(R.string.ucl);
                textId.setText(R.string.uclInfo);
                logo.setImageResource(R.drawable.ucl_logo);
                logoInfo.setText(R.string.logoInfo10);
                break;
        }
    }
}