package com.example.unique_erp;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends Fragment {
    Button save;
    EditText name, email, course, mobile;

    public registration() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle readdInstanceState) {
        super.onCreate(readdInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle readdInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_registration, container, false);

        final DatabaseHelper helper = new DatabaseHelper(getActivity());
        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        course = view.findViewById(R.id.course);
        mobile = view.findViewById(R.id.mobile);
        view.findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!name.getText().toString().isEmpty() && !email.getText().toString().isEmpty() && !course.getText().toString().isEmpty() && !mobile.getText().toString().isEmpty()) {
                    if (!helper.insert(name.getText().toString(),email.getText().toString(),course.getText().toString(),mobile.getText().toString())) {
                        Toast.makeText(getActivity(), "NOT Inserted", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getActivity(), "Inserted", Toast.LENGTH_LONG).show();
                    }
                } else {
                    name.setError("Enter NAME");
                    email.setError("Enter email");
                    course.setError("Enter course");
                    mobile.setError("Enter mobile");
                }
            }
        });
        return view;
    }
}
