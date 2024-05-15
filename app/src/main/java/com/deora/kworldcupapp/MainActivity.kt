package com.deora.kworldcupapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //1- adaapter View:LIstView
        var listview: ListView = findViewById(R.id.listview)
        //2- Adapter
        var adapter =MyAdapter(this,generateData())

        listview?.adapter=adapter
        adapter?.notifyDataSetChanged()

    }
    //3dataSOurec
    fun generateData():ArrayList<CountryModel>{
        var result=ArrayList<CountryModel>()
        var country1:CountryModel= CountryModel("Brazil","5",R.drawable.cube)
        var country2:CountryModel=CountryModel("Germany","4",R.drawable.cube)
        var country3:CountryModel=CountryModel("France","2",R.drawable.cube)
        var country4:CountryModel=CountryModel("Spain","1",R.drawable.cube)
        var country5:CountryModel=CountryModel("England","1",R.drawable.cube)
        var country6:CountryModel=CountryModel("United States","0",R.drawable.cube)
        var country7:CountryModel=CountryModel("Saudi Arabia","0",R.drawable.cube)

        result.add(country1)
        result.add(country2)
        result.add(country3)
        result.add(country4)
        result.add(country5)
        result.add(country6)
        result.add(country7)

        return result

    }


}