//region
/***************************************************************************************************
 * My Nano Degree Apps
 * <p/>
 * Main Module:
 * Sub Module: MainActivity
 * <p/>
 * Modification Log:
 * ---------------------------------------------------------------------------------------------------
 * Version                 Modified By                 When                    Change
 * 1.0                    Gopi J                      01/01/2016              Initial Version
 **************************************************************************************************/
//endregion

//region Package(s)
package com.nanodegree.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//endregion

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //region Private Variables
    private Button btnSpotifyStreamer;
    private Button btnScoresApp;
    private Button btnLibraryApp;
    private Button btnBuildItBigger;
    private Button btnXYZReader;
    private Button btnCapStoneMyOwnApp;
    private final String MAIN_ACTIVITY = "MAIN_ACTIVITY";
    // endregion

    // region Protected Method(s)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initilizeControls();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }
    //endregion

    // region Public Method(s)
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer:
                invokeSpotifyStreamer();
                break;
            case R.id.btnScoresApp:
                invokeScoresApp();
                break;
            case R.id.btnLibraryApp:
                invokeLibraryApp();
                break;
            case R.id.btnBuildItBigger:
                invokeBuildItBigger();
                break;
            case R.id.btnXYZReader:
                invokeXYZReader();
                break;
            case R.id.btnCapStoneMyOwnApp:
                invokeCapStoneMyOwnApp();
                break;
            default:
                break;
        }
    }
    //endregion

    // region Private Method(s)
    private void initilizeControls() {
        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnCapStoneMyOwnApp = (Button) findViewById(R.id.btnCapStoneMyOwnApp);
        setOnClickListener();

    }

    private void setOnClickListener(){
        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapStoneMyOwnApp.setOnClickListener(this);
    }

    private void invokeSpotifyStreamer() {
        try {
            Toast.makeText(this,"This button will launch SpotifyStreamer app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }

    private void invokeScoresApp() {
        try {
            Toast.makeText(this,"This button will launch Scores app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }

    private void invokeLibraryApp() {
        try {
            Toast.makeText(this,"This button will launch Library app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }

    private void invokeBuildItBigger() {
        try {
            Toast.makeText(this,"This button will launch Build-It-Bigger app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }

    private void invokeXYZReader() {
        try {
            Toast.makeText(this,"This button will launch XYZ-Reader app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }

    private void invokeCapStoneMyOwnApp() {
        try {
            Toast.makeText(this,"This button will launch CapStoneMyOwn app",Toast.LENGTH_SHORT).show();
        }catch (Exception ex) {
            Log.e(MAIN_ACTIVITY,ex.getMessage());
        }
    }
    //endregion
}
