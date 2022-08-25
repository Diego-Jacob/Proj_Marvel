package br.djnovaes.com.proj_marvel.Adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.djnovaes.com.proj_marvel.Fragments.Character
import br.djnovaes.com.proj_marvel.Fragments.Favorite
import br.djnovaes.com.proj_marvel.Fragments.HostMarvel

class ViewPagerAdapter(private val host: HostMarvel) : FragmentStateAdapter(host) {

    private val fragments = arrayOf(Character(), Favorite())

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment {
        return fragments[position]


    }
}