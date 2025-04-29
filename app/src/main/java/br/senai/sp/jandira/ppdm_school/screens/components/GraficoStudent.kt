package br.senai.sp.jandira.ppdm_school.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun GraficoStudent(
    materia: String
){
    Row (
        modifier = Modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(
            modifier = Modifier
                .padding(horizontal = 10.dp),
            text = stringResource(
                R.string.siop
            ),
            color = Color(0xFFFFFFFF),
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )
        Card(
            modifier = Modifier
                .width(190.dp)
                .height(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFFFFFF)
            ),
            shape = RoundedCornerShape(2.dp)
        ) {
            Card(
                modifier = Modifier
                    .width(130.dp)
                    .height(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF30B988)
                ),
                shape = RoundedCornerShape(2.dp)
            ) { }
        }
        Text(
            modifier = Modifier
                .padding(horizontal = 10.dp),
            text = "77",
            color = Color(0xFFFFFFFF),
            fontSize = 15.sp,
            fontWeight = FontWeight.Medium
        )

    }
}
