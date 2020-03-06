package fiix.interview.people.service;

import java.util.List;

import fiix.interview.people.models.People;
import retrofit2.Call;
import retrofit2.http.GET;

public interface PeopleService {
    @GET("?results=75&inc=name")
    Call<People> getRandomUsers();
}
