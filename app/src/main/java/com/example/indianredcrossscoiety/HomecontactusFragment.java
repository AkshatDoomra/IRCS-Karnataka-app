package com.example.indianredcrossscoiety;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomecontactusFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomecontactusFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomecontactusFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomecontactusFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomecontactusFragment newInstance(String param1, String param2) {
        HomecontactusFragment fragment = new HomecontactusFragment();
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
        View view = inflater.inflate(R.layout.fragment_homecontactus, container, false);

        TextView homecontatcus1= (TextView) view.findViewById(R.id.homecontatcus1);
        homecontatcus1.setText("Karnataka Head Office Address");
        TextView homecontatcus2= (TextView) view.findViewById(R.id.homecontatcus2);
        homecontatcus2.setText("26, Red Cross Bhavan, Race Course Rd,\n" +
                "Bengaluru, Karnataka, India, 560001");
        TextView homecontatcus3= (TextView) view.findViewById(R.id.homecontatcus3);
        homecontatcus3.setText("080-22268435");

                String[] address= new String[1];
        address[0]="ircskar@gmail.com";

        ImageView homecontatcus7 = (ImageView) view.findViewById(R.id.homecontatcus7);
        homecontatcus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, address);

                // if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
                startActivity(intent);
                //}

            }
        });
                ImageView homecontatcus9 = (ImageView) view.findViewById(R.id.homecontatcus9);
        homecontatcus9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://twitter.com/ircskarnataka");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
        ImageView homecontatcus10 = (ImageView) view.findViewById(R.id.homecontatcus10);
        homecontatcus10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.facebook.com/ircskarnataka");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
        ImageView homecontatcus11 = (ImageView) view.findViewById(R.id.homecontatcus11);
        homecontatcus11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.instagram.com/ircskarnataka/?hl=en");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
        ImageView homecontatcus12 = (ImageView) view.findViewById(R.id.homecontatcus12);
        homecontatcus12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.youtube.com/channel/UCQPTYmewzRO6YVUWeoqqZIA");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });



        return view;
    }
}