package com.cloby.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //Take care of all getter setter and string methods
@AllArgsConstructor //Creating and construct all private fields as arguments
@NoArgsConstructor //No parameters
public class Movie {
    @Id //UniqueID
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> backdrops;
    private List<String> genres;


    @DocumentReference  //Database store only the IDs' of the review and reviews goes to separate collection
    private List<Review> reviewIds; //Embeded relationship

}
