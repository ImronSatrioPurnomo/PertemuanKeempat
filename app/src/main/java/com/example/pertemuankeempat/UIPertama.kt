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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.zIndex


@Composable
fun ActivitasPertama(modifier: Modifier) {
    // Layer 1: background gradient
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFEBEBEB),
                        Color(0xFFB0B0B0),
                        Color(0xFF8C8C8C)
                    )
                )
            )
    )

    // Layer 2: soft glow (blurred radial light)
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
            .blur(40.dp) // blur cahaya, bukan kontennya
    )

    // Layer 3: konten utama (tanpa blur)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp)
            .zIndex(1f), // pastikan di atas glow
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.prodi),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.height(height = 25.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .clip(RoundedCornerShape(16.dp))
                .shadow(12.dp, RoundedCornerShape(16.dp), clip = false)
                .padding(12.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp,
                pressedElevation = 2.dp,
                focusedElevation = 12.dp
            ),
            border = BorderStroke(1.dp, Color.White.copy(alpha = 0.08f))
        ) {
            // ⬇️ Gradient harus mengisi seluruh area Card
            Box(
                modifier = Modifier
                    .fillMaxWidth()               // penting: penuhin lebar
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF0D1B2A), // navy gelap
                                Color(0xFF1B263B),
                                Color(0xFF415A77)  // aksen
                            )
                        )
                    )
                    .clip(RoundedCornerShape(16.dp)) // biar gradient ikut rounded
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()            // penuhin lebar juga
                        .padding(8.dp),            // padding pindah ke sini
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val gambar = painterResource(id = R.drawable.tewas_mengenaskan)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column {
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
                            color = Color(0xFFFFD700), // gold elegan
                            modifier = Modifier.padding(top = 10.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
           //card biru
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF0B2A4A),
                                Color(0xFF123A63),
                                Color(0xFF2E5E8A)
                            )
                        )
                    )
                    .padding(8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val logoBlue = painterResource(id = R.drawable.tewas_mengenaskan)
                    Image(
                        painter = logoBlue,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama_biru),
                            fontSize = 26.sp,
                            fontFamily = Cinzel,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.nim_biru),
                            fontSize = 16.sp,
                            color = Color.White,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.alamat_biru),
                            fontSize = 16.sp,
                            color = Color(0xFFFFD700)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            //card merah
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(16.dp))
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF7A1111),
                                Color(0xFFA4161A),
                                Color(0xFFD7263D)
                            )
                        )
                    )
                    .padding(8.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    val logoRed = painterResource(id = R.drawable.tewas_mengenaskan)
                    Image(
                        painter = logoRed,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(24.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama_merah),
                            fontSize = 26.sp,
                            fontFamily = Cinzel,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = stringResource(id = R.string.nim_merah),
                            fontSize = 16.sp,
                            color = Color.White,
                            modifier = Modifier.padding(top = 6.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.alamat_merah),
                            fontSize = 16.sp,
                            color = Color(0xFFFFD700)
                        )
                    }
                }
            }
        }




        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = stringResource(id = R.string.copy),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 50.dp)
            )
        }
    }
}
