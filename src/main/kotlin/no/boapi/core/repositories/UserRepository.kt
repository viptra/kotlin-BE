package no.boapi.core.repositories

import no.boapi.core.entities.Person
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : CrudRepository<Person, Int> {

    fun findByUserId(userID: Int): Person?{
        var userList = findAll()
        for(user in userList){
            if(user.userId == userID){
                return user
            }
        }
        return null
    }


}