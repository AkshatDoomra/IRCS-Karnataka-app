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
 * Use the {@link YouthredcrossFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YouthredcrossFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public YouthredcrossFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment YouthredcrossFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static YouthredcrossFragment newInstance(String param1, String param2) {
        YouthredcrossFragment fragment = new YouthredcrossFragment();
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
    final String pdfUrl = "https://redcrosskarnataka.org/wp-content/uploads/2021/01/Youth-Red-Cross-Policy-Administrative-Directives-Program-Guidelines.pdf";
    String name = "Youth Red Cross.pdf";

    final String pdfUrl2 = "https://redcrosskarnataka.org/wp-content/uploads/2021/01/Youth-Red-Cross-Unit-Record-1.pdf";

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_youthredcross, container, false);

        TextView heading53 = (TextView) view.findViewById(R.id.heading53);
        heading53.setText("ABOUT YOUTH RED CROSS");
        TextView heading53content = (TextView) view.findViewById(R.id.heading53content);
        heading53content.setText("Indian Red Cross Society is a premier humanitarian organization which through its seven principles continued to do the activities which has been acclaimed by all sections of society nationally and internationally without any expectation.\n" +

                "Government of Karnataka has visualized the need for grooming the youths for the new generation and as come out with a historic order to enroll the youths by all colleges by affiliating to Indian Red Cross Society under the banner of Youth Red Cross. Each college is having a Youth Red Cross Unit and thereby the students of affiliated colleges become the ‘Ambassadors’ of Indian Red Cross Society, Karnataka State Branch.\n" +

                "We are reminded of the famous quote of Late Pandit Jawaharlal Nehru the former Prime Minister of India that “The youth of today is the driving force of tomorrow”. It is our duty to mould the youth to become socially useful citizens of the country.\n" +

                "Each generation passes on the torch of development to the next. Hence it becomes the challenge for the present generation to groom the future of tomorrow and that is the ‘Youth’. Youth Red Cross it is a group movement organized for students in colleges.\n" +

                "Member’s age group is 18 to 30 years, Registration fee for colleges is Rs.1500 (Onetime payment).\n" +
                "Student membership fee is Rs.50/- per annum.\n" +
                "Colleges have to send 30% of the membership fee Collected to the Indian Red Cross Society, Karnataka State Branch.\n" +
                "70% of the membership fee Collected has to be retained by the respective colleges to carry out the Youth Red Cross Activities.\n" +
                "Every College has a Programme Officer.\n" +
                "Each University has a Nodal Officer.\n" +
                "Each College has to open a separate Bank Accounts for Youth Red Cross, to be jointly operated by the principal and programme officer.\n" +

                "Youth Red Cross is a platform where youth can exhibit their talent, skills, knowledge, ability towards the welfare of the people and Primarily Youth Red Cross focuses on Health, Service & Friendship.");
        TextView heading54 = (TextView) view.findViewById(R.id.heading54);
        heading54.setText("ACTIVITIES OF YOUTH RED CROSS");
        TextView heading54content = (TextView) view.findViewById(R.id.heading54content);
        heading54content.setText("Promotion of Health, Awareness about HIV / AIDS\n" +
                "Awareness campaign on hazards of drug addiction\n" +
                "Awareness about Health programs, Service to others\n" +
                "Providing First Aid for wounded / sick, Relief work during emergencies\n" +
                "Dissemination of Red Cross Movement, Developing Friendship, State & National Integration Camps\n" +
                "Communal harmony, Literacy campaign / youth exchange program\n" +
                "Understanding & accepting of civil responsibilities.");
        TextView heading55 = (TextView) view.findViewById(R.id.heading55);
        heading55.setText("YOUTH RED CROSS POLICY, ADMINISTRATIVE DIRECTIVES & PROGRAM GUIDELINES");

        Button heading55button1 = (Button) view.findViewById(R.id.heading55button1);
        Button heading55button2 = (Button) view.findViewById(R.id.heading55button2);

        heading55button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(pdfUrl,name);


                }
                else
                    requestPermissionn();




            }
        });
        heading55button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(ContextCompat.checkSelfPermission(getContext(),Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED){

                    Downloadpdf(pdfUrl2,name);


                }
                else
                    requestPermissionn();



            }




        });
        TextView heading56 = (TextView) view.findViewById(R.id.heading56);
        heading56.setText("AFFILIATED UNIVERSITIES TO YOUTH RED CROSS");


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
        request.setTitle("Youth Red Corss");
        request.setDescription("Downloading "+"Youth Red Corss");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//        request.setAllowedOverRoaming(false);
        request.allowScanningByMediaScanner();
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,outputfilename);
        request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI | DownloadManager.Request.NETWORK_MOBILE);
        DownloadManager manager = (DownloadManager) getContext().getSystemService(Context.DOWNLOAD_SERVICE);
        manager.enqueue(request);

    }
}