package com.example.dztwoandroidfour.ui.fragments.anime.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.dztwoandroidfour.base.BaseFragment
import com.example.dztwoandroidfour.extensions.toast
import com.example.dztwoandroidfour.utils.Resource
import com.example.dztwoandroidfour.R
import com.example.dztwoandroidfour.databinding.FragmentDetailAnimeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailAnimeFragment :
    BaseFragment<FragmentDetailAnimeBinding, DetailAnimeViewModel>(R.layout.fragment_detail_anime) {

    override val binding by viewBinding(FragmentDetailAnimeBinding::bind)
    override val viewModel by viewModels<DetailAnimeViewModel>()
    private val args by navArgs<DetailAnimeFragmentArgs>()


    override fun setupSubscribes() {
        subscribeToAnimeDetail()
    }

    private fun subscribeToAnimeDetail() = with(binding) {
        viewModel.getDetailAnime(args.id).observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Failure -> {
                    toast(it.message)
                }
                is Resource.Loading -> {
                    toast("Загрузка")
                }
                is Resource.Success -> {
                    Glide.with(ivPoster.context)
                        .load(it.data?.data?.attributes?.posterImage?.original)
                        .into(ivPoster)
                    tvName.text = it.data?.data?.attributes?.titles?.enJp
                    toast("Успешно")
                }
            }
        }
    }
}