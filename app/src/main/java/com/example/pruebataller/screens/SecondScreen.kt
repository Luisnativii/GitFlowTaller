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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.pruebataller.ui.theme.PruebaTallerTheme
import com.todolist.data.Task
import java.lang.reflect.Modifier

@Composable
fun SecondScreen(onAddTask: (Task) -> Unit,
                 onCancel: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = androidx.compose.ui.Modifier

            .fillMaxSize()
            .background(Color(0xFF6D81D2))
    ){
        SecondBodyContent()
    }
}



@Composable
fun SecondBodyContent() {


    val _toDoList = remember { mutableStateOf(listOf<Task>()) }
    val showAddTask = remember { mutableStateOf(false) }

    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = androidx.compose.ui.Modifier
            

            .background(Color.Green)
    ) {
        if (showAddTask.value) {
            FirstScreen( onAddTask = {
                _toDoList.value = _toDoList.value + it
                showAddTask.value = false
            }, onCancel = {
                showAddTask.value = false
            })
        }
        Text(text = "Navegaste a la segunda pantalla")
        Button(onClick = { showAddTask.value = true }) {
            Text(text = "Regresar")
        }

    }
}

@Composable
@Preview
fun GreetingSecondPreview() {
    PruebaTallerTheme {
        SecondScreen({},{})
    }
}