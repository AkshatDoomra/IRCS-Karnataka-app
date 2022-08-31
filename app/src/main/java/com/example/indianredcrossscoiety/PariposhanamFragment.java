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
 * Use the {@link PariposhanamFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PariposhanamFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PariposhanamFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PariposhanamFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PariposhanamFragment newInstance(String param1, String param2) {
        PariposhanamFragment fragment = new PariposhanamFragment();
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
    final String url1 = "https://redcrosskarnataka.org/wp-content/uploads/2021/02/Process-of-School-Registration-converted.pdf";
    final String url2 = "https://redcrosskarnataka.org/wp-content/uploads/2021/02/Application-for-student-enrollment.pdf";
    final String url3 = "https://redcrosskarnataka.org/wp-content/uploads/2021/02/Governamnet-order-ED-192-SLB-2017-Bangalore-Date-3rd-March-2020-2.pdf";
    final String url4 = "https://redcrosskarnataka.org/wp-content/uploads/2021/02/Order-Commissionar-Office-converted.pdf";
    String name = "School PARIPOSHANAM.pdf";
    final int REQUEST_CODE = 10;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pariposhanam, container, false);

        TextView heading34 = (TextView) view.findViewById(R.id.heading34);
        heading34.setText("PARIPOSHANAM");
        TextView heading34content = (TextView) view.findViewById(R.id.heading34content);
        heading34content.setText("Pariposhanam Program for High School Students, First Aid, Blood Donation, Personal Cleanliness, Environmental Protection, Ethics – Information Education Connectivity Program.");
        TextView heading35 = (TextView) view.findViewById(R.id.heading35);
        heading35.setText("BACKGROUND OF THE PROGRAM");
        TextView heading35content = (TextView) view.findViewById(R.id.heading35content);
        heading35content.setText("Personal cleanliness has become increasingly important in terms of changing lifestyle and environmental hygiene Students in school and college often find themselves suffering from common ailments due to ill health. Excessive urbanization and lack of proper facilities in rural areas have led to deteriorating conditions The Red Cross headquarters noted that at present there are not enough skilled first aid personnel to provide immediate assistance and assistance in the event of multiple emergencies, accidents, disasters, natural disasters, floods, earthquakes, etc. Moreover, the number of accidents in schools is increasing day by day and it is inevitable that all of us in the conscious civil society will be alerted\n" +
                "With the background of the Indian Red Cross, Karnataka State Branch wants to create awareness and awareness among high school students on disaster management, first aid, hand washing, scientific method, personal hygiene, donation, environmental protection, civic responsibilities and ethics.\n" +
                "Pariboshanam Information is a Referendum program, which is designed to keep this concern, and not just the program, but the people’s movement.");
        TextView heading36 = (TextView) view.findViewById(R.id.heading36);
        heading36.setText("AIM");
        TextView heading36content = (TextView) view.findViewById(R.id.heading36content);
        heading36content.setText("The high school students in Karnataka will be educated on the activities of the Red Cross organization at the high school level to effectively deal with the emergencies of daily life.");
        TextView heading37 = (TextView) view.findViewById(R.id.heading37);
        heading37.setText("OBJECTIVES");
        TextView heading37content = (TextView) view.findViewById(R.id.heading37content);
        heading37content.setText("\n" +
                "1. Raising general awareness of disaster management first aid\n" +
                "\n" +
                "2. Introduction to the history and function of the Indian Red Cross and Developing an understanding of humanitarian principles\n" +
                "\n" +
                "3. Provides an understanding of the scientific method of hand washing, the importance of blood donation, environmental protection and ethics");
        TextView heading38 = (TextView) view.findViewById(R.id.heading38);
        heading38.setText("CONCEPT");
        TextView heading38content = (TextView) view.findViewById(R.id.heading38content);
        heading38content.setText("If the mind of the child leaves a pure white sheet on which to draw the social, cultural and educational image of the child, their behavior will be enhanced, while their attitude and thinking will increase in value. When the plant is bent, the tree looks beautiful. The Indian Red Cross Karnataka State Branch, through this Junior Red Cross Wing, is raising awareness of the activities of the Red Cross organization, First Aid and Disaster Management among all high school students in Karnataka through the Junior Red Cross Wing The Pariboshanam Program is an attempt to raise awareness of life skills that most effectively deal with emergencies in their daily lives");
        TextView heading39 = (TextView) view.findViewById(R.id.heading39);
        heading39.setText("DETAILS OF THE PROGRAM");
        TextView heading39content = (TextView) view.findViewById(R.id.heading39content);
        heading39content.setText("The program is a four-day event at each school; this is a student friendly program. The program begins with the active participation of students, Awareness, song, program background and format will be explained. They will be educated on the history, functions and humanitarian principles of the Red Cross, Demonstrate to children the methods of bandages first and foremost about first aid and its uses and then allow them to practice. Use items near children providing knowledge on how first aid can be done, Short lectures on personal hygiene and scientific topics, Then you will be convinced of best practices through discussion / dialogue. All students will be sworn in at the end of the program. In this way, the program is prepared to be visually oriented");
        TextView heading40 = (TextView) view.findViewById(R.id.heading40);
        heading40.setText("MULTIMEDIA EDUCATION");
        TextView heading40content = (TextView) view.findViewById(R.id.heading40content);
        heading40content.setText("Various murals will be on display at the venue, Printed leaflets on the importance of hand washing will be provided for more information, and Short screenings will also be made to make the program more interesting, A quiz program on hand washing will also be conducted at the end of the program");
        TextView heading41 = (TextView) view.findViewById(R.id.heading41);
        heading41.setText("THE PRESENTATION OF THE PROGRAM");
        TextView heading41content = (TextView) view.findViewById(R.id.heading41content);
        heading41content.setText("The program is aimed at opening all high schools in Karnataka with the help of youth Red Cross units with the help of nodal officers / executive officers / volunteers. It will also be a multi-faceted endeavor to implement compliance programs in partnership with the community.");
        TextView heading42 = (TextView) view.findViewById(R.id.heading42);
        heading42.setText("OUTCOMES");
        TextView heading42content = (TextView) view.findViewById(R.id.heading42content);
        heading42content.setText("\n" +
                "Awareness of disaster management and first aid can prevent many disasters\n" +
                "\n" +
                "Awareness of the history and functions of the Indian Red Cross can help students to develop a service spirit.\n" +
                "\n" +
                "Implementation of the scientific method of hand washing will increase personal hygiene in pupils and more in-school attendance and improve child health");
        TextView heading43 = (TextView) view.findViewById(R.id.heading43);
        heading43.setText("FOLLOW-UP STRATEGIES");
        TextView heading43content = (TextView) view.findViewById(R.id.heading43content);
        heading43content.setText("Information about pre- and post-natal effects of each program is provided. Program reports are collected, analyzed and guided by the program reports for specification. In this way, with supervisory strategies will lead to program effectiveness");
        TextView heading44 = (TextView) view.findViewById(R.id.heading44);
        heading44.setText("GUIDELINES OF PARIPOSHANAM");
        TextView subheading44 = (TextView) view.findViewById(R.id.subheading44);
        subheading44.setText("Process of School Registration");
        TextView subsubheading44 = (TextView) view.findViewById(R.id.subsubheading44);
        subsubheading44.setText("Applications for schools and Student enrolment");
        TextView subsubsubheading44 = (TextView) view.findViewById(R.id.subsubsubheading44);
        subsubsubheading44.setText("Govt Order from primary & Secondary Education Department of Karnataka State");
        TextView subsubsubsubheading44 = (TextView) view.findViewById(R.id.subsubsubsubheading44);
        subsubsubsubheading44.setText("CP Order");

        Button subheading44button = (Button) view.findViewById(R.id.subheading44button);
        Button subsubheading44button = (Button) view.findViewById(R.id.subsubheading44button);
        Button subsubsubheading44button = (Button) view.findViewById(R.id.subsubsubheading44button);
        Button subsubsubsubheading44button = (Button) view.findViewById(R.id.subsubsubsubheading44button);

        subheading44button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url1,name);


                }
                else
                    requestPermissionn();

            }
        });
        subsubheading44button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url2,name);


                }
                else
                    requestPermissionn();

            }
        });
        subsubsubheading44button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url3,name);


                }
                else
                    requestPermissionn();

            }
        });
        subsubsubsubheading44button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(url4,name);


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
        request.setTitle("PARIPOSHANAM");
        request.setDescription("Downloading "+"PARIPOSHANAM");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.allowScanningByMediaScanner();
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,outputfilename);
        DownloadManager manager = (DownloadManager) getContext().getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);

    }
}