package com.seda.compose_mvvm_gameapp.data

data class GameUiState(val currentScrambledWord: String = "",
                       val currentWordCount: Int = 0,
                       val score: Int = 0,
                       val isGuessedWordWrong: Boolean = false,
                       val isGameOver: Boolean = false) {
}