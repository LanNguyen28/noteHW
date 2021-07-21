package com.example.notehw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListnoteAdapter extends   RecyclerView.Adapter<ListnoteAdapter.NoteViewHolder> {

    private final ArrayList<String> mNoteList;
    private final LayoutInflater mInflater;

    public ListnoteAdapter(Context context, ArrayList<String> mNoteList) {
        mInflater = LayoutInflater.from(context);
        this.mNoteList = mNoteList;
    }
    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.fragment_item_note, parent, false);
        return new NoteViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ListnoteAdapter.NoteViewHolder holder, int position) {
        String mCurrent = mNoteList.get(position);
        holder.mEditcontent.setText(mCurrent);
        holder.mEdithead.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mNoteList.size();
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final EditText mEdithead;
        public  final EditText mEditcontent;
        final ListnoteAdapter mAdapter;


        public NoteViewHolder(View itemView, ListnoteAdapter adapter) {
            super(itemView);
            mEdithead = itemView.findViewById(R.id.text_head);
            mEditcontent = itemView.findViewById(R.id.text_content);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {

        }
    }

}
