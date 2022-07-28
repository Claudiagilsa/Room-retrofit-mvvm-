package com.example.simplerest.repository

import androidx.lifecycle.LiveData
import com.example.simplerest.datasource.RestDataSource
import com.example.simplerest.model.User
import com.example.simplerest.model.UserDao
import kotlinx.coroutines.delay
import javax.inject.Inject

interface UserRepository {

    suspend fun getNewUser():User
    suspend fun deleteUser(toDelete:User)
     fun getAll():LiveData<List<User>>


}

class UserRepositoryImp @Inject constructor(
    private val dataSource: RestDataSource,
    private val userDao: UserDao,

    ):UserRepository{
    //Llamamos a la api
    override suspend fun getNewUser():User {

        delay(5000)
        val name=dataSource.getUserName().result[0].name!!
        val location=dataSource.getUserLocation().result[0].location!!
        val picture=dataSource.getUserPicture().result[0].picture!!
        val user=User(name.fist,name.last,location.city,picture.thumbnail)

        userDao.insert(user)
        return user;
    }

    override suspend fun deleteUser(toDelete: User) =userDao.delete(toDelete)

    override fun getAll(): LiveData<List<User>> = userDao.getAll()


}