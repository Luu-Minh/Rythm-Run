package com.example.run_tracker_native_app.imageslider.animations

import android.view.View
import androidx.viewpager.widget.ViewPager.PageTransformer


class FlipVertical: PageTransformer {
    override fun transformPage(view: View, position: Float) {
        val rotation: Float = -180f * position

        view.alpha = if (rotation > 90f || rotation < -90f) 0f else 1f
        view.pivotX = view.width * 0.5f
        view.pivotY = view.height * 0.5f
        view.rotationX = rotation
    }
}