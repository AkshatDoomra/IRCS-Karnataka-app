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
 * Use the {@link ServFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ServFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ServFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ServFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ServFragment newInstance(String param1, String param2) {
        ServFragment fragment = new ServFragment();
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
        View view = inflater.inflate(R.layout.fragment_serv, container, false);

        TextView heading10 = (TextView) view.findViewById(R.id.heading10);
        heading10.setText("SOCIAL EMERGENCY RESPONSE VOLUNTEERS (SERV)");
        TextView heading10content = (TextView) view.findViewById(R.id.heading10content);
        heading10content.setText("Social Emergency Response Volunteers (SERV), formerly known as First Medical Responders (FMR) are a cadre of volunteers at the community level. They are the First responders in case of an emergency such as Earthquakes, landslides, floods and other such natural disasters. During other times, they volunteer and support long-term development of their own communities.\n" +
                "\n" +
                "Indian Red Cross Society embarked upon this mega flagship initiative since 2011 with its first pilot project in Uttarkhand. Following the success of this initiative in Uttarkhand, it has been expanded across the country with technical and financial support from both IFRC and ICRC.");
        TextView subheading10 = (TextView) view.findViewById(R.id.subheading10);
        subheading10.setText("Objectives of SERV");
        TextView subheading10content = (TextView) view.findViewById(R.id.subheading10content);
        subheading10content.setText("Act as First Responders in times of Emergencies\n" +
                "Sensitize the community to make them more resilient to Disasters to which the community is vulnerable.\n" +
                "Facilitate linkages between the community and the Government programs.\n");
        TextView subsubheading10 = (TextView) view.findViewById(R.id.subsubheading10);
        subsubheading10.setText("Principles of SERV");
        TextView subsubheading10content = (TextView) view.findViewById(R.id.subsubheading10content);
        subsubheading10content.setText("Provide immediate relief and response to the affected communities before additional support from the Government and other agency arrives.\n" +
                "Reduce vulnerabilities of the community by training the community on First Aid, Hygiene promotion etc.,\n" +
                "Conduct Vulnerability and Capacity Assessment of their own communities.\n" +
                "Support any other identified issues that contribute to the development of the communities.\n" +
                "Practices of SERV");
        TextView subsubsubheading10 = (TextView) view.findViewById(R.id.subsubsubheading10);
        subsubsubheading10.setText("Practices of SERV");
        TextView subsubsubheading10content = (TextView) view.findViewById(R.id.subsubsubheading10content);
        subsubsubheading10content.setText("Community understands their problems and opportunities than anyone else.\n" +
                "Community is more interested to understand their problems than anyone else.\n" +
                "Community is the key stake holder for development of the country, hence it has to participate for their own development.\n" +
                "Local communities are capable of initiating and sustaining their own community development.");
        TextView heading11 = (TextView) view.findViewById(R.id.heading11);
        heading11.setText("MAIN COMPONENTS OF SERV PROJECT");
        TextView heading11content = (TextView) view.findViewById(R.id.heading11content);
        heading11content.setText("Master Trainer\n" +
                "Instructors\n" +
                "Social Emergency Response volunteers\n" +
                "Community outreach activities");
        TextView heading12 = (TextView) view.findViewById(R.id.heading12);
        heading12.setText("WHY KARNATAKA? RISK PROFILE OF KARNATAKA STATE");
        TextView heading12content = (TextView) view.findViewById(R.id.heading12content);
        heading12content.setText("Karnataka state covers in area 191,976 square kilometers (74,122 sq.miles)or 5.83 percent of the total geographical area of India. It is the seventh largest Indian state by area. With 61,130,704 inhabitants at the 2011 census, Karnataka is the eigth largest state by Population, comprising 30 districts.\n" +
                "\n" +
                "Karnataka State has been affected by various natural hazards.");
        TextView heading13 = (TextView) view.findViewById(R.id.heading13);
        heading13.setText("FLOODS");
        TextView heading13content = (TextView) view.findViewById(R.id.heading13content);
        heading13content.setText("Almost all the districts in Karnataka are facing the brunt of moderate to severe floods. Floods are caused due to cloud bursts , cyclones or depressions in the Bay of Bengal and Arabian Sea. The following distrcts are regularly affected by floods: Belgaum, Bijapur, Bagalkote, Raichur, Gulbarga, Shimoga, Chickmgalur, Udupi, Coorg, Bellary, Dakshina Kannada, Dharwad, Davangere, Gadag, Hassan, Uttara Kannada, Koppal, Bidar, Bangalore (R), Bangalore (U), Kolar, Mandya, Mysore and Chamarajanagar.");

        TextView heading14 = (TextView) view.findViewById(R.id.heading14);
        heading14.setText("LANDSLIDE");
        TextView heading14content = (TextView) view.findViewById(R.id.heading14content);
        heading14content.setText("Hilly regions of Western Ghats spread in the districts of Kodagu, Chickmagalur, Hassan, Shimoga, Dakshina Kannada, and Uttara Kananda record a very high normal rainfall of 2000mm to 4000mm. landslides are common in these districts. During the rainy periods these hilly regions regularly experience displacement of rocks and soils causing widespread damage of property. The Landslides that happened in Madikeri in the year 2018 caused severe damage to the District and relief assistance was provided to them.");
        TextView heading15 = (TextView) view.findViewById(R.id.heading15);
        heading15.setText("EARTHQUAKE");
        TextView heading15content = (TextView) view.findViewById(R.id.heading15content);
        heading15content.setText("Karnataka has reported more than 500 earthquake tremors in the last three decades with most of them having low magnitude. It is found that the weak zones around the northen Karnataka bordering Maharashtra could cause heavy damages in future. The Following districts are falling Zone III where earthquakes of moderate intensity could occur: Bidar, Gulbarga,Bijapur, Bagalkot, Belgaum, Dharwad, Uttara Kannada, Shimoga, Udupi, Dakshina Kannada and Kodagu.");
        TextView heading16 = (TextView) view.findViewById(R.id.heading16);
        heading16.setText("CYCLOLONES");
        TextView heading16content = (TextView) view.findViewById(R.id.heading16content);
        heading16content.setText("The coastal districts namely Dakshina Kannada, Udupi, Uttara Kannada with a coastal line of 322 kms and coastal population of 43.64 lakhs are under the direct threat of cylones originating in Arabian Sea and indirect effect of cyclones originating along the Eastern coastline.\n" +
                "\n" +
                "The high density of population along the coastline of Karnataka has made the population highly vulnerable to the storm surge and high speed wing accompanied with cyclone. Any severe cyclone along the eastern coastline causes heavy rainfall in the interior Karnataka region resulting in damages to crops, buildings, and infrastructure services such as roads and often the impact would be severe disruption in the socio-economic life in these regions.");
        TextView heading17 = (TextView) view.findViewById(R.id.heading17);
        heading17.setText("DROUGHT");
        TextView heading17content = (TextView) view.findViewById(R.id.heading17content);
        heading17content.setText("The state is highly vulnerable to drought as compared to its neighboring states. About 152.1 lakhs ha (80%) out of 190.238 lakh ha is affected by drought in Karnataka.");
        TextView heading18 = (TextView) view.findViewById(R.id.heading18);
        heading18.setText("SERV PROJECT IN KARNATAKA STATE");
        TextView heading18content = (TextView) view.findViewById(R.id.heading18content);
        heading18content.setText("SERV (formerly known as FMR) was initiated in Karnataka State during the year 2018. SERV Instructors training course was organized in the year 2018, 10 people were selected as SERV Instructors, initially project was implemented in 3 District i.e. Ballari, Hassan and Shimoga generating 100 volunteers. In the year 2019 provision for 6 districts were given,   i.e. Ballari, Bengaluru Urban, Mandya, Mangaluru, Shimoga and Udupi, Thus by generating 22 Instructors and 464 SERV Volunteers . SERV Scale up proposal was put up, which aims on creating 30000 volunteers in the state. The Scale up of SERV was initially approved to be conducted in Ballari, Kalburgi, Mangalore, Shimoga and Udupi for a duration of 03 months, then extend to five other districts, thus by implementing SERV in all the Districts of Karnataka.\n"+"In each of the SERV implemented Districts, SERV Volunteers Training, Community Outreach Activities such as Mockdrill and community awareness programs based on  Swatch Bharat, WASH, Save the Girl Child, Global warming etc will be conducted.\n" +
                "\n" +
                "SERV volunteers have assisted and supported the Red Cross District  branches and lockal district administration  during Dakshina Kannada floods in the early year of 2018, Madikeri landslides 2018, floods in the year 2018, North Karnataka floods in the year 2019, most importantly during Covid-19 pandemic and during many other emergencies. ");
        TextView heading19 = (TextView) view.findViewById(R.id.heading19);
        heading19.setText("TRAINING CURRICULUM");
        TextView heading19content = (TextView) view.findViewById(R.id.heading19content);
        heading19content.setText("SERV training curriculum was developed during the year 2012-13 with technical support from IFRC and ICRC. The curriculum was revised during the year 2015 with technical support from IFRC, ICRC and Belgian Red Cross. All future trainings will use the revised training curriculum, in the year 2019, 4 new modules were added.\n" +
                "\n" +
                "The volunteers are trained in different aspects of disaster preparedness. Training includes demonstration and use of WatSan equipment and First Aid Kits. There are Thirteen modules in the training curriculum.");
        TextView heading20 = (TextView) view.findViewById(R.id.heading20);
        heading20.setText("MODULES OF SERV PROGRAM");
        TextView heading20content = (TextView) view.findViewById(R.id.heading20content);
        heading20content.setText("1. Introduction to RCRC Movement\n" +
                "2. Emergency First Aid\n" +
                "3. Public Health in Emergencies\n" +
                "4. WASH (Water, Sanitation and Hygiene)\n" +
                "5. PSP (Psychosocial Support)\n" +
                "6. Family News Service\n" +
                "7. Management of dead bodies\n" +
                "8. Crisis Management\n" +
                "9. PMR & VM (Planning, Monitoring, Reporting and Volunteer Management)\n" +
                "10. Climate Change\n" +
                "11. Integrated Risk Management\n" +
                "12. Safer Access\n" +
                "13. Care of persons with Disabilities during disasters");





















        return view;
    }
}