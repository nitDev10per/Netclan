package com.example.netclanexplore

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStateManagerControl
import androidx.fragment.app.FragmentStatePagerAdapter

class fragmentAdapter (fm : FragmentManager) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    var fragmentlist: ArrayList<Fragment> = ArrayList()
    var fragmenttitle: ArrayList<String> = ArrayList()

    override fun getCount(): Int {
        return fragmentlist.size
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Fragment {
        return  fragmentlist[position]
        TODO("Not yet implemented")
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmenttitle[position]
    }

    fun addFragment(fragment: Fragment,title : String){
        fragmentlist.add(fragment)
        fragmenttitle.add(title)
    }
}
