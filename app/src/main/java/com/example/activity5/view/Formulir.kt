package com.example.activity5.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun  FormIsian(jenisK:List<String> = listOf("Laki-laki", "Perempuan"),
    OnSubmitBtnClick:() -> Unit
){
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(stringResource(id=R.string.home), color = color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    colorResource(id = R.color.blue))
            )}
    ) {isiRuang ->
        Column (modifier= Modifier.padding(isiRuang),
            verticalArragement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(20.dp)
                    .width(250.dp),
                label ={Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier)
        }
    }
}
