package com.example.avramescu.codechallenges

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import com.example.avramescu.codechallenges.week2.MultipleViewsActivity
import com.example.avramescu.codechallenges.week3.FrameLayoutActivity
import com.example.avramescu.codechallenges.week3.ScrollViewActivity
import com.example.avramescu.codechallenges.week3.SpinnerActivity
import com.example.avramescu.codechallenges.week4.ConstraintLayout
import com.example.avramescu.codechallenges.week4.RecyclerViewActivity
import com.example.avramescu.codechallenges.week5.FirstActivity
import com.example.avramescu.codechallenges.week5.FirstActivityButtons
import com.example.avramescu.codechallenges.week5.FirstActivityChat
import com.example.avramescu.codechallenges.week6.*
import com.example.avramescu.codechallenges.week7.BatteryLevelActivity
import com.example.avramescu.codechallenges.week7.CardViewActivity
import com.example.avramescu.codechallenges.week7.DatePickerActivity
import com.example.avramescu.codechallenges.week8.bottomnavigation.BottomNavigationActivity
import com.example.avramescu.codechallenges.week8.bottonappbar.BottomAppBarActivity
import com.example.avramescu.codechallenges.week8.swipeRefresh.SwipeRefreshActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun multipleViewsActivityOnClick(view: View) {
        startActivity(Intent(this, MultipleViewsActivity::class.java))
    }

    fun FrameLayoutActivityOnClick(view: View) {
        startActivity(Intent(this, FrameLayoutActivity::class.java))
    }
    fun spinnerActivityOnClick(view: View) {
        startActivity(Intent(this, SpinnerActivity::class.java))
    }
    fun scrollViewActivityOnClick(view: View) {
        startActivity(Intent(this, ScrollViewActivity::class.java))
    }

    fun constraintLayoutActivityOnClick(view: View) {
        startActivity(Intent(this, ConstraintLayout::class.java))
    }
    fun recyclerViewActivityOnClick(view: View) {
        startActivity(Intent(this, RecyclerViewActivity::class.java))
    }
    fun firstActivityOnClick(view: View) {
        startActivity(Intent(this, FirstActivity::class.java))
    }
    fun firstActivityButtonsOnClick(view: View) {
        startActivity(Intent(this, FirstActivityButtons::class.java))
    }
    fun firstActivityChatOnClick(view: View) {
        startActivity(Intent(this, FirstActivityChat::class.java))
    }

    fun staticallyFragmentActivityOnClick(view: View) {
        startActivity(Intent(this, StaticallyFragmentActivity::class.java))
    }
    fun navigationActivityOnClick(view: View) {
        startActivity(Intent(this, NavigationActivity::class.java))
    }
    fun dynamicallyFragmentActivityOnClick(view: View) {
        startActivity(Intent(this, DynamicallyFragmentActivity::class.java))
    }
    fun communicationMethodsOnClick(view: View) {
        startActivity(Intent(this, CommunicationMethodsActivity::class.java))
    }
    fun communicationListenerOnClick(view: View) {
        startActivity(Intent(this, CommunicationListenerActivity::class.java))
    }
    fun communicationBundleActivityOnClick(view: View) {
        startActivity(Intent(this, CommunicationBundleActivity::class.java))
    }
    fun swipeRefreshActivityOnClick(view: View) {
        startActivity(Intent(this, SwipeRefreshActivity::class.java))
    }
    fun datePickerActivityOnClick(view: View) {
        startActivity(Intent(this, DatePickerActivity::class.java))
    }
    fun cardViewActivityOnClick(view: View) {
        startActivity(Intent(this, CardViewActivity::class.java))
    }
    fun batteryLevelActivityOnClick(view: View) {
        startActivity(Intent(this, BatteryLevelActivity::class.java))
    }
    fun bottomNavigationViewOnClick(view: View) {
        startActivity(Intent(this, BottomNavigationActivity::class.java))
    }
    fun bottomAppBarViewOnClick(view: View) {
        startActivity(Intent(this, BottomAppBarActivity::class.java))
    }

}