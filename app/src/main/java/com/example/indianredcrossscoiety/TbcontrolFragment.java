package com.example.indianredcrossscoiety;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TbcontrolFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TbcontrolFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TbcontrolFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TbcontrolFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TbcontrolFragment newInstance(String param1, String param2) {
        TbcontrolFragment fragment = new TbcontrolFragment();
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
        View view =  inflater.inflate(R.layout.fragment_tbcontrol, container, false);

        TextView heading28 = (TextView) view.findViewById(R.id.heading28);
        heading28.setText("ABOUT");
        TextView heading28content = (TextView) view.findViewById(R.id.heading28content);
        heading28content.setText("Indian Red Cross Society, Karnataka State Branch Started T B Control Project- India in January – 2009 Funded by USAID and UK aid through IFRC in association with Tuberculosis Association of India. Control T B Division, Ministry of Health and Family Welfare, Govt of India, WHO and IRCS. Indian Red Cross Society, NHQ has allotted TB Project to Karnataka State Branch and is operating in Bengaluru Urban, Mandya and Tumkur Districts.\n" +
                "\n" +
                "During 2020 totally 294 TB Patients were helped with nutrition food 288 Patients were treated successfully.\n" +
                "\n" +
                "World Tuberculosis Day was observed on 24th March 2020 and drama was enacted on TB awareness a Jaatha was also organized on this occasion.");
        TextView subheading28 = (TextView) view.findViewById(R.id.subheading28);
        subheading28.setText("Project Objectives:");
        TextView subheading28content = (TextView) view.findViewById(R.id.subheading28content);
        subheading28content.setText("To provide care and supports and direct observation for 100 most vulnerable retreatment TB patients in each district.\n" +
                "To increase community awareness on TB, MDR and TB/HIV through project advocacy. Information, education, communication and social mobilization.\n" +
                "TO reduce stigma and discrimination towards TB and HIV patients and their family members.");
        TextView subsubheading28 = (TextView) view.findViewById(R.id.subsubheading28);
        subsubheading28.setText("Programmes and Activities:");
        TextView subsubheading28content = (TextView) view.findViewById(R.id.subsubheading28content);
        subsubheading28content.setText("Community Advocacy Training Meeting/ Education session.\n" +
                "Awareness Campaign.\n" +
                "Distribution of Care and support packages to needy  patients.\n" +
                "Individual and Family counseling session for TB Patients and their family members.\n" +
                "            It has been possible to put more than 294 of the  patients in the project area back on treatment and thereby preventing possible MDR, Distribution of Care and Support packages effective in making the patients adhere DOTS without default in targeted districts Bengaluru Urban, Mandya and Tumkur.");
        TextView heading29 = (TextView) view.findViewById(R.id.heading29);
        heading29.setText("IRCS KSB TB Control Project INDIA");
        TextView heading29content1 = (TextView) view.findViewById(R.id.heading29content1);
        heading29content1.setText("Bengaluru District");
        TextView heading29content2 = (TextView) view.findViewById(R.id.heading29content2);
        heading29content2.setText("Sri. Teju Rathod\n" +
                "State Coordinator\n" +
                "T. B. Control Project India\n" +
                "Mob: 7676191654\n" +
                "Email: tejurredcrosskar@gmail.com");
        TextView heading29content3 = (TextView) view.findViewById(R.id.heading29content3);
        heading29content3.setText("Mandya District");
        TextView heading29content4 = (TextView) view.findViewById(R.id.heading29content4);
        heading29content4.setText("Sri. G. K. Prasanna Kumar\n" +
                "T. B. Control Project India\n" +
                "Distinct Coordinator\n" +
                "Mob: 94806044881\n" +
                "Email:Prasannabhuvan@gmail.com");
        TextView heading29content5 = (TextView) view.findViewById(R.id.heading29content5);
        heading29content5.setText("Tumkur District");
        TextView heading29content6 = (TextView) view.findViewById(R.id.heading29content6);
        heading29content6.setText("Ms. Vijayalakshmi H\n" +
                "T. B. Control Project India\n" +
                "District Coordinator\n" +
                "Mob: 8971484342\n" +
                "Email:Vijayalakshmimsw94@gmail.com");







        return view;
    }
}