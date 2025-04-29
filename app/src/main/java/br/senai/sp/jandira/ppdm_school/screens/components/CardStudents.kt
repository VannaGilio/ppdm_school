package br.senai.sp.jandira.ppdm_school.screens.components

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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
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
import br.senai.sp.jandira.ppdm_school.screens.CursesScreen

@Composable
fun CardStudents(
    iconStudent: Painter,
    nameStudent: String,
    iconRm: Painter,
    rmStudent: String,
    registration: String
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp),
    ) {
        Box(
            modifier = Modifier
                .background(Color(0xFF9FA9E1))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(15.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(0xFFFFC23D)
                    ),
                    shape = RoundedCornerShape(topStart = 6.dp, bottomStart = 6.dp)
                ) { }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = iconStudent,
                        contentDescription = "",
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = nameStudent,
                            color = Color(0xFFFFFFFF),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                        Row(
                            modifier = Modifier,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = iconRm,
                                contentDescription = "",
                                modifier = Modifier
                                    .size(15.dp)
                            )
                            Text(
                                modifier = Modifier
                                    .padding(horizontal = 5.dp),
                                text = rmStudent,
                                color = Color(0xFFFFFFFF),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Light
                            )
                        }
                    }
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.Bottom
            ) {
                Icon(
                    modifier = Modifier
                        .size(16.dp),
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "",
                    tint = Color(0xFFFFFFFF)
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 2.dp),
                    text = registration,
                    color = Color(0xFFFFC23D),
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesPreview() {
//    CardCurses()
}
