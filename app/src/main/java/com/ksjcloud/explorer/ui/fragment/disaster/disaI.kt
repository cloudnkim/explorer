package com.ksjcloud.explorer.ui.fragment.disaster

import com.ksjcloud.explorer.ui.base.baseI

interface disaI {
    interface View : baseI.View {

    }

    interface Presenter<V : View> : baseI.Presenter<V> {

    }
}