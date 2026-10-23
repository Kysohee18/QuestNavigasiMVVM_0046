package com.example.activity5

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.activity5.view.FormIsian
import com.example.activity5.view.TampilData

enum class Navigasi {
    FormulirSaya,
    Detail
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
){
    Scaffold {isiRuang->
        NavHost(navController = navController,
            startDestination = Navigasi.FormulirSaya.name){
            FormIsian(
                //pilihanjk =jenisk.map { id -> context.resources.getString(id) }
                OnSubmitBtnClick = {
                    navController.navigate(Navigasi.Detail.name)
                }
            )
        }
        composable(route = Navigasi.Detail.name){
            TampilData(
                onBackBtnClick = {cancelAndBackToFormulirSaya(navController)}
            )
        }
}