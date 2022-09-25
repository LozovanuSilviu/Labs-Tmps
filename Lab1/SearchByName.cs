namespace Lab1;

public class SearchByName : IAlbumSearch
{
    static NameConstraint SearchConstraint { get; set; }
    Album Album { get; set; }
    
    public void Search()
    {
        var flag = false;
        var songs = Album.Songs;
        foreach (var song in songs)
        {
            if (song.Name.Equals(SearchConstraint.Name))
            {
                flag = true;
            }
        }

        if (flag)
        {
            Console.WriteLine($"Song with name {SearchConstraint.Name} was found, cool one btw"); 
        }
        else
        {
            Console.WriteLine( "Sorry such song does not exist");
        }
    }

    public SearchByName(NameConstraint constraint, Album album)
    {
        SearchConstraint = constraint;
        Album = album;
    }
 
}