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
public class ItemFragment extends Fragment {

    // TODO: Customize parameters
    private int mColumnCount = 1;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ItemFragment newInstance(int columnCount) {
        ItemFragment fragment = new ItemFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemFragment() {
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
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        ArrayList<data.PlaceholderItem> an = new ArrayList<>();
        an.add(new data.PlaceholderItem("BLOOD CENTRE AND TRANSFUSION SERVICES","For organizing Blood Donation Camp: \n" +
                "Mrs. Reshma Rai M, Blood Center Coordinator\n" +
                "Mob: 9353743508\n" +
                "For Voluntary Blood Donation and Blood Requirements : 080-22268435\n" +
                "Email: ircsvbdc@gmail.com"));
        an.add(new data.PlaceholderItem("DISASTER REPONSE AND MANAGMENT","Disaster Management Department\n" +
                "Email: ircskar@gmail.com"));
        an.add(new data.PlaceholderItem("JUNIOR RED CROSS","Mr. Ananda D Gowda\n" +
                "State Coordinator\n" +
                "Junior Red Cross Division\n" +
                "Mob: 8660928288\n" +
                "Email: jrckar@gmail.com"));
        an.add(new data.PlaceholderItem("YOUTH RED CROSS","Mr. Dilip C.S.\n" +
                "Youth Red Cross Coordinator\n" +
                "Mob: 9538330511\n" +
                "Email: yrckar@gmail.com"));
        an.add(new data.PlaceholderItem("FIRST AID TRAINING","Mrs. Bhavitha B. Shetty\n" +
                        "First Aid Unit\n" +
                        "Mob: 080-222764205\n" +
                        "Email: ircsfau@gmail.com"));
        an.add(new data.PlaceholderItem("SERV","Disaster Management Coordinator\n" +
                "Email: ircsserv2018@gmail.com"));
        an.add(new data.PlaceholderItem("PARIPOSHANAM","Mr. Ananda D.G.\n" +
                "State Coordinator\n" +
                "Mob: 8600928288\n" +
                "Email: jrckar@gmail.com"));
        an.add(new data.PlaceholderItem("URBAN FAMILY WELFARE CENTRE","Dr. Tejaswini S.B.\n" +
                "Lady Medical Officer\n" +
                "Mob: 9880376666\n" +
                "Email: ircsnhm@gmail.com\n" +
                "\n" +
                "Mr. Prasanna Kumar C.\n" +
                "URBAN FAMILY WELFARE CENTRE\n" +
                "Mob: 9886972323"));
        an.add(new data.PlaceholderItem("RED CROSS OPTICAL",""));
        an.add(new data.PlaceholderItem("TB CONTROL PROJECT","T. B. Control Project India\n" +
                "Mob: 080-22268435\n" +
                "Email: ircskar@gmail.com"));


        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new MyItemRecyclerViewAdapter(an));
        }
        return view;
    }
}