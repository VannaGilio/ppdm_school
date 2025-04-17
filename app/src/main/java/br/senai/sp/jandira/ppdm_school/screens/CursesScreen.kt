package br.senai.sp.jandira.ppdm_school.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CursesScreen (){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFEFE4CF))
    ){

    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesScreenPreview() {
    CursesScreen()
}