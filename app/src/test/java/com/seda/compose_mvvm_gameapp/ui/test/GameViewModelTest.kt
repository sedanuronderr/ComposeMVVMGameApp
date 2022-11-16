package com.seda.compose_mvvm_gameapp.ui.test

import com.seda.compose_mvvm_gameapp.gameviewmodel.GameViewModel
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertFalse
import org.junit.Test

class GameViewModelTest {
    private val viewModel = GameViewModel()
    @Test
    fun gameViewModel_CorrectWordGuessed_ScoreUpdatedAndErrorFlagUnset()  {
        var currentGameUiState = viewModel.uiState.value
        val correctPlayerWord = getUnscrambledWord(currentGameUiState.currentScrambledWord)
     viewModel.updateUserGuess(correctPlayerWord)
        viewModel.checkUserGuess()
        currentGameUiState = viewModel.uiState.value
        assertFalse(currentGameUiState.isGuessedWordWrong)

        assertEquals(20,currentGameUiState.score)

    }

    private fun getUnscrambledWord(currentScrambledWord: String) {

    }
}