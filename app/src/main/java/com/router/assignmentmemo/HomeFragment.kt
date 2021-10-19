package com.router.assignmentmemo

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private var isFloatingOpen = false;
    lateinit var fab_open : Animation
    lateinit var fab_close : Animation


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab_open = AnimationUtils.loadAnimation(activity?.applicationContext, R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(activity?.applicationContext, R.anim.fab_close);

        floatingActionButton1.setOnClickListener {
            animation()
        }
        floatingActionButton2.setOnClickListener {
            animation()
        }
        floatingActionButton3.setOnClickListener {
            animation()
        }
    }

    fun animation(){
        if (isFloatingOpen) {
            floatingActionButton2.startAnimation(fab_close)
            floatingActionButton3.startAnimation(fab_close)
            add_assignment_tv.startAnimation(fab_close)
            add_todolist_tv.startAnimation(fab_close)

            floatingActionButton2.setClickable(false)
            floatingActionButton3.setClickable(false)

            isFloatingOpen = false

            floatingActionButton1.setImageResource(R.drawable.ic_baseline_add_24)
        } else {
            floatingActionButton2.startAnimation(fab_open)
            floatingActionButton3.startAnimation(fab_open)
            add_assignment_tv.startAnimation(fab_open)
            add_todolist_tv.startAnimation(fab_open)

            floatingActionButton2.setClickable(true)
            floatingActionButton3.setClickable(true)

            isFloatingOpen = true

            floatingActionButton1.setImageResource(R.drawable.ic_baseline_clear_24)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        return view
    }

}