package com.router.assignmentmemo

import android.app.Application
import com.google.firebase.auth.FirebaseUser

class GlobalApplication : Application() {

    companion object{
        lateinit var user : FirebaseUser
    }

}