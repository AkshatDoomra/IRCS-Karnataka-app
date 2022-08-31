package com.example.indianredcrossscoiety;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UrbanfamilyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UrbanfamilyFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UrbanfamilyFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UrbanfamilyFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UrbanfamilyFragment newInstance(String param1, String param2) {
        UrbanfamilyFragment fragment = new UrbanfamilyFragment();
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
        View view = inflater.inflate(R.layout.fragment_urbanfamily, container, false);

        TextView heading30 = (TextView) view.findViewById(R.id.heading30);
        heading30.setText("ABOUT US");
        TextView heading30content = (TextView) view.findViewById(R.id.heading30content);
        heading30content.setText("URBAN FAMILY WELFARE of Indian Red Cross (KSB) was established in the year 1969 and is functioning at BBMP’s Sirsi Circle Maternity Home, Chamarajpet, Bengaluru. It takes care of Mother and Children. It also ensures safety of motherhood and stresses on breast feeding. Apart from this it protects children, through vaccination, from six dreaded diseases. This welfare centre actively takes part in the Central Government’s pulse polio programmes, Miseales & Rubella Vaccination drives.\n"+"1969 Indian RedCross Society with the collaboration of the Family Welfare Department started a unit in Bruhath Bengaluru Mahanagara Palike Maternity Hospital, Chamarajpet, Sirsi Circle, Bengaluru.\n" +
                "Programme& Activities\n" +
                "• Counseling& Guidance\n" +
                "– Family Planning for married couples\n" +
                "– Pre and post-pregnancy problems\n" +
                "– Prenatal and Infant Care\n" +
                "– ANC checkup [Pregnant Women]\n" +
                "• Birth Control Measures\n" +
                "– Insertion of Female Coperty\n" +
                "– Medical Abortion\n" +
                "– Distribution of Oral pills & Nirod\n" +
                "– Contraceptive injection");


        TextView heading31 = (TextView) view.findViewById(R.id.heading31);
        heading31.setText("MEDICAL ASSISTANCE AND SERVICE");
        TextView heading31content = (TextView) view.findViewById(R.id.heading31content);
        heading31content.setText("• Self Motivated Family Planning Camps\n" +
                "• Sterilization-\n" +
                "– Laparoscopic Tubectomy & Tubectomy operation\n" +
                "for females\n" +
                "– Vasectomy operation for Males\n" +
                "Community Awareness Programme\n" +
                "• Pulse Polio Programme\n" +
                "• Communicable & Non Communicable diseases\n" +
                "• Routine immunization day & Outreach immunization Camps\n" +
                "• Special outreach camps in HRA\n" +
                "• TB/HIV Awareness Programme\n" +
                "• Mental Health, UHND\n" +
                "• Adolescent awareness\n" +
                "• Breastfeeding awareness");
        TextView heading32 = (TextView) view.findViewById(R.id.heading32);
        heading32.setText("OTHER SERVICES");
        TextView heading32content = (TextView) view.findViewById(R.id.heading32content);
        heading32content.setText("• Regular School Health Checkups\n" +
                "• Providing DOTS (Direct Observation of Treatment Short Course) to Tuberculosis patients\n" +
                "Educative and information sessions are conducted to reduce stigma and discrimination on TB/HIV and Family Planning to promote a healthy atmosphere in Community");





        return view;
    }
}