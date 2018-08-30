package com.ptp.phamtanphat.firebasedatabase;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.ChildEventListener;
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
        //Kieu 3 : Kieu object
//        Nhanvien nhanvien = new Nhanvien("Nguyen Van A","20");
//        Nhanvien nhanvien1 = new Nhanvien("Nguyen Van B","22");
//        myRef.child("Nhanvien").setValue(nhanvien1);
        //Kieu 4 : id vo danh
//        Nhanvien nhanvien = new Nhanvien("Nguyen Van A","20");

//        Nhanvien nhanvien1 = new Nhanvien("Nguyen Van B","22");
//        myRef.child("Quanly").setValue(nhanvien);


        //Doc ve
        //Kieu 1 : Kieu chuoi
//        myRef.child("Ten").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                String value = (String) dataSnapshot.getValue();
//                Log.d("BBB",value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        //Kieu 2 : Kieu Hashmap
//        myRef.child("Phuongtien").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                HashMap<String,String> value = (HashMap<String, String>) dataSnapshot.getValue();
//                Log.d("BBB",value.get("Xe2banh"));
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        //Kieu 3 : Kieu object
//        myRef.child("Quanly").addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Nhanvien quanly = dataSnapshot.getValue(Nhanvien.class);
//                Log.d("BBBB",quanly.getTen());
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });
        //Doc nhieu du lieu ben trong child
        myRef.child("Nhanvien").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Nhanvien nhanvien = dataSnapshot.getValue(Nhanvien.class);
                Log.d("BBB",nhanvien.getTen());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



    }
}
