package com.handsomerobot.foododering


import android.graphics.Insets.add
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.handsomerobot.foododering.Adapters.MainAdapter
import com.handsomerobot.foododering.Models.MainModel
import com.handsomerobot.foododeringapp.adapter.MainAdapter
import com.handsomerobot.foododeringapp.models.MainModel
import com.handsomerobot.foododeringapp.databinding.ActivityMainBindingpat

class MainActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<MainModel>().apply {
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
            add(MainModel(R.drawable.burger, "Burger is tasty", "5", "Burger"))
        }

        val adapter = MainAdapter(list, this)
        binding.recyler.layoutManager = LinearLayoutManager(this)
        binding.recyler.adapter = adapter
    }
}