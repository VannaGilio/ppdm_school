package br.senai.sp.jandira.ppdm_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.screens.components.GraficoStudent
import java.util.Locale

@Composable
fun StudentScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .background(Color(0xFFFFFFFF))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp),
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.logo
                    ),
                    contentDescription = stringResource(
                        R.string.sigla_ds
                    ),
                    modifier = Modifier
                        .size(60.dp)
                )
                Text(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    text = stringResource(
                        R.string.titulo
                    ),
                    color = Color(0xFF3347B0),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Divider(
                modifier = Modifier
                    .fillMaxWidth(),
                color = Color(0xFFFFC23D), thickness = 1.dp
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Card(
                        modifier = Modifier
                            .border(
                                3.dp,
                                color = Color(0xFFFFC23D).copy(alpha = 0.7f),
                                RoundedCornerShape(100.dp)
                            )
                            .size(130.dp),
                        shape = CircleShape,
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFFFFFFF)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(
                                    R.drawable.pessoa1
                                ),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(125.dp)
                            )
                        }
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 50.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 10.dp),
                        text = stringResource(
                            R.string.nome_1
                        ),
                        color = Color(0xFF3347B0),
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        textAlign = TextAlign.Center,
                        text = stringResource(
                            R.string.student_course
                        ),
                        color = Color(0xFF3347B0),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFF9FA9E1))
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxSize(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF9FA9E1)
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(30.dp),
                                text = stringResource(
                                    R.string.desempenho
                                ),
                                color = Color(0xFFFFFFFF),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Normal
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.SpaceEvenly,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            GraficoStudent()
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesScreenPreview() {
    StudentScreen()
}