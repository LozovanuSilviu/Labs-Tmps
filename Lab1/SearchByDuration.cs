namespace Lab1;

public class SearchByDuration :IAlbumSearch
{
    DurationConstraint SearchConstraint { get; set; }
    Album Album { get; set; }
    
    public SearchByDuration(DurationConstraint constraint, Album album)
    {
        SearchConstraint = constraint;
        Album = album;
    }


    public void Search()
    {
        var count = 0;
        var songs = Album.Songs;
        foreach (var song in songs)
        {
            if (song.Duration.Equals(SearchConstraint.Duration))
            {
                count++;
            }
        }
        
        if (count ==1)
        {
            Console.WriteLine($"One song with duration {SearchConstraint.Duration} was found");
        }
        else if (count >1)
        {
            Console.WriteLine($"There are {count} songs with  duration {SearchConstraint.Duration}");
        }
        else
        {
            Console.WriteLine("Sorry such song does not exist");
        }
    }
}