package com.example.samfield.procreate;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class RegistrationFragment extends Fragment {
    private String[] courses = {
      "Select course",
      "Android Development",
      "Web Development",
      "Graphics Design",
      "Blogging",
      "Hardware",
      "Video Editing",
      "Digital Marketing"
    };

    public RegistrationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_registration,container,false);
        Spinner course = view.findViewById(R.id.course_dropdown);

        ArrayAdapter<CharSequence> myadd = new ArrayAdapter<CharSequence>(getActivity(),android.R.layout.simple_spinner_item,courses);
        myadd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        course.setAdapter(myadd);
        return view;
    }

}
