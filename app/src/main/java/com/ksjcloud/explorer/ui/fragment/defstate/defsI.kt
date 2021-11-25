package com.ksjcloud.explorer.ui.fragment.defstate

import com.ksjcloud.explorer.ui.base.baseI

interface defsI {
    interface Presenter<V : View> : baseI.Presenter<V> {

    }

    interface View : baseI.View {

    }
}