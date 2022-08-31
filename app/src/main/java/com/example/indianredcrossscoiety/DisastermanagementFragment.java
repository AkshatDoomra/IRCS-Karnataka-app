package com.example.indianredcrossscoiety;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DisastermanagementFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DisastermanagementFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DisastermanagementFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DisastermanagementFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DisastermanagementFragment newInstance(String param1, String param2) {
        DisastermanagementFragment fragment = new DisastermanagementFragment();
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

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_disastermanagement, container, false);


        TextView disaster_managementcontent = (TextView) view.findViewById(R.id.disaster_managementcontent);

        disaster_managementcontent.setText("Indian Red Cross Society, Karnataka State branch has been a trusted destination for the poor and needy. For over nine decades, the Red Cross has earned the distinction of pioneering in relief operations and rendering services, benefitting innumerable suffering communities throughout the state. It focuses on providing a caring and nurturing environment to the needy and affected people.\n" +
                "IRCS, KSB aims to inspire, encourage and initiate at all times all forms of humanitarian activities so that human suffering can be minimized, alleviated and even prevented and thus contribute to creating a more congenial climate for peace.\n" +
                "\n" +
                "Emergency Relief meetings will be conducted every year during the monsoon season to discuss about the climatic conditions of the districts  and get in touch with the District Administration to understand  the situation. Relief materials will be sent to the districts and volunteers will be deployed for the relief work.\n"+"In the year 2001, the Karnataka State Branch of Indian Red Cross Society sent relief materials worth Rs. 1 crore to the people of Bhuj in Gujarat, who were affected by the devastating earth quake. In recognition of this act of humanitarian services the Karnataka State Branch was awarded gold medal by the head Quarters of Indian Red Cross Society housed in New Delhi.\n" +
                "\n" +
                "Some of the relief work carried out by Karnataka State Branch\n" +
                "Rs. 95.75 lakhs donated to Uttarkhand State to assist distresses people affected by floods.\n" +
                "Relief materials worth Rs.31 Lakhs was donated to the people affected by Nepal Earthquake.\n" +
                "In the year 2004, an amount of Rs. 2.8 crore was donated to IRCS Tamilnadu for community projects intended to help the victims of Tsunami.\n"+"Rs. 15 Lakhs was sent to Srilanka who suffered the wrath of Tsunami.\n" +
                "An amount of Rs. 57 lakhs was donated to the people of Andhra Pradesh who were affected by the Tsunami, during the same time donated Rs. 5 Lakhs to the Tsunami affected people at Kerala State.\n" +
                "The earth quake victims of Jammu & Kashmir received our timely donation of Rs. 1 lakh and were sheltered under 190 relief camps.\n" +
                "In the year 2009 the people of Northern part of Karnataka were distressed and subdued by the fury of floods. Responding to the pathetic plight of people of that area, the Karnataka unit of Red Cross provided financial support of Rs.3. 5 lakhs.\n" +
                "During the year 2015-16 Karnataka State Branch of Indian Red Cross Society donated a sum of Rs. 25 lakhs to its Tamilnadu Branch as a token of relief measure to the victims of flood disaster.\n"+"In the year 2018, Karnataka State Branch has conducted assessment of landslides at Madikeri District branch and also extended relief assistance for the Mangalore floods and Madikeri landslides.\n" +
                "In the year 2019,floods have caused huge damage to North Karnataka Districts and few of South Karnataka Districts as well, Disaster Emergency Relief fund was sanctioned by National Head Quarters and also relief materials were sent in huge numbers and also we have received many donations from the people who supported for the cause\n" +
                "In the year 2020, due to Covid-19 pandemic many people have suffered, we have supported the community by donating them sanitizers, soaps, facemasks, grocery kits etc., and also we have extended financial support of Rs.3 Lakhs to all the Red Cross District branches.\n" +
                "In the year 2020, we have also donated relief materials to the North Karnataka floods.");

        return view;

    }
}