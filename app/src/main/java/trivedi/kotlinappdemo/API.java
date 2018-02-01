package trivedi.kotlinappdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by TI A1 on 27-11-2017.
 */

public interface API {

    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Call<List<DataClassHero>> getHeroes();

}
