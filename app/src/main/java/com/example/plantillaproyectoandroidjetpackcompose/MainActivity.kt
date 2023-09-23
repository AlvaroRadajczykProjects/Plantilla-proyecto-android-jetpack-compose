package com.example.plantillaproyectoandroidjetpackcompose

/*

    VIDEO NOTES:

    Allows live update, state into UI, so no need to do it yourself, and allows conditional statemets that change views without we need to create or destroy them manually
    \-> RECOMPOSING

    Intelligent recomposing, can change only elements which state has changed (.observeAsState()?)

    All composables are inmutable! Only pass references by arguments, and save data with internal variables

    Elements are controled by parameters they receive -> avoiding other states to be kept sync

    When one variable in composable changes, recomposing is done again. If we don't want to change all variables, we need to remember them, and mutableStateOf makes initial constant to be remembered when changed as a variable -> var selectAll by remember { mutableStateOf(false) }
    \-> Can be replaced by function parameters


*/