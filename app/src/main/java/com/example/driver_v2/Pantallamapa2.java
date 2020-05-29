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
import com.google.android.gms.maps.model.PolylineOptions;

public class Pantallamapa2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Object GoogleMap;
    private static final LatLng UPSLP=new LatLng(22.1223427, -100.9864421);
    private static final LatLng FUNDADORES=new LatLng(22.1521211, -100.9802512);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallamapa2);
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
                .add(UPSLP,FUNDADORES)
                .width(7)
                .color(Color.BLUE)
                .geodesic(true));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UPSLP,14));

        // Add a marker in Sydney and move the camera
        LatLng origen2 = new LatLng(22.1223427, -100.9864421);
        mMap.addMarker(new MarkerOptions().position(origen2).title("UPSLP"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(origen2));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origen2,11f));

        LatLng destino2 = new LatLng(22.1521211, -100.9802512);
        mMap.addMarker(new MarkerOptions().position(destino2).title("Plaza Fundadores"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(destino2));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(destino2,11f));


    }
}
