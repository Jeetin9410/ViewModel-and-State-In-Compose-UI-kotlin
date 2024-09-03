package com.example.unscramble.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.unscramble.ui.model.GameStateUi
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class GameViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(GameStateUi())

    var uiState : StateFlow<GameStateUi> = _uiState.asStateFlow()

    // Using Backing Property here

    /* Backing Property

    A backing property lets you return something from a getter other than the exact object.

    Example :

    private var _count = 0;

    val count: Int
    get() = _count;

    Inside the ViewModel class:

    The property _count is private and mutable.
    Hence, it is only accessible and editable within the ViewModel class.

    Outside the ViewModel class:

    The default visibility modifier in Kotlin is public,
    so count is public and accessible from other classes like UI controllers.
    A val type cannot have a setter.
    It is immutable and read-only so you can only override the get() method.
    When an outside class accesses this property, it returns the value of _count and its value can't be modified.
    This backing property protects the app data inside the ViewModel from unwanted and unsafe changes by external classes,
    but it lets external callers safely access its value.

     */

}