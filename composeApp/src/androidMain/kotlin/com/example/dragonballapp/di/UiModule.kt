package com.example.dragonballapp.di

import com.example.dragonballapp.ui.detail.DetailScreen
import com.example.dragonballapp.ui.detail.DetailViewModel
import com.example.dragonballapp.ui.home.HomeViewModel
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val uiModule = module {
    factoryOf(::HomeViewModel)
    factoryOf(::DetailViewModel)
}
