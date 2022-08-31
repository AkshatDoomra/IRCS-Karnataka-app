package com.example.indianredcrossscoiety;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.indianredcrossscoiety.placeholder.PlaceholderContent;

import java.util.ArrayList;

/**
 * A fragment representing a list of Items.
 */
public class ItemFragment2 extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemFragment2() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemFragment2 newInstance(int columnCount) {
        ItemFragment2 fragment = new ItemFragment2();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list2, container, false);
        ArrayList<data.PlaceholderItem> a = new ArrayList<>();
        a.add(new data.PlaceholderItem("BENGALURU URBAN","District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Bengaluru Urban District Branch\n" +
                "D.C. Office Premises,\n" +
                "1st Floor, Kandaya Bhavan,\n" +
                "K.G. Road,\n" +
                "BENGALURU – 560 009"));
        a.add(new data.PlaceholderItem("BENGALURU RURAL","District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Bangalore Rural District Branch\n" +
                "Old Hospital Compound,\n" +
                "Doddaballapura – 561 203"));
        a.add(new data.PlaceholderItem("SHIMOGA","Dr. Dinesh. S\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Shivamogga District Branch,\n" +
                "Indian Red Cross Society Building\n" +
                "RTO Office Road,\n" +
                "Opp: to Press Trust Building,\n" +
                "DC Office Compound\n" +
                "Shivamogga – 577 204\n" +
                "Mob: 9964194698 / 9845353930\n" +
                "Email: redcrossshimoga@gmail.com"));
        a.add(new data.PlaceholderItem("RAMANAGARA","Sri. K. H. Chandrashekaraiah\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Ramanagara District Branch,\n" +
                "No: 4268, Main Road Extension\n" +
                "Opp: to T. B.\n" +
                "Ramanagara – 562 159\n" +
                "Mob: 9916337877"));
        a.add(new data.PlaceholderItem("CHIKKABALLAPUR","Sri. B.N. Ravikumar\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Chikkaballapura District Branch\n" +
                "Old District Hospital Premises\n" +
                "CHIKKABALLAPURA– 562101\n" +
                "Mob: 8494984545"));
        a.add(new data.PlaceholderItem("CHITRADURGA","Sri. Mazaharulla. N\n" +
                "District Secretary\n" +
                "Indian Red Cross Society\n" +
                "Chitradurga District Branch\n" +
                "C/O Flat No.10,\n" +
                "KSSIDC – I – E,\n" +
                "CHITRADURGA – 577 502\n" +
                "Mob: 7899187128"));
        a.add(new data.PlaceholderItem("DAVANANAGERE","Sri. C. A. Umesh Shetty\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Davanagere District Branch\n" +
                "Sri Shamanur Shivashankarappa Red Cross Bhavana,\n" +
                "#302, “A” Block, Devaraj Urs Layout,\n" +
                "Davanagere -577 006\n" +
                "Ph: 08192-252550\n" +
                "Mob: 9448155182"));
        a.add(new data.PlaceholderItem("KOLAR","Sri. S. Nandish Kumar\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Kolara District Branch,\n" +
                "1st Main Road, 1st Cross,\n" +
                "Sultamthippasandra,\n" +
                "Kolara – 563 101\n" +
                "Mob: 9448714809 / 8088075591"));
        a.add(new data.PlaceholderItem("TUMKUR","Dr. Veerabhadraiah T.A.\n" +
                "District Surgeon &\n" +
                "Hon. District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Tumkur District Branch,\n" +
                "Red Cross Bhavan, Ashoka Road,\n" +
                "TUMKUR – 572 101,\n" +
                "PH: 0816-2277988\n" +
                "Mob: 9449843179"));
        a.add(new data.PlaceholderItem("MYSORE","Sri. Vaidyanath S.S.\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Mysore District Branch,\n" +
                "District Disabled Rehabilitation Centre, Pulikeshi Road, Tilak Nagar,\n" +
                "MYSORE – 570001\n" +
                "Mob: 9886829899"));
        a.add(new data.PlaceholderItem("CHIKMAGALUR","Sri. Pavan D.S.\n" +
                "District Secretary \n" +
                "Indian Red Cross Society \n" +
                "Chikkamagalur District Branch \n" +
                "D.C. Office Premises\n" +
                "Hosmane Extension\n" +
                "Chikkamagalur – 577101\n" +
                "Mob: 8123406199"));
        a.add(new data.PlaceholderItem("CHAMARAJANAGAR","Dr. Mahesh M.\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Chamarajanagara District Branch,\n" +
                "District Hospital,\n" +
                "CHAMARAJANAGAR – 571 313\n" +
                "Ph: 08226-222067\n" +
                "Mob: 9449178896\n" +
                "Email: ircschamarajanagar@gmail.com"));
        a.add(new data.PlaceholderItem("DAKSHINA KANNADA","Sri. B.K. Kusumadhar DDLR (R)\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Dakshina Kannada District Branch\n" +
                "Red Cross Bhavan,\n" +
                "Behind DC Office Compound,\n" +
                "Mangalore -575 001\n" +
                "Mob: 9845789085\n" +
                "Email: ircsdkd@gmail.com"));
        a.add(new data.PlaceholderItem("HASSAN","Sri. Shabbir Ahamed\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Hassan District Branch,\n" +
                "Red Cross Bhavan, Front of Neharu Yuva Kendra, Salagame Road,\n" +
                "Hassan-573202\n" +
                "Mob: 9141516430"));
        a.add(new data.PlaceholderItem("KADAGU","Sri. H.R. Muralidhara\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Kodagu District Branch\n" +
                "“Shree Nilaya” Near A.V. School, Mahadevpet\n" +
                "Madikeri- 571 201\n" +
                "Kodagu\n" +
                "Mob: 9880154569"));
        a.add(new data.PlaceholderItem("MANDYA","Dr. K. M. Shivakumar\n" +
                "Medical Superintendent VIMS &\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Mandya District Branch,\n" +
                "P.E.S. Engineering College Road,\n" +
                "Near Zilla Panchayath,\n" +
                "Mandya – 571401\n" +
                "Ph: 08232-228730 / 400377\n" +
                "Email: ircsmdy@yahoo.com"));
        a.add(new data.PlaceholderItem("UDUPI","District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Udupi District Branch,\n" +
                "No. 4-3-19 G, Red Cross Bhavan, Red Cross Road, Ajjarkad,\n" +
                "UDUPI District – 576 101\n" +
                "Ph: 0820-2532222"));
        a.add(new data.PlaceholderItem("BELAGAVI","Dr. D. N. Misale\n" +
                "Hon. District Secretary\n" +
                "Indian Red Cross Society\n" +
                "Belagavi District Branch\n" +
                "Civil Hospital Compound\n" +
                "Next to OPD Block,\n" +
                "BELGAUM – 590 001\n" +
                "Mob: 9480398025"));
        a.add(new data.PlaceholderItem("BAGALKOT","Sri. Veeranna S. Athani,\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Bagalkote District Branch\n" +
                "No. 282, Near Belulmath, Station Road,\n" +
                "BAGALKOTE – 587 101\n" +
                "Mob: 900888875 / 6362900901"));
        a.add(new data.PlaceholderItem("VIJAYAPURA","Sri. S. G. Muranal,\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Vijayapura District Branch,\n" +
                "Plot No: 82, Sollapura Road, K. C. Nagar,\n" +
                "Near DCC Bank, Vijayapura\n" +
                "Mob: 9480534153"));
        a.add(new data.PlaceholderItem("DHARWAD","Dr. Umesh Hallikeri\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Dharwad District Branch,\n" +
                "Red Cross Building,\n" +
                "Near HPO, Station Road,\n" +
                "Dharwad – 580 001\n" +
                "Mob: 7019823205 / 0836-2444464"));
        a.add(new data.PlaceholderItem("GADAG","Dr. Mohd Sharif Samudri\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Gadag District Branch\n" +
                "C/o. DGM Ayurvedic Medical College\n" +
                "Kalasapur Road,\n" +
                "Gadag District.\n" +
                "Mob: 9964187315 / 8073041618"));
        a.add(new data.PlaceholderItem("HAVERI","Sri. M.C. Kolli\n" +
                "Hon. District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Haveri District Branch,\n" +
                "District Hospital Compound\n" +
                "Haveri District – 581 110\n" +
                "Mob: 9448354932 / 9844571149"));
        a.add(new data.PlaceholderItem("UTTARA KANNADA","Sri. Jagadeesha S. Birakodikara\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Karwar District Branch,\n" +
                "DHO Building Premises\n" +
                "Karwar – 581 301\n" +
                "Uttara Kannada District\n" +
                "Ph: 9845223743\n" +
                "Email: birkodi@gmail.com"));
        a.add(new data.PlaceholderItem("KALABURGI","Sri. Raveendra Shabadi\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Kalaburgi District Branch\n" +
                "Room No. 2A, Ground Floor,\n" +
                "Mini Vidhanasoudha,\n" +
                "D.C. Office Compound Premises,\n" +
                "Main Road,\n" +
                "Kalaburagi -585 102\n" +
                "Ph: 08472-255317\n" +
                "Mob: 9448204560"));
        a.add(new data.PlaceholderItem("BELLARY","Sri. M. A. Shakeeb,\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Bellari District Branch,\n" +
                "C/O Office of the District Commandant,\n" +
                "Karnataka Home Guards, Stadium Road,\n" +
                "Near RangaMandir,\n" +
                "BALLARI – 583 101\n" +
                "Mob: 9483641234 / 9845145046\n" +
                "Email: ircsbay@gmail.com"));
        a.add(new data.PlaceholderItem("BIDAR","Sri. Basavaraj P Bhatmurge\n" +
                "District Secretary\n" +
                "Indian Red Cross Society,\n" +
                "Bidar District Branch\n" +
                "R/O H-N 8-9-270/A-57/1\n" +
                "Gurunank Colony\n" +
                "BIDAR – 585 401\n" +
                "Mob: 9986531555 / 9538164402"));
        a.add(new data.PlaceholderItem("KOPPAL","Dr. Srinivas Hyati\n" +
                "District Secretary\n" +
                "Indian Red Cross Society\n" +
                "Koppal District Branch\n" +
                "1stFloor, New District Hospital Premises,\n" +
                "Hosapete Road,\n" +
                "Koppala – 583231\n" +
                "Ph: 08539-225088\n" +
                "Mobile: 9008996646\n" +
                "Email: ircskpl@gmail.com"));
        a.add(new data.PlaceholderItem("RAICHUR","Sri. Ataulla Advocate\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society,\n" +
                "Raichur District Branch,\n" +
                "C/O Nehru Yuvakendra,\n" +
                "Ashapura Road,\n" +
                "Raichur – 584 101\n" +
                "Mob: 8050227039"));
        a.add(new data.PlaceholderItem("YADAGIRI","Sri. Mallannagouda Halimani\n" +
                "District Secretary,\n" +
                "Indian Red Cross Society\n" +
                "Yadagiri District Branch,\n" +
                "Office of the Deputy Commissioner\n" +
                "Main Road,\n" +
                "Yadagiri – 585 202\n" +
                "Mob: 9886521808"));
        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter2(a));
        }
        return view;
    }
}