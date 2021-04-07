package com.example.simplesmartphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ActivityDetailSmartphone : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_smartphone)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Smartphone"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvItemName: TextView = findViewById(R.id.tv_item_name)
        val tvItemPhoto1: ImageView = findViewById(R.id.item_photo1)
        val tvItemPhoto2: ImageView = findViewById(R.id.item_photo2)
        val tvItemPhoto3: ImageView = findViewById(R.id.item_photo3)
        val tvRilis: TextView = findViewById(R.id.tv_rilis)
        val tvHarga: TextView = findViewById(R.id.tv_harga)
        val tvChipset: TextView = findViewById(R.id.tv_chipset)
        val tvCpu: TextView = findViewById(R.id.tv_cpu)
        val tvGpu: TextView = findViewById(R.id.tv_gpu)
        val tvRam: TextView = findViewById(R.id.tv_ram)
        val tvMemoriInternal: TextView = findViewById(R.id.tv_memori_internal)
        val tvMemoriEksternal: TextView = findViewById(R.id.tv_memori_eksternal)
        val tvKameraBelakang: TextView = findViewById(R.id.tv_kamera_belakang)
        val tvKameraDepan: TextView = findViewById(R.id.tv_kamera_depan)
        val tvBaterai: TextView = findViewById(R.id.tv_baterai)
        val tvDetail: TextView = findViewById(R.id.tv_set_detail)
        val btnFavorite: Button = findViewById(R.id.btn_set_favorite)
        val btnShare: Button = findViewById(R.id.btn_set_share)

        val tItemName = intent.getStringExtra(EXTRA_NAME)
        val tItemPhoto1 = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tItemPhoto2 = intent.getIntExtra(EXTRA_PHOTO2, 0)
        val tItemPhoto3 = intent.getIntExtra(EXTRA_PHOTO3, 0)
        val tRilis = intent.getStringExtra(EXTRA_RILIS)
        val tHarga = intent.getStringExtra(EXTRA_HARGA)
        val tChipset = intent.getStringExtra(EXTRA_CHIPSET)
        val tCpu = intent.getStringExtra(EXTRA_CPU)
        val tGpu = intent.getStringExtra(EXTRA_GPU)
        val tRam = intent.getStringExtra(EXTRA_RAM)
        val tMemoriInternal = intent.getStringExtra(EXTRA_MEMORI_INTERNAL)
        val tMemoriEksternal = intent.getStringExtra(EXTRA_MEMORI_EKSTERNAL)
        val tKameraBelakang = intent.getStringExtra(EXTRA_KAMERA_BELAKANG)
        val tKameraDepan = intent.getStringExtra(EXTRA_KAMERA_DEPAN)
        val tBaterai = intent.getStringExtra(EXTRA_BATERAI)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)

        tvItemName.text = tItemName
        Glide.with(this)
                .load(tItemPhoto1)
                .apply(RequestOptions())
                .into(tvItemPhoto1)
        Glide.with(this)
                .load(tItemPhoto2)
                .apply(RequestOptions())
                .into(tvItemPhoto2)
        Glide.with(this)
                .load(tItemPhoto3)
                .apply(RequestOptions())
                .into(tvItemPhoto3)
        tvRilis.text = tRilis
        tvHarga.text = tHarga
        tvChipset.text = tChipset
        tvCpu.text = tCpu
        tvGpu.text = tGpu
        tvRam.text = tRam
        tvMemoriInternal.text = tMemoriInternal
        tvMemoriEksternal.text = tMemoriEksternal
        tvKameraBelakang.text = tKameraBelakang
        tvKameraDepan.text = tKameraDepan
        tvBaterai.text = tBaterai
        tvDetail.text = tDetail

        btnFavorite.setOnClickListener {
            Toast.makeText(this,"Favorite " + tItemName + ", Terima kasih :)", Toast.LENGTH_SHORT).show()
        }
        btnShare.setOnClickListener {
            Toast.makeText(this,"Bagikan " + tItemName +" :)", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PHOTO2 = "extra_photo2"
        const val EXTRA_PHOTO3 = "extra_photo3"
        const val EXTRA_RILIS = "extra_rilis"
        const val EXTRA_HARGA = "extra_harga"
        const val EXTRA_CHIPSET = "extra_chipset"
        const val EXTRA_CPU = "extra_cpu"
        const val EXTRA_GPU = "extra_gpu"
        const val EXTRA_RAM = "extra_ram"
        const val EXTRA_MEMORI_INTERNAL = "extra_memori_internal"
        const val EXTRA_MEMORI_EKSTERNAL = "extra_memori_eksternal"
        const val EXTRA_KAMERA_BELAKANG = "extra_kamera_belakang"
        const val EXTRA_KAMERA_DEPAN = "extra_kamera_depan"
        const val EXTRA_BATERAI = "extra_baterai"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}