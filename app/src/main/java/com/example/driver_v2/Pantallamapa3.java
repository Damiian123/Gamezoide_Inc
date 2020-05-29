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

public class Pantallamapa3 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Object GoogleMap;
    private static final LatLng ALAMEDA=new LatLng(22.1558788, -100.9730761);
    private static final LatLng DORADO=new LatLng(22.155778, -101.0045132);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallamapa3);
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
                .add(ALAMEDA,DORADO)
                .width(8)
                .color(Color.GREEN)
                .geodesic(true));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ALAMEDA,14));

        // Add a marker in Sydney and move the camera
        LatLng origen3 = new LatLng(22.1558788, -100.9730761);
        mMap.addMarker(new MarkerOptions().position(origen3).title("Centro Alameda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(origen3));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origen3,11f));

        LatLng destino3 = new LatLng(22.155778, -101.0045132);
        mMap.addMarker(new MarkerOptions().position(destino3).title("Plaza El Dorado"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(destino3));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origen3,11f));
    }
}
