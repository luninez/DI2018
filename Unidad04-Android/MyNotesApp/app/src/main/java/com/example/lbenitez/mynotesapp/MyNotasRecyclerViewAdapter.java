package com.example.lbenitez.mynotesapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lbenitez.mynotesapp.Model.Nota;
import com.example.lbenitez.mynotesapp.NotasFragment.OnListFragmentInteractionListener;
import com.example.lbenitez.mynotesapp.dummy.DummyContent.DummyItem;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyNotasRecyclerViewAdapter extends RecyclerView.Adapter<MyNotasRecyclerViewAdapter.ViewHolder> {

    private final List<Nota> mValues;
    private final NotasInteractionListener mListener;
    private Context ctx;

    public MyNotasRecyclerViewAdapter(Context ctx, int layaout, List<Nota> items, NotasInteractionListener listener) {
        mValues = items;
        mListener = listener;
        this.ctx = ctx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_notas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTitle.setText(holder.mItem.getTitle());
        holder.mContent.setText(holder.mItem.getContent();

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTitle;
        public final TextView mContent;
        public final ImageView mFavorite;
        public Nota mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitle = view.findViewById(R.id.title);
            mContent = view.findViewById(R.id.content);
            mFavorite = view.findViewById(R.id.favorite);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTitle.getText() + "'" + " '" + mContent.getText() + "'";
        }
    }
}
