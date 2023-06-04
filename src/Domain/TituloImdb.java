package Domain;

import com.google.gson.annotations.SerializedName;
public class TituloImdb {
    @SerializedName("Title")
    public String title;
    @SerializedName("Year")
    public int year;
    @SerializedName("Rated")
    public String rated;
    public String released;
    public String director;
    public String runtime;
    public String genre;
    public String writer;
    //@JsonProperty("Actors")
    public String actors;
    //@JsonProperty("Plot")
    public String plot;
    //@JsonProperty("Language")
    public String language;
    //@JsonProperty("Country")
    public String country;
    //@JsonProperty("Awards")
    public String awards;
    //@JsonProperty("Poster")
    public String poster;
    //@JsonProperty("Ratings")
    //@JsonProperty("Metascore")
    public String metascore;
    public String imdbRating;
    public String imdbVotes;
    public String imdbID;
    //@JsonProperty("Type")
    public String type;
    public String totalSeasons;
    public String response;

    public TituloImdb(ImdbResponse meuTituloOmdb) {
        this.title = meuTituloOmdb.title();
        this.imdbID = meuTituloOmdb.imdbID();
        this.actors = meuTituloOmdb.actors();
        this.imdbVotes = meuTituloOmdb.imdbVotes();
        this.awards = meuTituloOmdb.awards();
        this.country = meuTituloOmdb.country();
        this.director = meuTituloOmdb.director();
        this.genre = meuTituloOmdb.genre();
        this.imdbRating = meuTituloOmdb.imdbRating();
        this.language = meuTituloOmdb.language();
        this.plot = meuTituloOmdb.plot();
        this.poster = meuTituloOmdb.poster();
        this.rated = meuTituloOmdb.rated();
        this.imdbID = meuTituloOmdb.imdbID();
        this.response = meuTituloOmdb.response();
        this.released = meuTituloOmdb.released();
        this.writer = meuTituloOmdb.writer();
        this.runtime = meuTituloOmdb.runtime();
        this.metascore = meuTituloOmdb.metascore();
        this.type = meuTituloOmdb.type();
        this.year = Integer.valueOf(meuTituloOmdb.year());
    }

    @Override
    public String toString() {
        return "TituloImdb{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", rated='" + rated + '\'' +
                ", released='" + released + '\'' +
                ", runtime='" + runtime + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", writer='" + writer + '\'' +
                ", actors='" + actors + '\'' +
                ", plot='" + plot + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                ", awards='" + awards + '\'' +
                ", poster='" + poster + '\'' +
                ", metascore='" + metascore + '\'' +
                ", imdbRating='" + imdbRating + '\'' +
                ", imdbVotes='" + imdbVotes + '\'' +
                ", imdbID='" + imdbID + '\'' +
                ", type='" + type + '\'' +
                ", totalSeasons='" + totalSeasons + '\'' +
                ", response='" + response + '\'' +
                '}';
    }

    //@JsonProperty("Response")
}
