package com.example.patientplus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SplashView() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Column ( horizontalAlignment = Alignment.CenterHorizontally ) {
            Icon(
                modifier = Modifier.size(100.dp),
                contentDescription = "holamucndo",
                imageVector = Icons.Default.AccountCircle
            )
            Text("Hola Mundo")
            Text("Descripcion breve de algo...")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SplashViewPreview() {
    SplashView()
}