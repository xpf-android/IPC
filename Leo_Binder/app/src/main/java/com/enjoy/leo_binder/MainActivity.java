package com.enjoy.leo_binder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //写 使用 mmap 映射文件 在内存当中 并操作这块内存 往这块内存中写入一块数据
        writeTest();
        readTest();
    }

    public native void writeTest();

    public native void readTest();
}
