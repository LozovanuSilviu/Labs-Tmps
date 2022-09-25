namespace Lab1;

public class Song
{
    public int Duration { get; set; }
    public string Name { get; set; }
    public int Plays { get; set; }

    public Song(int duration, string name, int plays)
    {
        Duration = duration;
        Name = name;
        Plays = plays;
    }
}