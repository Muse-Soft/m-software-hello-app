package dev.genalpha.xinchao;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Xin chào! 📱\n\nApp thử nghiệm của đội Mèo M-Software.\nBuild tự động bằng GitHub Actions.");
        tv.setTextSize(20);
        tv.setGravity(Gravity.CENTER);
        tv.setPadding(48, 48, 48, 48);
        setContentView(tv);
    }
}
