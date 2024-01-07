package com.myapp.UserInterface;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.myapp.project.R;

public class ChallengerActivity extends AppCompatActivity {

    private static final int CAMERA_PERMISSION_REQUEST_CODE = 0;
    private CameraManager cameraManager;
    private String cameraId;
    private CameraDevice cameraDevice;
    private TextureView textureView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenger);

        textureView = findViewById(R.id.textureView);

        cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);

        try {
            cameraId = cameraManager.getCameraIdList()[0]; // Assuming you want to use the first camera
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

        Button captureButton = findViewById(R.id.captureButton);
        captureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

    }
    private void openCamera() {
        try {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
                cameraManager.openCamera(cameraId, new CameraDevice.StateCallback() {
                    @Override
                    public void onOpened(@NonNull CameraDevice camera) {
                        cameraDevice = camera;
                        // Start camera preview or switch to video mode here
                    }

                    @Override
                    public void onDisconnected(@NonNull CameraDevice camera) {
                        cameraDevice.close();
                    }

                    @Override
                    public void onError(@NonNull CameraDevice camera, int error) {
                        cameraDevice.close();
                    }
                }, null);
            } else {
                // Request camera permission
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_PERMISSION_REQUEST_CODE);
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
}
