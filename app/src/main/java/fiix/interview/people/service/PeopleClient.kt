package fiix.interview.people.service

import retrofit2.Retrofit

class PeopleClient {

    fun create(): PeopleService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://randomuser.me/api/")
            .build()

        return retrofit.create(PeopleService::class.java)

    }
}