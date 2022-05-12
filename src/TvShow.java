public class TvShow {
    String TvName;
    int numOfEpi;
    String genre;

    public TvShow(String TvName, int numOfEpi, String genre) {
        this.TvName = TvName;
        this.numOfEpi = numOfEpi;
        this.genre = genre;
    }
    public TvShow(String TvName, int numOfEpi) {
        this.TvName = TvName;
        this.numOfEpi = numOfEpi;
    }
    public TvShow (String TvName, String genre) {
        this.genre = genre;
        this.TvName = TvName;
    }
    public TvShow(String TvName) {
        this.TvName = TvName;
    }
    public TvShow(int numOfEpi){
        this.numOfEpi= numOfEpi;
    }
    public TvShow () {
    }
    public String getTvName() {
        return TvName;
    }
    public int getNumOfEpi() {
        return numOfEpi;
    }
    public String getGenre() {
        return genre;
    }
    public String toString() {
        return "The name of the show is " + getTvName() + " with " + getNumOfEpi() +
                " number of episodes. The genre is " + getGenre();
    }
}
