package com.example.demohealthapp.ui.devices;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.demohealthapp.R;
import com.example.demohealthapp.databinding.FragmentDevicesBinding;
import com.google.android.material.button.MaterialButton;

import java.io.IOException;
import java.util.Set;

public class DevicesFragment extends Fragment {

    private DevicesViewModel devicesViewModel;
    private FragmentDevicesBinding binding;

    private static final int REQUEST_ENABLE_BT = 0;

    BluetoothAdapter mBluetoothAdapter;
    BluetoothDevice mmDevice;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();


        if (mBluetoothAdapter == null) {
            Toast.makeText(getActivity(), "Bluetooth unavailable", Toast.LENGTH_LONG).show();
        }

        devicesViewModel =
                new ViewModelProvider(this).get(DevicesViewModel.class);

        binding = FragmentDevicesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDevices;
        devicesViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) { textView.setText(s); }
        });
        return root;

    }

//connectbtn click
    public void onStart(){
        super.onStart();
        MaterialButton connectbtn = (MaterialButton) getView().findViewById(R.id.connectbtn);
        connectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!mBluetoothAdapter.isEnabled()) {
                    Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                    startActivityForResult(intent, REQUEST_ENABLE_BT);
                } else {
                    Toast.makeText(getActivity(), "Bluetooth is already on", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}