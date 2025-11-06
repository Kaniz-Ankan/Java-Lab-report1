public class Movie {

     String title;
    String genre;
    String leadActor;
    String director;
     int releaseYear;
     double rating;
    String review;

    Movie(String title, String genre, String leadActor, String director,
                 int releaseYear, double rating) {

        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.review = (rating < 5) ? "Not Good" : "Good";
    }
    public void displayDetails() {

        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", "Sci-Fi", "Leonardo DiCaprio",
                "Christopher Nolan", 2010, 8.8);

        Movie movie2 = new Movie("The Room", "Drama", "Tommy Wiseau",
                "Tommy Wiseau", 2003, 3.7);

        movie1.displayDetails();
        movie2.displayDetails();
    }
}
