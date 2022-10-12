package dev.cct.test_db_simple

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notesTable")
class Note(
    @ColumnInfo(name = "title") val noteTitle: String,
    @ColumnInfo(name = "description") val noteDescription: String,
    @ColumnInfo(name = "timestamp") val timeStamp: String,
    @ColumnInfo(name = "image_id") val image_id: String,
//    @ColumnInfo(name = "imageList") val imagesList: ArrayList<String>,
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0
}