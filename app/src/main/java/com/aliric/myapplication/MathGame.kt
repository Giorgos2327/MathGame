package com.aliric.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstPage(navController:NavController) {



    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Math Game",
                        fontSize = 25.sp
                    )
                }, colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.pink),
                    titleContentColor = Color.White
                )
            )
        }, content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)

                    .paint(painter = painterResource(id = R.drawable.mathgamesfirstimage), contentScale = ContentScale.FillBounds),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {
                    navController.navigate("SecondPage/add")
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.pink)
                    ),
                    modifier = Modifier.size(270.dp,60.dp),
                    shape = RoundedCornerShape(5.dp)

                )

                {
                    Text(
                        text = "ADDITION",
                        fontSize = 20.sp,
                        color = Color.White)

                }

                Spacer(modifier = Modifier.height(30.dp))


                Button(onClick = {
                    navController.navigate("SecondPage/sub")
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.pink)
                    ),
                    modifier = Modifier.size(270.dp,60.dp),
                    shape = RoundedCornerShape(5.dp)

                )

                {
                    Text(
                        text = "SUBTRACTION",
                        fontSize = 20.sp,
                        color = Color.White)

                }

                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {
                    navController.navigate("SecondPage/multi")
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.pink)
                    ),
                    modifier = Modifier.size(270.dp,60.dp),
                    shape = RoundedCornerShape(5.dp)

                )

                {
                    Text(
                        text = "MULTIPLICATION",
                        fontSize = 20.sp,
                        color = Color.White)

                }

                Spacer(modifier = Modifier.height(30.dp))

                Button(onClick = {
                    navController.navigate("SecondPage/div")
                },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.pink)
                    ),
                    modifier = Modifier.size(270.dp,60.dp),
                    shape = RoundedCornerShape(5.dp)

                )

                {
                    Text(
                        text = "DIVISION",
                        fontSize = 20.sp,
                        color = Color.White)

                }

            }

        }
    )


}