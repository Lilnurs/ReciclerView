package com.example.reciclerview.recyler;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reciclerview.R;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    private ArrayList<String>contactsList = new ArrayList<>();
    private RecyclerView rvContacts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
        loadData();
        ContactsAdapter contactsAdapter = new ContactsAdapter(contactsList);
        rvContacts.setAdapter(contactsAdapter);
    }


    public void init(){
        rvContacts = requireActivity().findViewById(R.id.rv_contacts);
    }

    private void loadData() {
        contactsList.add("Ali");
        contactsList.add("Delya");
        contactsList.add("Elnur");
        contactsList.add("Putin");
        contactsList.add("Abama");
        contactsList.add("Trump");
        contactsList.add("Sadyr");
        contactsList.add("Sadyr");
        contactsList.add("Sadyr");
        contactsList.add("Sadyr");
        contactsList.add("Sadyr");
    }


}