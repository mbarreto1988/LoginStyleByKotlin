package com.example.patientplus

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginView() {
    Column (modifier = Modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Row {
            Text("Login")
            Spacer(modifier = Modifier.weight(1f))
            Text("Signup")
        }
        Spacer(modifier = Modifier.height(60.dp))
        Icon(
            modifier = Modifier.size(100.dp),
            contentDescription = "holamucndo",
            imageVector = Icons.Default.AccountCircle
        )
        Text( modifier = Modifier.padding(10.dp), text = "Patient Plus")
        TextField( modifier = Modifier.padding(10.dp), value = "User", onValueChange = {} )
        TextField( modifier = Modifier.padding(10.dp),value = "Password", onValueChange = {} )
        Button( onClick = {} ) {
            Icon( modifier = Modifier.size(20.dp), contentDescription = "login", imageVector = Icons.Default.Done )
            Text("Login")
        }
        Text( modifier = Modifier.padding(10.dp), text = "forgot password?")

    }
}

@Preview(showBackground = true)
@Composable
fun LoginViewPreview() {
    LoginView()
}