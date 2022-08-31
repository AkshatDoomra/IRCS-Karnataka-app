package com.example.indianredcrossscoiety;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JuniorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JuniorFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JuniorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JuniorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JuniorFragment newInstance(String param1, String param2) {
        JuniorFragment fragment = new JuniorFragment();
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
    final String url = "https://redcrosskarnataka.org/wp-content/uploads/2021/05/RED-Cross-English-Final-as-on-29-04-2021_compressed.pdf";
    String name="Manual.pdf";
    final int REQUEST_CODE = 10;
    final String url2 ="https://redcrosskarnataka.org/wp-content/uploads/2021/05/Kannada_Final_compressed.pdf";


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_junior, container, false);

        TextView heading21 = (TextView) view.findViewById(R.id.heading21);
        heading21.setText("JUNIOR RED CROSS");
        TextView heading21content = (TextView) view.findViewById(R.id.heading21content);
        heading21content.setText("The main moto of Junior Red Cross is “I SERVE”.The Junior Red Cross is the high school Students’s wing of the Red Cross. It is a group movement organized within schools. Students who take part in Junior Red Cross activities are known as ‘Juniors’. The teachers who guides the students in JRC activities, is called “COUNSELLOR”.");
        TextView heading22 = (TextView) view.findViewById(R.id.heading22);
        heading22.setText("JUNIOR RED CROSS OBJECTIVES");
        TextView heading22content = (TextView) view.findViewById(R.id.heading22content);
        heading22content.setText("1. Promotion of Health\n" +
                "2. Service to the Sick and suffering\n" +
                "3. National and International friendliness");
        TextView heading23 = (TextView) view.findViewById(R.id.heading23);
        heading23.setText("JUNIOR RED CROSS PLEDGE");
        TextView heading23content = (TextView) view.findViewById(R.id.heading23content);
        heading23content.setText("“I pledge myself to care for my own health and that of others, to help the sick and suffering, especially children and to look of all other children all over the world as my friends.”");
        TextView heading24 = (TextView) view.findViewById(R.id.heading24);
        heading24.setText("FUNCTIONING OF JRC IN SCHOOLS");
        TextView heading24content = (TextView) view.findViewById(R.id.heading24content);
        heading24content.setText("JRC activities are formulated based on its Principles of Health, Services and Friendship. The programs are chalked out in such as way to suit occasions, locations and social requirements. Some of the activities that can be organized are indicated here.");
        TextView heading25 = (TextView) view.findViewById(R.id.heading25);
        heading25.setText("PROMOTION OF HEALTH");
        TextView heading25content = (TextView) view.findViewById(R.id.heading25content);
        heading25content.setText("Practice of health Habits\n" +
                "Cleanliness of School Premises\n" +
                "Health  Awareness campaign in the nearby areas\n" +
                "First Aid Training\n" +
                "Blood grouping camps for JRC members and Blood donation open demonstration by JRC COUNSELLOR.\n" +
                "Personal Hygiene");
        TextView heading26 = (TextView) view.findViewById(R.id.heading26);
        heading26.setText("GOVERNMENT ORDER");
        TextView heading26content = (TextView) view.findViewById(R.id.heading26content);
        heading26content.setText("Junior Red Cross Wing, Primary and Secondary Education Department. Karnataka Government order No: ED 192 SLB 2017, Bangalore, Date: 3rd March 2020, Government order ED 192 SLB 2017, Bangalore ,Date 3rd March 2020");
        TextView heading27 = (TextView) view.findViewById(R.id.heading27);
        heading27.setText("JRC Guidelines");

        bloodtransfusionsFragment b = new bloodtransfusionsFragment();

        Button englishmanual = (Button) view.findViewById(R.id.englishmanual);
        englishmanual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ContextCompat.checkSelfPermission(getContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url,name);


                }
                else
                    requestPermissionn();


            }
        });

        Button kannadamanual = (Button) view.findViewById(R.id.kannadamanual);
        kannadamanual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url2,name);


                }
                else
                    requestPermissionn();

            }
        });




        return view;
    }
    public void requestPermissionn(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),Manifest.permission.WRITE_EXTERNAL_STORAGE)){
            new AlertDialog.Builder(getContext()).setTitle("permission needed").setMessage("this permission is needed because we have to download the file")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},REQUEST_CODE);

                        }
                    })
                    .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).create().show();



        }
        else{

            ActivityCompat.requestPermissions(getActivity(),new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},REQUEST_CODE);
        }
    }
    public void Downloadpdf(String url,String outputfilename){

        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
        request.setTitle("Manual");
        request.setDescription("Downloading "+"Manual");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.allowScanningByMediaScanner();
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,outputfilename);
        DownloadManager manager = (DownloadManager) getContext().getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);

    }
}