package cn.edu.hqu.cst.android.chapter3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String StateInfo;
        if(null!=savedInstanceState)
            StateInfo=savedInstanceState.getString("preState");
        else
            StateInfo="默认状态";
        Log.i("状态信息",StateInfo);
        Log.i("生命周期","执行onCreate回调函数");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.i("生命周期","执行onStart回调函数");
        super.onStart();
    }
    @Override
    protected void onResume(){
        Log.i("生命周期","执行onResume回调函数");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("生命周期","执行onPause回调函数");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("生命周期","执行onStop回调函数");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("生命周期","执行onDestroy回调函数");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.i("生命周期","执行onRestart回调函数");
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i("生命周期","执行onSaveInstanceState回调函数");
        outState.putString("preState","这是之前保存的Activity状态信息");
        super.onSaveInstanceState(outState);
    }
}
