package com.example.netclanexplore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast

import androidx.appcompat.widget.Toolbar


import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var refine: ImageView

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.appbarmenu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.refin -> {
                // Handle settings item click
                // For now, let's just show a toast message
                val intent = Intent(this, Refine::class.java)
                intent.putExtra("key", "Hello from ActivityA!")
                startActivity(intent)
                finish()

                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            // Add more cases for other menu items if needed
            else -> return super.onOptionsItemSelected(item)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager : ViewPager = findViewById(R.id.viewPager) as ViewPager
        var tablayout : TabLayout = findViewById(R.id.tabLayout) as TabLayout
        refine = findViewById(R.id.btnRefine)

        refine.setOnClickListener {
            var inext=Intent(this,Refine::class.java)
            startActivity(inext)
        }



        val fragmrentadapter = fragmentAdapter(supportFragmentManager)
        fragmrentadapter.addFragment(personal(),"Personal")
        fragmrentadapter.addFragment(Business(),"Business")
        fragmrentadapter.addFragment(Merchant(),"Merchant")


        viewPager.adapter=fragmrentadapter
        tablayout.setupWithViewPager(viewPager)



    }
}