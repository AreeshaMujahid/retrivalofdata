package com.example.remindmeadmin;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

public class firebasedatabasehelper {

    private FirebaseDatabase mdatabase;
    private DatabaseReference mreferencecrreq;
    private List<crreq> cr_requests  =new ArrayList<> ();
    public interface DataStatus{
        void Dataisloaded(List<crreq> cr_request ,List<String> keys);
        void datainserted();
        void dataupdated();
        void datadeleted();
    }

    public firebasedatabasehelper() {
        mdatabase=FirebaseDatabase.getInstance ();
        mreferencecrreq= mdatabase.getReference ( "cr_requests");


    }

    public void readreq(final DataStatus dataStatus){
        mreferencecrreq.addValueEventListener (new ValueEventListener () {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                cr_requests.clear ();
                List<String> keys = new ArrayList<> ();
                for (DataSnapshot keyNode : snapshot.getChildren ()) {
                    keys.add (keyNode.getKey ());
                    crreq req = keyNode.getValue (crreq.class);
                    cr_requests.add (req);
                }
                dataStatus.Dataisloaded (cr_requests, keys);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


              }


}
