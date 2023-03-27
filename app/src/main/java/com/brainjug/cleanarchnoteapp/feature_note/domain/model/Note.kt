package com.brainjug.cleanarchnoteapp.feature_note.domain.model

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.brainjug.cleanarchnoteapp.R
import com.brainjug.cleanarchnoteapp.ui.theme.Purple200
import com.brainjug.cleanarchnoteapp.ui.theme.Teal200

@Entity
data class Note(
    val title: String,
    val content:String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey
    val id : Int? = null
){
    companion object{
        val noteColors = listOf(Color(R.color.mustered_yellow), Teal200, Color(R.color.baby_pink),Color(R.color.sea_shell),Color(R.color.celadon), Color(R.color.cream), Color(R.color.hot_pink),Color(R.color.white_dark))

    }
}

class InvalidNoteException(message: String): Exception(message)
