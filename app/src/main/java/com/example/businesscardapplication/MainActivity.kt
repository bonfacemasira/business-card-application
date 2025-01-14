package com.example.businesscardapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapplication.ui.theme.BusinessCardApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    BusinessCard()
                }
            }
        }
    }
}



@Composable
fun BusinessCard(
    modifier: Modifier= Modifier,
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize().background(color = Color(0xFFE8FCD2))
    ) {
        Logo()
        Spacer(Modifier.height(100.dp))
        Contacts()
    }
}


@Composable
fun Logo(
    modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Image(
            painter = image,
            contentDescription = "Android Logo",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)
                .background(color = Color.Black)
        )
        Text(
            text = "Jennifer Doe",
            fontSize = 60.sp,
            textAlign = TextAlign.Center,
            color = Color.Black,
            fontWeight = FontWeight.Light
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84)
        )
    }

}

@Composable
fun Contacts(){
    ContactItem ()
}

@Composable
fun ContactItem(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier.padding(60.dp).fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
    ) {
        Row(modifier = Modifier.padding(top = 5.dp, bottom = 10.dp)) {
            Icon(
                Icons.Outlined.Call,
                contentDescription = "contact number",
                modifier = Modifier,
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "+254 (719) 588 168",
            )
        }
        Row(modifier = Modifier.padding(top = 5.dp, bottom = 10.dp)) {
            Icon(
                Icons.Outlined.Share,
                contentDescription = "contact number",
                modifier = Modifier
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "@AndroidDev"
            )
        }
        Row(modifier = Modifier.padding(top = 5.dp, bottom = 10.dp).fillMaxWidth()) {
            Icon(
                Icons.Outlined.MailOutline,
                contentDescription = "contact number",
                modifier = Modifier
            )
            Spacer(Modifier.width(20.dp))
            Text(
                text = "jane.doe@gmail.com"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardApplicationTheme {
        BusinessCard()
    }
}