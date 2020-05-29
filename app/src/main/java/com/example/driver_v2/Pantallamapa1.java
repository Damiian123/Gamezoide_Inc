package com.example.driver_v2;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class Pantallamapa1 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Object GoogleMap;
    private static final LatLng DALIAS=new LatLng(22.1235857, -100.9389847);
    private static final LatLng SENDERO=new LatLng(22.1308141, -100.9267942);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallamapa1);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addPolyline(new PolylineOptions()
        .add(DALIAS,SENDERO)
        .width(5)
        .color(Color.RED)
        .geodesic(true));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(DALIAS,14));

        LatLng origen1 = new LatLng(22.1235857, -100.9389847);
        mMap.addMarker(new MarkerOptions().position(origen1).title("Dalias, 1810"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(origen1));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origen1,11f));

        LatLng destino1 = new LatLng(22.1308141, -100.9267942);
        mMap.addMarker(new MarkerOptions().position(destino1).title("Plaza Sendero"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(destino1));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(destino1,11f));

        /*GoogleMap map = null;
        // ... get a map.
        // Add a thin red line from London to New York.
        Polyline line = map.addPolyline(new PolylineOptions()
                .add(new LatLng(22.1235857, -100.9389847), new LatLng(22.1308141, -100.9267942))
                .width(5)
                .color(Color.RED));*/
    }
}
