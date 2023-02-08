package com.example.dztwoandroidfour.ui.fragments.pager

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.dztwoandroidfour.base.BaseFragment
import com.example.dztwoandroidfour.R
import com.example.dztwoandroidfour.databinding.FragmentPagerBinding
import com.example.dztwoandroidfour.ui.adapters.PagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class PagerFragment: BaseFragment<FragmentPagerBinding, PagerViewModel>(R.layout.fragment_pager) {

    override val binding by viewBinding(FragmentPagerBinding::bind)
    override val viewModel by viewModels<PagerViewModel>()

    override fun initialize() {
        binding.viewPager.adapter = PagerAdapter(requireActivity())
        TabLayoutMediator(binding.tabLayout, binding.viewPager){
                tab, pos ->
            when(pos){
                0 -> {
                    tab.text = "Anime"
                }
                1 -> {
                    tab.text = "Manga"
                }
            }
        }.attach()
    }
}