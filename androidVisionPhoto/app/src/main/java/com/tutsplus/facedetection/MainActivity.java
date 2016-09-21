package com.tutsplus.facedetection;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;

/**
 * Created by Paul on 11/4/15.
 * https://code.tutsplus.com/tutorials/an-introduction-to-face-detection-on-android--cms-25212
 * https://developer.android.com/training/multiple-threads/define-runnable.html
 * https://developers.google.com/android/reference/com/google/android/gms/vision/package-summary
 *
 * tu peux tester avec face female1 male1 et male2 ca marche tjrs pas mal du tout
 */
public class MainActivity extends AppCompatActivity {

    private FaceOverlayView mFaceOverlayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFaceOverlayView = (FaceOverlayView) findViewById( R.id.face_overlay );

        InputStream stream = getResources().openRawResource( R.raw.male2 );

        Bitmap bitmap = BitmapFactory.decodeStream(stream);
        mFaceOverlayView.setBitmap(bitmap);

    }

}
