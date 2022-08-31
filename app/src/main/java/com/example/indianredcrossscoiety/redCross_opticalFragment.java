package com.example.indianredcrossscoiety;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link redCross_opticalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class redCross_opticalFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public redCross_opticalFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment redCross_opticalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static redCross_opticalFragment newInstance(String param1, String param2) {
        redCross_opticalFragment fragment = new redCross_opticalFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_red_cross_optical, container, false);

        TextView heading33 = (TextView) view.findViewById(R.id.heading33);
        heading33.setText("About");

        TextView heading33content = (TextView) view.findViewById(R.id.heading33content);
        heading33content.setText("Karnataka Red Cross started optical unit in Minto Hospital, Bangalore in 1987 with an objective of helping the poor people. Our optical unit sells the opticals at a very low cost reasonable rate. That is why unit is running very effectively and has become very useful to the people. The punk goggles are sold at Rs. 30/-a piece where as it costs more than Rs.150/- in the market. Sometimes these are given free of cost also for the poor cataract operated patient\n" +
                "\n" +
                "The optical unit was running in a very old small building given by Minto Hospital authorities. The building was in bad condition. Therefore Karnataka State Branch got renovated the building by spending about Rs.7 lakhs. This renovation has a positive effect on the unit’s business.\n" +
                "\n" +
                "Smt. Sudha Murthy, Chairman, Infosys Foundation inaugurated the renovated optical unit on 26/10/2016.\n" +
                "\n" +
                "During 2016-17 first half of the year total sale was 1845 spectacles and during 2nd half of the year i.e. after renovation the sales went up and it was 2623.\n" +
                "\n" +
                "The renovation was done out of its savings and during the last 10 years, the unit has received a donation of Rs. 5,65,500 out of which Smt. Sudha Murthy alone has given Rs. 5 lakhs in 2009.");


        return view;

    }
}