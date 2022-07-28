package com.example.simplerest.di

import android.content.Context
import androidx.room.Room
import com.example.simplerest.datasource.RestDataSource
import com.example.simplerest.datasource.dataSourceDB
import com.example.simplerest.model.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


//Inicializando el retrofit  con la url base del programa

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl()="https://randomuser.me/api/"


    //regresa una instancia de retrofit
    @Singleton
    @Provides
    fun provideRetrofit(@Named("BaseUrl")baseUrl:String):Retrofit{
       return Retrofit.Builder()
           .addConverterFactory(GsonConverterFactory.create())
           .baseUrl(baseUrl)
           .build()
    }

    //se instancia el datasource
    @Singleton
    @Provides
    fun restSataSource(retrofit: Retrofit): RestDataSource=
        retrofit.create(RestDataSource::class.java)

//llamamos la BD
    @Singleton
    @Provides
    fun dbDataSource(@ApplicationContext context: Context): dataSourceDB{

        return Room.databaseBuilder(context,dataSourceDB::class.java,"user_database")
            .fallbackToDestructiveMigration().build()
    }

    //onjectamos el objeto DAO

    @Singleton
    @Provides
    fun userDao(db: dataSourceDB): UserDao=db.userDao()

}