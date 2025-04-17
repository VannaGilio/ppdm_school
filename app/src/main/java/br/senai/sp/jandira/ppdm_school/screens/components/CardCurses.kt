package br.senai.sp.jandira.ppdm_school.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
//    iconCurse: Int,
//    siglaCurse: String,
//    curse: String,
//    descCurse: String,
//    workloadCurse: Int
){
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(200.dp),
        shape = RoundedCornerShape(10.dp)
    ){
        Box(
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
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.ds
                    ),
                    contentDescription = stringResource(
                        R.string.sigla_ds
                    ),
                    modifier = Modifier
                        .size(100.dp)
                )
                Text(
                    text = stringResource(
                        R.string.sigla_ds
                    ),
                    color = Color(0xFFFFC23D),
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                text = stringResource(
                    R.string.ds
                ),
                color = Color(0xFFFFFFFF),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesPreview() {
    CardCurses()
}
