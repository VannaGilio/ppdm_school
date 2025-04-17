package br.senai.sp.jandira.ppdm_school.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R

@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(5.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Image(
                        painter = painterResource(
                            R.drawable.logo
                        ),
                        contentDescription = stringResource(
                            R.string.logo
                        ),
                        modifier = Modifier
                            .size(180.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                ) {
                    Text(modifier = Modifier
                        .padding(10.dp),
                        text = stringResource(
                            R.string.titulo
                        ),
                        color = Color(0xFF3347B0),
                        fontSize = 45.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
                    .height(150.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(
                        R.string.subtitulo
                    ),
                    color = Color(0xFF3347B0),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .width(60.dp)
                        .height(5.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFFFC23D)
                        )
                ){}
                Text(
                    modifier = Modifier
                        .padding(top = 15.dp),
                    text = stringResource(
                        R.string.descricao
                    ),
                    color = Color(0xFF9E9FA4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Light,
                    textAlign = TextAlign.Center
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(30.dp),
                    shape = RoundedCornerShape(12.dp),
                    border = BorderStroke(1.dp, Color(0xFF3347B0)),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFFC23D)),
                    onClick = {}
                ) {
                    Text(
                        textAlign = TextAlign.Center,
                        color = Color(0xFF3347B0),
                        fontSize = 20.sp,
                        text = stringResource(
                            R.string.button_start
                        )
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.youtube
                    ),
                    contentDescription = stringResource(
                        R.string.youtube
                    ),
                    modifier = Modifier
                        .size(50.dp)
                        .padding(10.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.twitter
                    ),
                    contentDescription = stringResource(
                        R.string.twitter
                    ),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(50.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.instagram
                    ),
                    contentDescription = stringResource(
                        R.string.instagram
                    ),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(50.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.facebook
                    ),
                    contentDescription = stringResource(
                        R.string.facebook
                    ),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(50.dp)
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()

}