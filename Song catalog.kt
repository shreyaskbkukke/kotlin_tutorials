class Song(
	val title: String,
    val artist: String,
    val yearOfPublish: Int,
    val playCount: Int
) {
    val isPopular: Boolean
     get() = playCount >= 1000
    
    fun printDescription() {
        println("$title, performed by $artist, was released in $yearOfPublish.")
    }
}

fun main() {
    val song = Song("Shape of You", "Ed Sheeran", 2017, 1500)
    song.printDescription()
    println("Is the song popular? ${if(song.isPopular) "Yes" else "No"}.")
}
