package tokyo.mo49.gsapp;

import tokyo.mo49.gsapp.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(id.button);
        // ボタンがクリックされた時に呼び出されるコールバックリスナーを登録します
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ボタンがクリックされた時に呼び出されます
                Button button = (Button) v;
                Toast.makeText(ButtonActivity.this, "onClick()",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
