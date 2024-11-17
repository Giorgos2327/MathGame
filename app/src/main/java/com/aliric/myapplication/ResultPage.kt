package com.aliric.myapplication

import android.app.Activity
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ResultPage(navController: NavController ,score: Int) {


    val myContext= LocalContext.current as Activity

Scaffold(modifier = Modifier.fillMaxSize()) {innerPadding->



    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Congratulations",
            color = Color.Red,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Your score: $score", fontSize = 24.sp, color = Color.Red)

        Spacer(modifier = Modifier.height(50.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                navController.popBackStack(route = "MathGame",inclusive = false)


            }, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.white)
            ), shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, color = colorResource(id = R.color.blue)),
                modifier = Modifier.size(150.dp,60.dp)
            ) {
                Text(text = "Play Again", fontSize = 20.sp, color = colorResource(id = R.color.blue))
            }


            Button(onClick = {

                myContext.finish()

            }, colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.white)
            ), shape = RoundedCornerShape(10.dp),
                border = BorderStroke(2.dp, color = colorResource(id = R.color.blue)),
                modifier = Modifier.size(150.dp,60.dp)
            ) {
                Text(text = "Exit", fontSize = 20.sp, color = colorResource(id = R.color.blue))


            }

        }

    }
}

}
