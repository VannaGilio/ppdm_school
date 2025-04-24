package br.senai.sp.jandira.ppdm_school.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.screens.CursesScreen

@Composable
fun CardCurses (
    iconCurse: Painter,
    siglaCurse: String,
    curse: String,
    descCurse: String,
    workloadCurse: String
){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, Color(0xFFFFC23D), shape = RoundedCornerShape(10.dp))
            .height(180.dp),
        shape = RoundedCornerShape(10.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFF3347B0), Color(0xFFCFD4EA))
                    )
                )
        ){
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = iconCurse,
                    contentDescription = siglaCurse,
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 10.dp),
                    text = siglaCurse,
                    color = Color(0xFFFFC23D),
                    fontSize = 45.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Column(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
            ){
                Text(
                    text = curse,
                    color = Color(0xFFFFFFFF),
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = descCurse,
                    color = Color(0xFFFFFFFF),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal
                )
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "",
                        tint = Color(0xFFFFC23D)
                    )
                    Text(
                        modifier = Modifier
                        .padding(5.dp),
                        text = workloadCurse,
                        color = Color(0xFFFFFFFF),
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesPreview() {
//    CardCurses()
}
