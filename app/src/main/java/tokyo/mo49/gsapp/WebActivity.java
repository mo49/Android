//ブラウザを表示するアクティビティーです
package tokyo.mo49.gsapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;


public class WebActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //レイアウトをセットします
        setContentView(R.layout.activity_web);

        // ボタンのオブジェクトを取得
        Button btn = (Button)findViewById(R.id.button);
        // クリックイベントを受け取れるようにする
        btn.setOnClickListener(new View.OnClickListener() {
            // このメソッドがクリック毎に呼び出される
            public void onClick(View v) {
                // ここにクリックされたときの処理を記述
                Toast.makeText(getApplicationContext(), "もどりまーす", Toast.LENGTH_LONG).show();
                Log.d("back button click", "back button click");
            }
        });

        // Intent を取得。
        //Intentでアクティビティー間のデータを受け渡しします。Intentの値を受け取るために作成。
        Intent intent = getIntent();
        // キーを元にインテントデータを取得する
        String url  = intent.getStringExtra("url");

        //WebViewを探す
        WebView webView = (WebView) findViewById(R.id.webView1);
        //デバッグログ
        Log.d("get myurl", url);
        //ブラウザの機能をセットします。お約束。
        webView.setWebViewClient(new WebViewClient());
        //URLを表示します。
        webView.loadUrl(url);
    }
//    //デフォルトで作成されたメニューの関数です。未使用。
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_web, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
