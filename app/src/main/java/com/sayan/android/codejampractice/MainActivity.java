package com.sayan.android.codejampractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<IndividualAudience> audiences = new ArrayList<>();
        for (int i = 0; i <= 25; i++){
            if (i <11)
                audiences.add(new IndividualAudience(3));
            if (i <11 && i > 5)
                audiences.add(new IndividualAudience(i));
            else audiences.add(new IndividualAudience(i + 1));
        }
//        Codes.startClapping(audiences, 0);
        Codes.checkSalt("010234201");
        for (IndividualAudience individual :
                audiences) {
            Log.d("list: ", "" + individual);
        }
    }
}
