package com.manhle.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manhle.myapplication.nav.OrderFoodNavavigation
import com.manhle.myapplication.screens.DeliverTo
import com.manhle.myapplication.screens.Login

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeliverTo {

            }
        }
    }
}

