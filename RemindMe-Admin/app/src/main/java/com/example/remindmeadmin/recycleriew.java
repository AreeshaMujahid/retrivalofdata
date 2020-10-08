package com.example.remindmeadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class recycleriew {
    private Context mcontext;
    private reqAdapter mreqAdaptor;
    public void setConfigure(RecyclerView recyclerView,Context context ,List<crreq> req,List<String> keys){
        mcontext=context;
        mreqAdaptor=new reqAdapter (req,keys);
        recyclerView.setLayoutManager (new LinearLayoutManager (context));
        recyclerView.setAdapter (mreqAdaptor);

    }





    class crreqview extends RecyclerView.ViewHolder {
        private TextView currensem;
        private TextView depart;
        private TextView gmail;
        private TextView name;
        private TextView sec;

        private String key;

        public crreqview(ViewGroup parent) {
            super(LayoutInflater.from (mcontext).
                    inflate (R.layout.cr_req, parent, false));
            currensem = (TextView) itemView.findViewById (R.id.curr_seme);
            depart = (TextView) itemView.findViewById (R.id.depart);
            gmail = (TextView) itemView.findViewById (R.id.gmail);
            name = (TextView) itemView.findViewById (R.id.name);
            sec = (TextView) itemView.findViewById (R.id.sec);


        }

        public void bind(crreq req, String key) {
            currensem.setText (req.getCurr_sem ());
            depart.setText (req.getDepart ());
            gmail.setText (req.getGmail ());
            name.setText (req.getName ());
            sec.setText (req.getSection ());
            this.key = key;


        }}


        class reqAdapter extends RecyclerView.Adapter<crreqview> {
            private List<crreq> mreqlist;
            private List<String> mkeys;

            public reqAdapter(List<crreq> mreqlist, List<String> mkeys) {
                this.mreqlist = mreqlist;
                this.mkeys = mkeys;
            }

            @NonNull
            @Override
            public crreqview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new crreqview (parent);
            }

            @Override
            public void onBindViewHolder(@NonNull crreqview holder, int position) {
                holder.bind (mreqlist.get (position),mkeys.get (position));

            }

            @Override
            public int getItemCount() {
                return mreqlist.size ();
            }
        }

    }
