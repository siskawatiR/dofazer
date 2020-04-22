package com.dofazer.cafe.customview

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

class NoSwipePager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {
    private var enabled: Boolean? = null

    init {
        this.enabled = true
    }

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        if(this.enabled == true) {
            return super.onTouchEvent(ev)
        }
        return false
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        if(this.enabled == true) {
            return super.onInterceptTouchEvent(ev)
        }
        return false
    }

    fun setPagingEnabled(enabled: Boolean){
        this.enabled = enabled
    }

}