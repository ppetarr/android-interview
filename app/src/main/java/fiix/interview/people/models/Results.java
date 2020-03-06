package fiix.interview.people.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {

    @SerializedName("results")
    @Expose
    Result results[];

    public void setResults(Result[] results) {
        this.results = results;
    }

    public Result[] getResults() {
        return results;
    }
}
