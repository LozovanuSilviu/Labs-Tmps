namespace Lab1;

public class Album
{
    public static int NumberOfSongs  { get; set; }
    public static string Author { get; set; }
    public static List<Song> Songs { get; set; }
    public string Name { get; set; }

    public Album(string name)
    {
        Name = name;
    }

    public static Album AlbumNamed(string name)
    {
        var album= new  Album(name);
        return album;
    }

    public Album CreatedBy(string AuthorName)
    {
        Author = AuthorName;
        return this;
    }

    public Album ContainingSongs(List<Song> songs)
    {
        Songs = songs;
        NumberOfSongs = Songs.Count;
        return this;
    }

    public void AddSong(Song song)
    {
        Songs.Add(song);
        Console.WriteLine($"Song named {song.Name} was added to album");
    }

    public void RemoveSong(Song song)
    {
        Songs.Remove(song);
        Console.WriteLine($"Song named {song.Name} was removed from album");
    }
    
}