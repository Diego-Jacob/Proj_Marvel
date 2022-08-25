package br.djnovaes.com.proj_marvel

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(private val host:HostMarvel) : FragmentStateAdapter(host) {

    private val fragments = arrayOf(Character(), Favorite())

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]


    }
}