package br.senai.sp.jandira.ppdm_school.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.ppdm_school.R
import br.senai.sp.jandira.ppdm_school.screens.components.CardCurses
import br.senai.sp.jandira.ppdm_school.screens.components.CardStudents

@Composable
fun StudentsScreen (){
    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp)
                .background(Color(0xFFFFFFFF)),
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
            ){
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
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(
                        text = stringResource(
                            R.string.input_curse
                        ),
                        color = Color(0xFF8F9194),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Light
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 5.dp),
                shape = RoundedCornerShape(8.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(0xFF8F9194)
                    )
                }
            )
            Row (
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(
                        R.drawable.list
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(40.dp)
                )
                Text(
                    text = stringResource(
                        R.string.list_curses
                    ),
                    color = Color(0xFF3347B0),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            CardStudents(
                iconStudent = painterResource(R.drawable.pessoa1),
                nameStudent = stringResource(R.string.nome_1),
                iconRm = painterResource(R.drawable.rm),
                rmStudent = stringResource(R.string.rm_1),
                registration= stringResource((R.string.registration_1))
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CursesScreenPreview() {
    StudentsScreen()
}