package com.example.migueldominguez.mapdemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ActorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ActorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String NAME = "name";
    private static final String TOP  = "top";
    private static final String LEFT = "left";
    private static final String INDEX = "index";

    // TODO: Rename and change types of parameters
    private String mName;
    private int top;
    private int left;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActorFragment newInstance(String name, int index) {
        ActorFragment fragment = new ActorFragment();
        Bundle args = new Bundle();
        args.putString(NAME, name);
        args.putInt(INDEX,index);
        args.putInt(TOP,0);
        args.putInt(LEFT,0);
        fragment.setArguments(args);
        return fragment;
    }

    public ActorFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_actor, container, false);
        ((TextView)view.findViewById(R.id.actor_name)).setText(mName);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public void relocate(Coordinates coords)
    {
        getArguments().putInt(LEFT,(int)coords.Y());
        getArguments().putInt(TOP,(int)coords.X());
        left = getArguments().getInt(LEFT);
        top = getArguments().getInt(TOP);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
