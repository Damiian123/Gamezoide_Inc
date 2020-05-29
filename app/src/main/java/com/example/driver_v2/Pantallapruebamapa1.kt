package com.example.driver_v2

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class Pantallapruebamapa1 : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantallapruebamapa1)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
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
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera

        // Add a marker in Sydney and move the camera
        val origen1 = LatLng(22.1235857, -100.9389847)
        mMap.addMarker(MarkerOptions().position(origen1).title("Dalias, 1810"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(origen1))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(origen1, 15f))

        val destino1 = LatLng(22.1308141, -100.9267942)
        mMap.addMarker(MarkerOptions().position(destino1).title("Plaza Sendero"))
        mMap.moveCamera(CameraUpdateFactory.newLatLng(destino1))
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(destino1, 15f))

        val map: GoogleMap? = null
        val line = map!!.addPolyline(
          PolylineOptions()
            .add(LatLng(22.1235857, -100.9389847), LatLng(22.1308141, -100.9267942))
            .width(5f)
            .color(Color.RED)
        )
    }
}
