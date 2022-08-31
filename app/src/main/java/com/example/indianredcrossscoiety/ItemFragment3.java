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
public class ItemFragment3 extends Fragment {

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemFragment3() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemFragment3 newInstance(int columnCount) {
        ItemFragment3 fragment = new ItemFragment3();
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
        View view = inflater.inflate(R.layout.fragment_item_list3, container, false);

        ArrayList<data.PlaceholderItem> n = new ArrayList<>();

        n.add(new data.PlaceholderItem("Bangalore University","Dr. Satish Gowda,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Bangalore University\n" +
                "Assistant Professor, University Law College, Jnanabharathi Campus,\n" +
                "Bangalore-560056\n" +
                "Bangalore Urban District.\n" +
                "Mob: 9916007211/ Off: 080-23214685\n" +
                "Email: nsathishgowda@gmail.com"));
        n.add(new data.PlaceholderItem("Rani Channamma University","Dr. Vijayalaxmi Shigehalli\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Rani Channamma University\n" +
                "Dept. of Mathematics\n" +
                "Rani Channamma University,\n" +
                "Vidyasangam,\n" +
                "Balgaum District-591156\n" +
                "Mob: 9880473927\n" +
                "Email : yrcrcub@gmail.com"));
        n.add(new data.PlaceholderItem("Devanagere University","Dr. Kotresha D.\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Davanagere University\n" +
                "Associate Professor\n" +
                "Dept of Studies in Botany\n" +
                "Shivagangothri\n" +
                "Davangere- 577007\n" +
                "Mobile:91-8147319004\n" +
                "E-mail: dkotresh@davangereuniversity.ac.in"));
        n.add(new data.PlaceholderItem("Akkamahadevi University","Dr. Chandrashekar M Mathapati,\n" +
                "Youth Red Cross Nodal Officer, Karnataka State Akkamahadevi Women’s University,\n" +
                "Vijayapura-586108\n" +
                "Mob;9844901999\n" +
                "Email: chandu.math@gmail.com"));
        n.add(new data.PlaceholderItem("Gulbarga University","Prof. Basavaraj Sannakki,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Gulbarga University,\n" +
                "Jnanaganga-585 106\n" +
                "Gulbarga\n" +
                "Mob: 94492 92894\n" +
                "Off: 08472-263202\n" +
                "Email: sannakki.phy@gmail.com"));
        n.add(new data.PlaceholderItem("Department of Technical Education","The Director,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Department of Technical Education,\n" +
                "Palace Road,\n" +
                "Bengalore-560 001,\n" +
                "Bangalore District\n" +
                "Email: director182016@gmail.com"));
        n.add(new data.PlaceholderItem("Dayananda Sagar University","Dr. Sharmila Jayapalan\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Dayananda Sagar University,\n" +
                "Shavige Malleshwara Hills,1st Stage,\n" +
                "Kumaraswamy Layout,\n" +
                "Benglaluru – 560078\n" +
                "Mob: 9606253062\n" +
                "Email: sharmilajayapalan2007@gmail.com"));
        n.add(new data.PlaceholderItem("BLDE(Deemed to be University)","Dr. S.P. Guggarigoudar,\n" +
                "Youth Red Cross Nodal Officer &\n" +
                "Dean, Faculty of Medicine and Principal\n" +
                "BLDE (Deemed to be University)\n" +
                "Smt. Bagaramma Sajjan Campus, Dr. B.M Patil Road (Solapur Road)\n" +
                "Vijayapura (Bijapura)-586103\n" +
                "Mob: 9880287030\n" +
                "Email: Bmpmc.principal@bldedu.ac.in"));
        n.add(new data.PlaceholderItem("Bangalore Central University","Prof. Srikanta A.S\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Bangalore Central University\n" +
                "Department of Chemistry and Bio Chemistry,\n" +
                "Vijaya College,\n" +
                "R.V. Road,\n" +
                "Bangalore-560004\n" +
                "Mob: 9481481545\n" +
                "Email : srikantaakumalla7@gmail.com"));
        n.add(new data.PlaceholderItem("Kuvempu University","Dr. Gajanana Prabhu\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Kuvempu University,\n" +
                "Jnana Sahyadri,\n" +
                "Shankaraghatta-577451\n" +
                "Shivamogga District.\n" +
                "Mob: 9845311458\n" +
                "Email: prabhuji888@gmail.com"));
        n.add(new data.PlaceholderItem("Mangalore University","Dr. Ganapathi Gowda\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Mangalore University,\n" +
                "Department of History.\n" +
                "University College,\n" +
                "Mangalore- 575001\n" +
                "Mob: 9480448721\n" +
                "Email: ganapathigowda@yahoo.co.in"));
        n.add(new data.PlaceholderItem("Vishweshwaraiah Technological University","Sri. Vinay Kumar Hittalamani\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "VisvesvarayaTechnological University,\n" +
                "“Jnana Sangama”,\n" +
                "Belgagavi-590 018,\n" +
                "Belgaum District.\n" +
                "Mob: 7406091923\n" +
                "Off:08312498251\n" +
                "vinaykumar103@gmail.com"));
        n.add(new data.PlaceholderItem("Karnataka State Law University","Prof. Bheemabai. S. Mulage\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Assistant Professor,\n" +
                "Karnataka State Law University,\n" +
                "KSLU’s Law School,\n" +
                "Hubballi\n" +
                "Ph: 99647 39066/0836-2222392\n" +
                "Email: sunilbgd@gmail.com"));
        n.add(new data.PlaceholderItem("Rajiv Gandhi University of Health and Science Karnataka","Dr. Vasantha Shetty,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Rajiv Gandhi University of Health Sciences Karnataka\n" +
                "4th T Block,Jayanagar,\n" +
                "Bengaluru-560041,\n" +
                "Bengaluru District\n" +
                "Email: registrar@rguhs.ac.in\n" +
                "Ph: 080-26961928/1947"));
        n.add(new data.PlaceholderItem("Pes University","Dr. Seema\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "PES University\n" +
                "Outer Ring Road, Banashankari, 3rd Stage, Banashankari, Bengaluru – 560085\n" +
                "Mob: 9343411808\n" +
                "Email: seema@pes.edu"));
        n.add(new data.PlaceholderItem("Bangalore North University","Dr. K. Narayan\n" +
                "Youth Red Cross Nodal Officer\n" +
                "Bangalore North University\n" +
                "Govt. First Grade College\n" +
                "K.R. Puram\n" +
                "Bengaluru-560036\n" +
                "Mob: 8073936448\n" +
                "Email : knarayana67@gmail.com"));
        n.add(new data.PlaceholderItem("Tumkur University","Dr. Parashurama K.G\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Tumkur University,\n" +
                "University office, B.H.Road,\n" +
                "Tumkur-572 103,\n" +
                "Tumkur District\n" +
                "Mob: 9900412819\n" +
                "Email: p_ram_bdvt@rediffmail.com"));
        n.add(new data.PlaceholderItem("Sri Krishnadevaraya University","Dr. Shashianth H. Majagi\n" +
                "Youth Red Cross Nodal Officer\n" +
                "Sri. Krishnadevaraya University\n" +
                "Associate Professor\n" +
                "VSK University,\n" +
                "Ballari-583105\n" +
                "Mob: 9986064176\n" +
                "Email: smajgi@rediffmail.com"));
        n.add(new data.PlaceholderItem("Karnataka University","Dr. S. G. Chalavadi,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Karnataka University,\n" +
                "Pavate Nagar,\n" +
                "Dharwad-580 003,\n" +
                "Dharwad District.\n" +
                "Mob: 8970276353\n" +
                "Office: 0836-2215257\n" +
                "Email: drsgchalawad@gmail.com\n"));
        n.add(new data.PlaceholderItem("University of Mysore","Dr. Divakar Chandy,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "University of Mysore\n" +
                "University Evening College,\n" +
                "Vishwavidyalaya Karya Soudha,\n" +
                "Craford Bhavan,\n" +
                "Mysore-570 005\n" +
                "Ph: 99865 30122\n" +
                "Email: diwakarchandy1@gmail.com\n"));
        n.add(new data.PlaceholderItem("University of Agricutural Sciences, Bangalore","Prof. Harinikumar,\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "University of Agricultural Sciences, Bangalore\n" +
                "GKVK, Bangalore\n" +
                "Mob: 9448832077\n" +
                "Email: harinikumarkm@gmail.com\n"));
        n.add(new data.PlaceholderItem("Agriculture University, Raichur","Prof. Rajanna\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Agriculture University,\n" +
                "UAS Campus, Lingasugur Road,\n" +
                "Raichur-584104\n" +
                "Mob: 9448807931\n" +
                "Email: rajannauas@gmail.com\n"));
        n.add(new data.PlaceholderItem("Nitte University","Dr. Latha\n" +
                "Youth Red Cross Nodal Officer,\n" +
                "Associate professor and HOD\n" +
                "Nitte Usha Institute of Nursing Sciences, Kotekat Beeti Road,\n" +
                "Deralakatte, Mangalore-575018\n" +
                "Mob: 9964372646\n" +
                "Email: latha@nitte.edu.in"));


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter3(n));
        }
        return view;
    }
}