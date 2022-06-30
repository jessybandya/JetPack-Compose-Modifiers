package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             Column(
                 modifier = Modifier
                     .background(Color.Green)
                     .width(300.dp)
                     .fillMaxHeight(0.5f)
                     .border(5.dp, Color.Magenta)
//                     .requiredWidth(300.dp)
//                     .padding(16.dp)
                     .padding(top = 16.dp)
             ) {
                 Text("Click Me", modifier = Modifier
                     .offset(80.dp, 20.dp)
                     .clickable {

                     }
                 )
                 Spacer(modifier = Modifier.height(50.dp))
                 Text("Jessy Bandya!")
             }
        }
    }
}