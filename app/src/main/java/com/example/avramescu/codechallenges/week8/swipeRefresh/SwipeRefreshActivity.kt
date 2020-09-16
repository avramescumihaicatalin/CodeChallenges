package com.example.avramescu.codechallenges.week8.swipeRefresh

import android.os.Bundle
import android.os.CountDownTimer
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.avramescu.codechallenges.R
import kotlinx.android.synthetic.main.activity_swipe_refresh.*

class SwipeRefreshActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_refresh)

        setSwipeListener()
    }

    private fun setSwipeListener() {
        swipe_refresh_layout.setOnRefreshListener {
            counter++
            Toast.makeText(this@SwipeRefreshActivity, "swiped: $counter times", Toast.LENGTH_SHORT).show()

            val timer: CountDownTimer = object : CountDownTimer(3000, 1000) {
                override fun onFinish() {
                    swipe_refresh_layout.isRefreshing = false
                }

                override fun onTick(millisUntilFinished: Long) {
                    //do nothing
                }
            }
            timer.start()

        }
    }

}