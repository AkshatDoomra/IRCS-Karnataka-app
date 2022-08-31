package com.example.indianredcrossscoiety.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.indianredcrossscoiety.R;
import com.example.indianredcrossscoiety.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);
//
//        binding = FragmentHomeBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();

        View view = inflater.inflate(R.layout.fragment_home,container,false);

        //Intent intent1 = new Intent(this, HistoryFragment.class);
//        root.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                HistoryFragment historyFragment = new HistoryFragment();
//                FragmentTransaction transaction = getFragmentManager().beginTransaction();
//                transaction.replace(R.id.replace,historyFragment);
//                transaction.commit();
//            }
//        });

        CardView homebutton1 = (CardView) view.findViewById(R.id.homebutton1);
        homebutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_History_ircs3);

//                NavController navController = NavHostFragment.findNavController(HomeFragment.this);
//
//                navController.popBackStack();



//                Fragment historyFragment = new HistoryFragment();
//                Fragment homeFragment = new HomeFragment();
//                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
//                transaction.replace(R.id.replacee,historyFragment);
//
//                transaction.commit();




            }
        });
        CardView homebutton2 = (CardView) view.findViewById(R.id.homebutton2);
        homebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_youth_redcross);






            }
        });
        CardView homebutton3 = (CardView) view.findViewById(R.id.homebutton3);
        homebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_donate_blood);






            }
        });
        CardView homebutton4 = (CardView) view.findViewById(R.id.homebutton4);
        homebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_home_contactus);
            }
        });


//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

//        return root;
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}