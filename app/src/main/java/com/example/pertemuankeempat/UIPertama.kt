package com.example.pertemuankeempat

import android.widget.Space
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuankeempat.ui.theme.Cinzel
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.draw.blur


@Composable
fun ActivitasPertama(modifier: Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(
                        Color.White.copy(alpha = 0.25f),
                        Color.Transparent
                    ),
                    radius = 600f
                )
            )
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .blur(10.dp) // efek blur lembut di background
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFEBEBEB), // abu muda di atas
                        Color(0xFFB0B0B0), // abu sedang
                        Color(0xFF8C8C8C)  // abu agak gelap di bawah
                    )
                )
            )
            .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(height = 25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                // shadow di luar card biar keliatan ngangkat
                .shadow(
                    elevation = 12.dp,
                    shape = RoundedCornerShape(16.dp),
                    clip = false
                )
                .padding(all = 12.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                focusedElevation = 12.dp
            ),
            // outline tipis biar classy
            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.08f))
        ){
            Row() {
                val gambar = painterResource(id = R.drawable.tewas_mengenaskan)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(size = 100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(width = 30.dp))
                Column() {
                    Text(
                        text = stringResource(id = R.string.nama),
                        fontSize = 30.sp,
                        fontFamily = Cinzel,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(top = 12.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat),
                        fontSize = 18.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}