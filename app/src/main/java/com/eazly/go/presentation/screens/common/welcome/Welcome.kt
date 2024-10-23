package com.eazly.go.presentation.screens.common.welcome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.eazly.go.R

class WelcomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeContent()
        }
    }

    @Composable
    fun WelcomeContent() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF004749))
        ) {
            Image(
                painter = painterResource(id = R.drawable.splash_back),
                contentDescription = "Background Image",
                modifier = Modifier.fillMaxSize()
            )

            Image(
                painter = painterResource(id = R.drawable.eazly_go_logo),
                contentDescription = "App Logo",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(100.dp)
                    .size(450.dp)
            )

        }

    }

    @Preview(showSystemUi = true)
    @Composable
    fun WelcomeContentPreview() {
        WelcomeContent()
    }


}
