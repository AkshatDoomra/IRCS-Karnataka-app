package com.example.indianredcrossscoiety;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link bloodtransfusionsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class bloodtransfusionsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public bloodtransfusionsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment bloodtransfusionsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static bloodtransfusionsFragment newInstance(String param1, String param2) {
        bloodtransfusionsFragment fragment = new bloodtransfusionsFragment();
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
    final int REQUEST_CODE = 10;
    final String pdfUrl = "https://redcrosskarnataka.org/wp-content/uploads/2021/01/Blood-Donation-English.pdf";
    String name = "Blooddonation.pdf";

    final String pdfUrl2 = "https://redcrosskarnataka.org/wp-content/uploads/2021/01/Blood-Donation-Kanada.pdf";


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bloodtransfusions, container, false);
        TextView heading5 = (TextView) view.findViewById(R.id.heading5);
        heading5.setText("APPEAL");
        TextView heading5content = (TextView) view.findViewById(R.id.heading5content);
        heading5content.setText("Every day, several women die from pregnancy related complications like severe bleeding during delivery and after childbirth. Additionally, premature infants, patients of trauma, children with disorder of Blood like Thalassemia, Hemophilia etc, patients suffering from various types of cancers, chronic kidney disorders and various diseases needing major surgeries are a few instances were Blood and its components are of prime importance \n" +
                "There is no substitute for the Blood. It cannot even be manufactured artificially. Due to the unique nature of blood as a lifesaving and life sustaining Drug / Substance, providing safe blood is considered as a service. The Indian Red Cross Society, Blood Transfusion Services, has shouldered the responsibility jointly with the Government of Karnataka and other Non-Governmental organizations to provide safe blood to the poor and needy since 1969. \n" +
                "During the present situation of Covid-19, and continuous lockdown, we have been experiencing shortfall in the collection of Blood. So to cope up with this condition, we urge everyone to consider donating blood at blood donation camps conducted by us or at our blood center. Your sincere donation of each one unit of Blood May Serve those who are Your Near and Dear to You. Further, we assure that your noblest contribution of Blood will be used judiciously and it will reach the poorest of the poor community especially those awaiting treatment from the Gov. Hospitals located in remote places of Karnataka. \n" +
                "\n" +
                "To organize a Voluntary Blood donation Camp with us\n" +
                "\n" +
                " Contact: Mrs.Reshma Rai M. Blood Center coordinator. (M):9353743508 or Mr. Sumanth J K Camp Coordinator (M):8296795356.\n" +
                "\n" +
                "Why should blood donation camps be organized in association with Karnataka Red Cross Blood Bank?\n" +
                "\n" +
                "Red Cross is a social organization which helps the poor &needy in particular.\n" +
                "Metro cities like Bangalore are facing huge scarcity of Blood, due to covid-19\n" +
                "It will be helpful to us and society if you conduct voluntary blood donation dive under corporate social responsibility (CSR)activity.  \n" +
                "With warm regards, yours sincerely,\n" +
                "General Secretary I/C");
        TextView heading6 = (TextView) view.findViewById(R.id.heading6);
        heading6.setText("DO YOU KNOW ?");
        TextView heading6content = (TextView) view.findViewById(R.id.heading6content);
        heading6content.setText("There is no Substitute for blood transfusion\n" +
                "Blood can not be manufactured artificially .\n" +
                "Blood can only be obtained from human bodies.\n" +
                "Blood donation can saves precious lives\n" +
                "A healthy Person can donate once in 3 moths(male) 4 months Female\n" +
                "Each one of us have minimum 5 to 51/2 litters of Blood\n" +
                "While you denote you denote Just a Handful of Blood In a couple of weeks ,all aspects of blood are filled in donor body. \n" +
                "Each unit of donated blood can be used for upto three patients.  ");
        TextView heading7 = (TextView) view.findViewById(R.id.heading7);
        heading7.setText("WHO CAN AND CAN'T DONATE BLOOD");
        TextView subheading7 = (TextView) view.findViewById(R.id.subheading7);
        subheading7.setText("Who can donate the Blood");
        TextView subheading7content = (TextView) view.findViewById(R.id.subheading7content);
        subheading7content.setText("Healthy person, without major illness\n" +
                "Age group : 18 to 65 years.\n" +
                "Body weight minimum 45 kg and above .\n" +
                "Not on any medications");
        TextView subsubheading7 = (TextView) view.findViewById(R.id.subsubheading7);
        subsubheading7.setText("Who can not donate Blood");
        TextView subsubheading7content = (TextView) view.findViewById(R.id.subsubheading7content);
        subsubheading7content.setText("A person with major illness.\n" +
                "Person on regular medication.\n" +
                "History of: cancer, sexually transmitted diseases etc\n" +
                "Blood should not be denoted if donor had blood transfusion within six months\n" +
                "For women: Pregnancy, breast feeding and menstrual cycle.");
        TextView bloodtransfusionsinfo = (TextView) view.findViewById(R.id.bloodtranfusionsinfo);
        bloodtransfusionsinfo.setText("FOR FURTHER CLARIFICATION REGARDING ELIGIBILITY, PLEASE CONTACT : 080-22268435/22264205");

        TextView heading8 = (TextView) view.findViewById(R.id.heading8);
        heading8.setText("BLOOD DONATION FORMS");

        TextView heading9 = (TextView) view.findViewById(R.id.heading9);
        heading9.setText("ABOUT");

        TextView heading9content = (TextView) view.findViewById(R.id.heading9content);
        heading9content.setText("Despite its participation in blood bank services since 1960, the state branch in Bangalore had no Blood Storage Centre of its own. A few authorized entities were supplying blood against huge demand. Due to this, consumers were facing the risk of receiving blood from unsafe sources. Realizing this harsh reality the society started its own well equipped blood bank in the year 1991. During 2016 Karnataka Red Cross Blood Bank celebrated its silver jubilee. During the last 30 years the blood bank has grown fully, equipped with modern technological devices in place. The society has a sophisticated lab for testing collected blood, for separation into components, and storage in state of the Art blood storage devices. Additionally, there are motivated volunteers who are identifying and sourcing prospective blood donors.\n" +
                "\n" +
                "The Karnataka Branch of Indian Red Cross society is fully engaged in creating an awareness of the importance of blood donation. Blood is being collected from educational institutions, industries, corporate offices and from the individuals who voluntarily donate blood. Every unit of blood so collected is compulsorily subjected to testing. For this purpose the blood bank has already installed VITROS 3600 machine which ranks top in the modern context. Sri Manjunath Reddy, the then Mayor of Bengaluru had inaugurated the newly installed VITROS 3600 during October 2015.This machine has the capacity to give precise account of the blood test. This machine tests whether the blood is free from HIV, Hepatitis B and Hepatitis C. Malaria and Syphilis are also tested for. Only after subjecting the blood for total examination through this process, blood is issued to the needy, duly adhering to the guidelines of Drug Controller, Karnataka. \n" +
                "\n" +
                "Karnataka Red Cross State Branch has 9 blood banks and supplies blood to more than 25 blood storage units throughout the state. The society operates Blood Mobile Bus which is donated by Government of Karnataka. This vehicle has state of the Art facilities to collect blood from the donors. The blood bank unit is committed to serve on all 24 hours of a day.\n" +
                "\n" +
                "Karnataka Red Cross Blood Bank has also installed Apheresis – SDP facility at a affordable fees which is lowest in the state. Karnataka Red Cross Blood Bank has received good response from the general public.\n" +
                "\n" +
                "World Blood Donors Day and National Voluntary Blood Donation Day are celebrated. On these occasions, individual donors who have donated blood more than 25 occasions and volunteers who have motivated donors are identified and honored.");

        Button bloodenglishform = (Button) view.findViewById(R.id.bloodenglishform);
        Button bloodkanadaform = (Button) view.findViewById(R.id.bloodkanadaform);




        bloodenglishform.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                        Downloadpdf(pdfUrl,name);


                }
                else
                requestPermissionn();




            }
        });
        bloodkanadaform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(pdfUrl2,name);


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
        request.setTitle("Blood Donation Form");
        request.setDescription("Downloading "+"Blood Donation Form");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//        request.setAllowedOverRoaming(false);
        request.allowScanningByMediaScanner();
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,outputfilename);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        DownloadManager manager = (DownloadManager) getContext().getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);

    }
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        switch (requestCode) {
            case 10:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 &&
                        grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission is granted. Continue the action or workflow
                    // in your app.
                } else {
                    // Explain to the user that the feature is unavailable because
                    // the features requires a permission that the user has denied.
                    // At the same time, respect the user's decision. Don't link to
                    // system settings in an effort to convince the user to change
                    // their decision.
                }
                return;
        }
    }

}