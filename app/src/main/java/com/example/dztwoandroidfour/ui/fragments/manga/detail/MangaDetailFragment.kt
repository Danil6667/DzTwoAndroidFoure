package com.example.dztwoandroidfour.ui.fragments.manga.detail

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.dztwoandroidfour.base.BaseFragment
import com.example.dztwoandroidfour.extensions.toast
import com.example.dztwoandroidfour.utils.Resource
import com.example.dztwoandroidfour.R
import com.example.dztwoandroidfour.databinding.FragmentMangaDetailBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MangaDetailFragment : BaseFragment<FragmentMangaDetailBinding, MangaDetailViewModel>(R.layout.fragment_manga_detail) {

    override val binding by viewBinding(FragmentMangaDetailBinding::bind)
    override val viewModel by viewModels<MangaDetailViewModel>()
    private val args by navArgs<MangaDetailFragmentArgs>()

    override fun setupSubscribes() {
        subscribeToMangaDetail()
    }

    private fun subscribeToMangaDetail() = with(binding) {
        viewModel.getDetailManga(args.id).observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Failure -> {
                    toast(it.message)
                }
                is Resource.Loading -> {
                    toast("Загрузка...")
                }
                is Resource.Success -> {
                    Glide.with(ivPosterManga.context)
                        .load(it.data?.data?.attributes?.posterImage?.original)
                        .into(ivPosterManga)
                    tvNameManga.text = it.data?.data?.attributes?.titles?.enJp
                    toast("Успешно")
                }
            }
        }
    }
}