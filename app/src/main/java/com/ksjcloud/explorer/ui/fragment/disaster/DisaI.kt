package com.ksjcloud.explorer.ui.fragment.disaster

import com.ksjcloud.explorer.ui.base.BaseI

interface DisaI {
    interface View : BaseI.View {

    }

    interface Presenter<V : View> : BaseI.Presenter<V> {

    }
}