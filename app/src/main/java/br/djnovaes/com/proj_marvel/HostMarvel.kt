package br.djnovaes.com.proj_marvel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import br.djnovaes.com.proj_marvel.databinding.FragmentHostMarvelBinding
import com.google.android.material.tabs.TabLayoutMediator


class HostMarvel : Fragment() {
    private var _binding: FragmentHostMarvelBinding? = null
    private val binding: FragmentHostMarvelBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHostMarvelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    fun setupView(){
        val tabLayout = binding.tabHome
        val viewPager = binding.vpHome
        val titles = arrayOf(R.string.characters, R.string.favorites)
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = getString(titles[position])
        }.attach()
    }

}