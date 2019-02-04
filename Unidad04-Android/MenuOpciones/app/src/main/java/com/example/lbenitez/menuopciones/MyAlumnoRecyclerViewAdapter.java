package com.example.lbenitez.menuopciones;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MyAlumnoRecyclerViewAdapter extends RecyclerView.Adapter<MyAlumnoRecyclerViewAdapter.ViewHolder> {

    private final List<Alumno> mValues;
    private final AlumnosInteractionListener mListener;
    private Context ctx;

    public MyAlumnoRecyclerViewAdapter(Context ctx, int layaout, List<Alumno> items, AlumnosInteractionListener listener) {
        mValues = items;
        mListener = listener;
        this.ctx = ctx;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_alumno, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mNombre.setText((holder.mItem).getName());
        holder.mApellidos.setText((holder.mItem).getApellidos());
        holder.mCurso.setText((holder.mItem).getCurso());

        Glide.with(ctx).load(holder.mItem.getImg()).into(holder.mImg);

        holder.mEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // mListener.onAlumnoEditClick(holder.mItem.toString());
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
        public final ImageView mImg;
        public final TextView mNombre;
        public final TextView mApellidos;
        public final TextView mCurso;
        public final ImageView mEditar;
        public final ImageView mDelete;
        public Alumno mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            ", fechaNac=" + fechaNac +

        }

        @Override
        public String toString() {
            return super.toString() + " '" + mNombre.getText() + "'" + mApellidos.getText() + "'" + " '" + mCurso.getText() + "'";
        }
    }
}
