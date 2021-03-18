package com.example.lifoo_v11.src.PhotoPostActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lifoo_v11.R;
import com.example.lifoo_v11.src.PhotoPickActivity.PhotoPickActivity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.IOException;

// 파이어 베이스
public class PhotoPostActivity extends AppCompatActivity {

    ImageView back_btn;
    TextView Top_complete_btn;
    TextView Bottom_complete_btn;

    ImageView user_img;
    EditText title_et;
    EditText contents_et;


    private StorageReference mStorageRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_post);

        // 뒤로가기(PhotoPickActivity )
        back_btn = findViewById(R.id.photo_post_back_iv);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhotoPostActivity.this, PhotoPickActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // 완료(통신)
        Top_complete_btn = findViewById(R.id.photo_post_tv_complete_top);
        Top_complete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // uploadFile();
            }
        });
        Bottom_complete_btn = findViewById(R.id.photo_post_tv_complete_bottom);
        Bottom_complete_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // uploadFile();
            }
        });


        //
        user_img = findViewById(R.id.photo_post_user_img);

        // 사용자가 작성한 제목/콘텐
        title_et = findViewById(R.id.photo_post_et_title);
        contents_et = findViewById(R.id.photo_post_et_contents);

        mStorageRef = FirebaseStorage.getInstance().getReference();

    }

    


}