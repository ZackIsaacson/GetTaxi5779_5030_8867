package com.gettaxi.benzack.gettaxi5779_5030_8867.model.datasource;


import android.support.annotation.NonNull;

import com.gettaxi.benzack.gettaxi5779_5030_8867.model.backend.Backend;
import com.gettaxi.benzack.gettaxi5779_5030_8867.model.entities.Ride;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Firebase_DBManager implements Backend {
    @Override
    public void addRide(Ride newRide) {

    }


  /*  public interface Action<T> {
        void onSuccess(T obj);

        void onFailure(Exception exception);

        void onProgress(String status, double percent);
    }

    public interface NotifyDataChange<T> {
        void OnDataChanged(T obj);

        void onFailure(Exception exception);
    }

    static DatabaseReference StudentsRef;
    static List<Ride> rideList;

    static {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        StudentsRef = database.getReference("rides");
        rideList = new ArrayList<>();
    }

    private static void addStudentToFirebase(final Ride ride, final Action<Long> action) {
        String key = ride.getTheClient().getClientPhoneNumber().toString();
        StudentsRef.child(key).setValue(ride).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                action.onSuccess(ride.getId());
                action.onProgress("upload student data", 100);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                action.onFailure(e);
                action.onProgress("error upload student data", 100);
            }
        });
    }
*/
    }
