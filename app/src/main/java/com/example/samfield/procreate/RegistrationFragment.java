package com.example.samfield.procreate;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


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
    private Button mRegbtn ;
    private EditText mName;
    private EditText mEmail;
    private EditText mPassword;
    private EditText mConfirmPassword;
    private Spinner mCourse;
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

    @Override
    public void onStart() {
        super.onStart();

        mRegbtn = getView().findViewById(R.id.registration_button);
        mName = getView().findViewById(R.id.name);
        mEmail = getView().findViewById(R.id.email);
        mPassword = getView().findViewById(R.id.password);
        mConfirmPassword = getView().findViewById(R.id.confirmpassword);
        mCourse = getView().findViewById(R.id.course_dropdown);

        mRegbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Reg button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
