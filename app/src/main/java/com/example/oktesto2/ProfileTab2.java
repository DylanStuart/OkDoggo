package com.example.oktesto2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link com.example.oktesto2.ProfileTab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileTab2 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "history_medical";
    private static final String ARG_PARAM2 = "history_behavior";
    private static final String ARG_PARAM3 = "history_home";

    TextView MedicalHistory, BehaviorHistory, HomeHistory;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    public ProfileTab2() {
        // Required empty public constructor
    }


    public static com.example.oktesto2.ProfileTab2 newInstance(String param1, String param2, String param3) {
        com.example.oktesto2.ProfileTab2 fragment = new com.example.oktesto2.ProfileTab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profiletab2, container, false);
        MedicalHistory = (TextView) view.findViewById(R.id.field_history_medical);
        BehaviorHistory = (TextView) view.findViewById(R.id.field_history_behavior);
        HomeHistory = (TextView) view.findViewById(R.id.field_history_home);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }

        MedicalHistory.setText(mParam1);//("This is the only place you can set text without crashing.");
        BehaviorHistory.setText(mParam2);
        HomeHistory.setText(mParam3);
        return view;
    }
}
