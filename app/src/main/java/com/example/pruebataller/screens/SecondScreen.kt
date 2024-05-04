package com.example.pruebataller.screens

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import com.example.pruebataller.ui.theme.PruebaTallerTheme
import java.lang.reflect.Modifier

@Composable
fun SecondScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = androidx.compose.ui.Modifier
            .padding(10.dp)
            .fillMaxSize()
            .background(Color(0xFF6D81D2))
    ){
        SecondBodyContent()
    }
}



@Composable
fun SecondBodyContent() {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = androidx.compose.ui.Modifier
            
            .padding(10.dp)
            .background(Color.Green)
    ) {

        Text(text = "Navegaste a la segunda pantalla")
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Regresar")
        }

    }
}

@Composable
@Preview
fun GreetingSecondPreview() {
    PruebaTallerTheme {
        SecondScreen()
    }
}