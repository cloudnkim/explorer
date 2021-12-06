package com.ksjcloud.explorer.ui.fragment.defstate

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.data.DefsInfoDetail
import kotlinx.android.synthetic.main.item_disa.view.*

class DefsAdapter(context: Context, list:ArrayList<DefsInfoDetail>) : RecyclerView.Adapter<DefsAdapter.DefsHolder>() {
    var mContext:Context = context
    var mList = list

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DefsHolder {
        return DefsHolder(
            LayoutInflater.from(mContext).inflate(R.layout.item_defs, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DefsHolder, position: Int) {
        var mData = mList[position]
        holder.itemView.item_backg.setBackgroundColor(when(mData.color) {
            "GREEN" -> Color.GREEN
            "RED" -> Color.RED
            "YELLOW" -> Color.YELLOW
            "BLUE" -> Color.BLUE
            "BLACK" -> Color.BLACK

            else -> Color.DKGRAY
        })

        holder.itemView.item_area.text = mData.name
        holder.itemView.item_count.text = "${mData.count}개"
        holder.itemView.item_price.text = "${mData.price}원"
        holder.itemView.item_open.text = mData.openTime
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    class DefsHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}