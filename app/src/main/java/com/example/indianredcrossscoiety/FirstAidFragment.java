package com.example.indianredcrossscoiety;

import android.Manifest;
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
 * Use the {@link FirstAidFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstAidFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstAidFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstAidFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstAidFragment newInstance(String param1, String param2) {
        FirstAidFragment fragment = new FirstAidFragment();
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
    final String pdfUrl = "https://morth.nic.in/sites/default/files/circulars_document/Notification_dated_21.01.2016_regarding_Good_Samaritan.pdf";
    String name = "goveNotigication.pdf";

    final String pdfUrl2 = "https://redcrosskarnataka.org/wp-content/uploads/2021/01/Attendance-Sheets-PDF.pdf";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first_aid, container, false);

        TextView heading45content = (TextView) view.findViewById(R.id.heading45content);
        heading45content.setText("Johannes Friedrich August von Esmarch was a German surgeon who is best known for his contributions to military surgery including his introduction of the use of the first-aid bandage on the battlefield");
        TextView heading46 = (TextView) view.findViewById(R.id.heading46);
        heading46.setText("About First aid");
        TextView heading46content = (TextView) view.findViewById(R.id.heading46content);
        heading46content.setText("First aid is a basic medical care given in good faith to a sick or injured person to maintain life and prevent further injury until professional medical care becomes available and takes over.\n" +
                "\n" +
                "Indian Red Cross society Karnataka State Branch has been empowered by IRCS ,NHQ to provide and to train First Aid training course to the selected areas of operation MNC Companies factory students & general public since 2011.");
        TextView heading47 = (TextView) view.findViewById(R.id.heading47);
        heading47.setText("Be a Good Samaritan");
        TextView heading47content = (TextView) view.findViewById(R.id.heading47content);
        heading47content.setText("A Good Samaritan is a person who, in good faith, without expectation of payment or reward and without any duty of care or special relationship, voluntarily comes forward to administer immediate assistance or emergency care to a person injured in an accident, or crash, or emergency medical condition, or emergency situation.");
        TextView heading48 = (TextView) view.findViewById(R.id.heading48);
        heading48.setText("What is good Samaritan law sayS");
        TextView heading48content = (TextView) view.findViewById(R.id.heading48content);
        heading48content.setText("The Good Samaritan Law allows a person, without expectation of payment or reward and without any duty of care or special relationship, voluntarily come forward to administer immediate assistance or emergency care to a person injured in an accident, or crash, or emergency medical condition. Good Samaritan Law protects Good Samaritans from harassment on the actions being taken by them to save the life of the road accident victims");
        TextView heading49 = (TextView) view.findViewById(R.id.heading49);
        heading49.setText("Government Of INDIA Implementing a Good Samaritan Law");

        TextView heading50 = (TextView) view.findViewById(R.id.heading50);
        heading50.setText("Importance of First Aid");
        TextView heading50content = (TextView) view.findViewById(R.id.heading50content);
        heading50content.setText("It affords people with the ability to provide help during various emergency situations. First aid helps ensure that the right methods of administering medical assistances are provided. Knowledge in first aid also benefits the individuals themselves.");
        TextView heading51 = (TextView) view.findViewById(R.id.heading51);
        heading51.setText("First Aid Procedure");
        TextView heading51content = (TextView) view.findViewById(R.id.heading51content);
        heading51content.setText("DETAILS OF THE FIRST AID TRAINING & FORMS FILLING PORCUDER\n" +
                "First Aid Proficiency & allied subjects Certificates.\n" +
                "\n" +
                "Types of First Aid Training\n" +
                "\n" +
                "Certifications of Professional First Aid Training\n" +
                "Senior First Aid (SFA) 03 years validity\n" +
                "Voucher First Aid (VFA) 05 years validity\n" +
                "Medallion First Aid (MFA) life long\n" +
                "This course will be useful for Police personnel / Home guards /Employees of factories / Government and private companies / College students, and General public.\n" +
                "\n" +
                "1. If the companies wish the training to be held at their own premises, I R C S will do so. For this, above conveyance charges will apply\n" +
                "2. Company should be informed to us before 15 days for Conducting the training program.\n" +
                "3. Candidates Name should be filled in capital letters & every day he/she should be signed in the attendance sheet. (Black pen)\n" +
                "4. Fees: – As per the guidelines of the National Head Quarters the course fee is Rs. 1000/- per candidate.\n" +
                "5. A batch consists of minimum 30 candidates.\n" +
                "10.Candidates should compulsorily bring two Stamp Size photographs.\n" +
                "6. Thus total number of hours per course will be 16.\n" +
                "7. Course fee should be paid through Cheque /Demand draft in favour of Indian Red Cross Society First Aid Unit.\n" +
                "8. The attendance sheet should be filled by the candidates with mobile number mention is mandatory\n" +
                "9. All candidates should respond when he/she is contacted by National Head Quarters, if fail to respond entire certificate will not be issued from NHQ.\n" +
                "10. Lecturer and Examiner should mention their contact number to respond any call from NHQ.\n" +
                "11. Original certificates will be issued from National Head Quarters, New Delhi, approximately within 6 months from the date of examination.\n" +
                "\n" +
                "\n" +
                "All correspondence should be done through The General Secretary, Indian Red Cross Society,\n" +
                "KSB, # 26 Red Cross Bhavan, 1st Floor, Race Course Road, Bengaluru -560 001.\n" +
                "\n" +
                "For any further details, please contact the office 080-22264205 / 22268435");
        TextView heading52 = (TextView) view.findViewById(R.id.heading52);
        heading52.setText("Attendance sheets");

        Button heading49button = (Button) view.findViewById(R.id.heading49button);
        heading49button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(pdfUrl,name);


                }
                else
                    requestPermissionn();

            }
        });
        Button heading52button = (Button) view.findViewById(R.id.heading52button);
        heading52button.setOnClickListener(new View.OnClickListener() {
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
}