package com.ptp.phamtanphat.firebasedatabase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1 dua con : child va value
        // 1 nguoi cha :Giang vien
//                            + Ten : Pham Tan phat;
        //kieu 1 : Kieu chuoi
//        myRef.child("Giangvien").child("Ten").setValue("Pham Tan Phat");
        //kieu 2: Kieu Hashmap
//        HashMap<String,String> mangxeco = new HashMap<>();
//        mangxeco.put("Xe4banh","Xe hoi");
//        mangxeco.put("Xe2banh","Xe dap");
//
//
        myRef.child("Ten").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = (String) dataSnapshot.getValue();
                Log.d("BBB",value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


//        Mang
//                + 0 : Nguyen Van A

    }
}
