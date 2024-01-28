package com.example.sistempakardaihatsuayla.fragment;

import static android.R.attr.content;
import static android.R.attr.x;
import static android.R.attr.y;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.sistempakardaihatsuayla.KonsultasiAct;
import com.example.sistempakardaihatsuayla.MainDiagnosaActivity;
import com.example.sistempakardaihatsuayla.R;
import com.example.sistempakardaihatsuayla.activity.DataKerusakanActivity;
import com.example.sistempakardaihatsuayla.activity.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BerandaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BerandaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    View diagnosa, data, map, kontak;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public BerandaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BerndaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BerandaFragment newInstance(String param1, String param2) {
        BerandaFragment fragment = new BerandaFragment();
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
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_beranda, null);

        diagnosa = (View) root.findViewById(R.id.btn_diagnosa);
        data = (View) root.findViewById(R.id.btn_data);
        map = (View) root.findViewById(R.id.map);
        kontak = (View) root.findViewById(R.id.btn_kontak);

        diagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), MainDiagnosaActivity.class));
            }
        });

        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(requireContext(), DataKerusakanActivity.class));
            }
        });



        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String uri = "geo:" + x + "," + y + "?q=Serba Mulia Auto Daihatsu Sorong";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(uri)));
            }
        });

        kontak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:082350892897"));
                startActivity(intent);
            }
        });

//        riwayat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(requireContext(), RiwayatActivity.class));
//            }
//        });
//        keluar.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
////                finish();
//                System.exit(0);
//            }
//        });
//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                SharePrep
//            }
//        });

//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                final AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
//                builder.setTitle("Exit");
//                builder.setMessage("Do you want to exit ??");
//                builder.setPositiveButton("Yes. Exit now!", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                       getActivity().onBackPressed();
////                        finish();
////                        android.os.Process.killProcess(android.os.Process.myPid());
////                        getActivity().finish();
////                        System.exit(0);
//                    }
//                });
//
//                builder.setNegativeButton("Not now", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                        dialogInterface.dismiss();
//                    }
//                });
//
//                AlertDialog dialog = builder.create();
//                dialog.show();
//            }
//        });


//        // on below line we are adding click listener for our button
//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // on below line we are finishing activity.
//                requireContext().finish();
//
//                // on below line we are exiting our activity
//                System.exit(0);
//            }
//        });



        return root;
    }

}