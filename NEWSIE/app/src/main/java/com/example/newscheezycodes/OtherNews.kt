package com.example.newscheezycodes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Vector

class OtherNews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_news)
        var objects = Vector<CountryInfo>()
        objects.add(CountryInfo(R.drawable.japan, "\n\nJAPAN"))
        objects.add(CountryInfo(R.drawable.uk, "\n\nUNITED\nKINGDOM"))
        objects.add(CountryInfo(R.drawable.canada, "\n\nCANADA"))
        objects.add(CountryInfo(R.drawable.ukraine, "\n\nUKRAINE"))
        objects.add(CountryInfo(R.drawable.germany, "\n\nGERMANY"))
        objects.add(CountryInfo(R.drawable.france, "\n\nFRANCE"))
        objects.add(CountryInfo(R.drawable.poland, "\n\nPOLAND"))
        objects.add(CountryInfo(R.drawable.southkorea, "\n\nSOUTH\nKOREA"))
        objects.add(CountryInfo(R.drawable.uae, "\n\nUAE"))
        objects.add(CountryInfo(R.drawable.russia, "\n\nRUSSIA"))
        objects.add(CountryInfo(R.drawable.australia, "\n\nAUSTRALIA"))
        objects.add(CountryInfo(R.drawable.austria, "\n\nAUSTRIA"))
        objects.add(CountryInfo(R.drawable.bulgaria, "\n\nBULGARIA"))
        objects.add(CountryInfo(R.drawable.belgium, "\n\nBELGIUM"))
        objects.add(CountryInfo(R.drawable.brazil, "\n\nBRAZIL"))
        objects.add(CountryInfo(R.drawable.switzerland, "\n\nSWITZERLAND"))
        objects.add(CountryInfo(R.drawable.china, "\n\nCHINA"))
        objects.add(CountryInfo(R.drawable.colombia, "\n\nCOLOMBIA"))
        objects.add(CountryInfo(R.drawable.cuba, "\n\nCUBA"))
        objects.add(CountryInfo(R.drawable.czechia, "\n\nCZECHIA"))
        objects.add(CountryInfo(R.drawable.egypt, "\n\nEGYPT"))
        objects.add(CountryInfo(R.drawable.greece, "\n\nGREECE"))
        objects.add(CountryInfo(R.drawable.hongkong, "\n\nHONG\nKONG"))
        objects.add(CountryInfo(R.drawable.hungary, "\n\nHUNGARY"))
        objects.add(CountryInfo(R.drawable.indonesia, "\n\nINDONESIA"))
        objects.add(CountryInfo(R.drawable.ireland, "\n\nIRELAND"))
        objects.add(CountryInfo(R.drawable.israel, "\n\nISRAEL"))
        objects.add(CountryInfo(R.drawable.italy, "\n\nITALY"))
        objects.add(CountryInfo(R.drawable.lithuania, "\n\nLITHUANIA"))
        objects.add(CountryInfo(R.drawable.latvia, "\n\nLATVIA"))
        objects.add(CountryInfo(R.drawable.morocco, "\n\nMOROCCO"))
        objects.add(CountryInfo(R.drawable.mexico, "\n\nMEXICO"))
        objects.add(CountryInfo(R.drawable.malaysia, "\n\nMALAYSIA"))
        objects.add(CountryInfo(R.drawable.nigeria, "\n\nNIGERIA"))
        objects.add(CountryInfo(R.drawable.russia, "\n\nRUSSIA"))
        objects.add(CountryInfo(R.drawable.netherlands, "\n\nNETHERLANDS"))
        objects.add(CountryInfo(R.drawable.norway, "\n\nNORWAY"))
        objects.add(CountryInfo(R.drawable.newzealand, "\n\nNEW\nZEALAND"))
        objects.add(CountryInfo(R.drawable.philippines, "\n\nPHILIPPINES"))
        objects.add(CountryInfo(R.drawable.portugal, "\n\nPORTUGAL"))
        objects.add(CountryInfo(R.drawable.romania, "\n\nROMANIA"))
        objects.add(CountryInfo(R.drawable.serbia, "\n\nSERBIA"))
        objects.add(CountryInfo(R.drawable.saudi, "\n\nSAUDI\nARABIA"))
        objects.add(CountryInfo(R.drawable.sweden, "\n\nSWEDEN"))
        objects.add(CountryInfo(R.drawable.singapore, "\n\nSINGAPORE"))
        objects.add(CountryInfo(R.drawable.slovenia, "\n\nSLOVENIA"))
        objects.add(CountryInfo(R.drawable.slovakia, "\n\nSLOVAKIA"))
        objects.add(CountryInfo(R.drawable.thailand, "\n\nTHAILAND"))
        objects.add(CountryInfo(R.drawable.turkey, "\n\nTURKEY"))
        objects.add(CountryInfo(R.drawable.taiwan, "\n\nTAIWAN"))
        objects.add(CountryInfo(R.drawable.venezuela, "\n\nVENEZUELA"))
        objects.add(CountryInfo(R.drawable.southafrica, "\n\nSOUTH\nAFRICA"))

        var recyclerView = findViewById<RecyclerView>(R.id.recycle2)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter2(this, objects)
    }
}