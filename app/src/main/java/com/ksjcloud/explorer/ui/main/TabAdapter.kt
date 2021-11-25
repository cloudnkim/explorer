package com.ksjcloud.explorer.ui.main

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.ksjcloud.explorer.R

/**
 * 상단 탭 어댑터,
 */

class TabAdapter(context: Context) : RecyclerView.Adapter<TabAdapter.TabHolder>() {
    private var mContext:Context = context
    private var mLists:ArrayList<String> = ArrayList()

    constructor(context: Context, listString:ArrayList<String>) : this(context) {
        mContext = context
        mLists = listString
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TabHolder {
        return TabHolder(LayoutInflater.from(mContext).inflate(R.layout.item_tab, parent,false))
    }

    override fun onBindViewHolder(holder: TabHolder, position: Int) {
        holder.mText.text = mLists[position]
    }

    override fun getItemCount(): Int {
        return mLists.size
    }


    class TabHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mText:TextView = itemView.findViewById(R.id.menu_title)
    }
}