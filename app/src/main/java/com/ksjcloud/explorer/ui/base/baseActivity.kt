package com.ksjcloud.explorer.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class baseActivity : AppCompatActivity(), baseI.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onShowLoading() {

    }

    override fun onHideLoading() {

    }
}