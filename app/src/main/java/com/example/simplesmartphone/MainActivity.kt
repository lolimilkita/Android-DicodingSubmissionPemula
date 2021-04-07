package com.example.simplesmartphone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvSphones: RecyclerView
    private val list: ArrayList<Sphone> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "List Smartphone"

        rvSphones = findViewById(R.id.rv_sphones)
        rvSphones.setHasFixedSize(true)

        list.addAll(SphoneData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvSphones.layoutManager = LinearLayoutManager(this)
        val listSphoneAdapter = ListSphoneAdapter(list)
        rvSphones.adapter = listSphoneAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_me -> {
                val iAbout = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(iAbout)
            }
        }
    }
}