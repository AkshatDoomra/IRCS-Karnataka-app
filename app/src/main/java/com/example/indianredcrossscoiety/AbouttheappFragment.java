package com.example.indianredcrossscoiety;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AbouttheappFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AbouttheappFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AbouttheappFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AbouttheappFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AbouttheappFragment newInstance(String param1, String param2) {
        AbouttheappFragment fragment = new AbouttheappFragment();
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
        View view = inflater.inflate(R.layout.fragment_abouttheapp, container, false);


        String[] address= new String[1];
        address[0]="akshat.doomra23@gmail.com";
        ImageView devimage1 = (ImageView) view.findViewById(R.id.devimage1);
        devimage1.setOnClickListener(new View.OnClickListener() {
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
        ImageView devimage2 = (ImageView) view.findViewById(R.id.devimage2);
        devimage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse("https://www.linkedin.com/in/akshat-doomra/");
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });

        ImageView devimage3 = (ImageView) view.findViewById(R.id.devimage3);
                devimage3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri webpage = Uri.parse("https://www.instagram.com/akshat_doomra/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                        startActivity(intent);
                    }
                });

        return view;
    }
}