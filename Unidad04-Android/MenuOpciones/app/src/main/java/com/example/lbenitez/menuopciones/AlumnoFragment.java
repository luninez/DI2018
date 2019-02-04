package com.example.lbenitez.menuopciones;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class AlumnoFragment extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private AlumnosInteractionListener mListener;
    MyAlumnoRecyclerViewAdapter adapter;
    Context ctx;
    List<Alumno> alumnos;

    public AlumnoFragment() { }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AlumnoFragment newInstance(int columnCount) {
        AlumnoFragment fragment = new AlumnoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alumno_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

        alumnos = new ArrayList<>();
            alumnos.add(new Alumno(1, "https://s3.amazonaws.com/uifaces/faces/twitter/zeldman/128.jpg", "Lucia", "Benitez Martinez", "2DAM"));
            alumnos.add(new Alumno(2, "https://s3.amazonaws.com/uifaces/faces/twitter/zeldman/128.jpg", "Eva", "Benitez Martinez", "2DAM"));
            alumnos.add(new Alumno(3, "https://s3.amazonaws.com/uifaces/faces/twitter/zeldman/128.jpg", "Olga", "Benitez Martinez", "2DAM"));

        adapter = new MyAlumnoRecyclerViewAdapter(ctx, R.layout.fragment_alumno, alumnos, mListener);

        recyclerView.setAdapter(adapter);

        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        ctx=context;
        if (context instanceof AlumnosInteractionListener) {
            mListener = (AlumnosInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
