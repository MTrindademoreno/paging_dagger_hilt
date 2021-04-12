package com.marciotrindade.pagingall.ui.gallery


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.marciotrindade.pagingall.data.UnsplashRepository
import dagger.assisted.Assisted
import dagger.hilt.android.lifecycle.HiltViewModel


//@HiltViewModel atualização da @ViewModelInject

class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository,
    @Assisted private val savedStateHandle: SavedStateHandle
) :ViewModel() {
}