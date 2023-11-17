package com.example.testtaskfour.presentation.screen

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.testtaskfour.R


class ViewPagerAdapter(private val context: Context) : PagerAdapter() {
    private val images = listOf(R.drawable.menu, R.drawable.name1, R.drawable.name2)
    override fun getCount(): Int = images.size

    @SuppressLint("MissingInflatedId")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(R.layout.image_item, container, false)
        val imageView: ImageView = layout.findViewById(R.id.imageView)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setImageResource(images[position])
        container.addView(layout)
        return layout
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)

    }
}
