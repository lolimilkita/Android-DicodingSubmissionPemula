package com.example.simplesmartphone

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListSphoneAdapter(private val listSphone: ArrayList<Sphone>) :RecyclerView.Adapter<ListSphoneAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_sphone, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, photo, photo2, photo3, release, price, chipset, cpu, gpu, ram, memori_internal, memori_eksternal, kamera_belakang, kamera_depan, baterai, detail) = listSphone[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(500, 500))
            .into(holder.imgPhoto)

        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener{
            val moveDetail = Intent(mContext, ActivityDetailSmartphone::class.java)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_NAME, name)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_PHOTO, photo)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_PHOTO2, photo2)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_PHOTO3, photo3)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_RILIS, release)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_HARGA, price)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_CHIPSET, chipset)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_CPU, cpu)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_GPU, gpu)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_RAM, ram)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_MEMORI_INTERNAL, memori_internal)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_MEMORI_EKSTERNAL, memori_eksternal)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_KAMERA_BELAKANG, kamera_belakang)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_KAMERA_DEPAN, kamera_depan)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_BATERAI, baterai)
            moveDetail.putExtra(ActivityDetailSmartphone.EXTRA_DETAIL, detail)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listSphone.size
    }

}