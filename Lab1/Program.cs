
namespace Lab1;

public static class Program
{
    public static void Main(string[] args)
    {
        var song1 = new Song(183, "Diamond", 20000000);
        var song2 = new Song(156, "Not Afraid", 15000000);
        var album1 = Album.AlbumNamed("99deCumatri").ContainingSongs(new List<Song>() {song1, song2})
            .CreatedBy("Rihanna");

        var nameOfSong = new NameConstraint("Diamond");
        var durationOfSong = new DurationConstraint(156);
            
        new SearchByName(nameOfSong,album1).Search();
        new SearchByDuration(durationOfSong, album1).Search();
    }
}