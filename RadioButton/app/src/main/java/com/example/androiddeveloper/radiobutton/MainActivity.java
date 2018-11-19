package com.example.androiddeveloper.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioButton programButton = (RadioButton) findViewById(R.id.program);
        RadioButton uiButton = (RadioButton) findViewById(R.id.ui);
        programButton.setOnCheckedChangeListener(mOnCheckedChangeListener);
        uiButton.setOnCheckedChangeListener(mOnCheckedChangeListener);
    }

    private CompoundButton.OnCheckedChangeListener mOnCheckedChangeListener = new CompoundButton.OnCheckedChangeListener()
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            switch (buttonView.getId())
            {
                case R.id.program:
                    Toast.makeText(MainActivity.this, "安安, 程式設計師!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.ui:
                    Toast.makeText(MainActivity.this, "安安, UI設計師!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
