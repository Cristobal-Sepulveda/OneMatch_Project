package com.example.android.onematchproject.data

import android.content.Context
import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO
import com.example.android.onematchproject.data.daos.FieldDao
import com.example.android.onematchproject.data.network.TransBankApi
import com.example.android.onematchproject.data.network.TransBankApiService
import com.example.android.onematchproject.utils.EspressoIdlingResource.wrapEspressoIdlingResource
import com.example.android.onematchproject.utils.Result
import kotlinx.coroutines.*
import retrofit2.Call

class AppRepository(private val fieldDao: FieldDao,
                    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO): AppDataSource {

    override suspend fun savingFieldToLocalDatabase(field: FIELD_DBO) {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                fieldDao.saveField(field)
            }
        }
    }

    override suspend fun gettingFieldsFromDatabase(): List<FIELD_DBO> =  withContext(ioDispatcher){
        wrapEspressoIdlingResource {
            try {
                val list = Result.Success(fieldDao.getFields())
                return@withContext list.data
            } catch (ex: Exception) {
                val listError : List<FIELD_DBO> = listOf()
                Result.Error(ex.localizedMessage)
                return@withContext listError
            }
        }
    }

    override suspend fun deletingSavedFieldsInLocalDatabase() {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                fieldDao.deleteFields()
            }
        }
    }

    override suspend fun transBankApi(): Call<String> {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                val transbankApiResponse = TransBankApi.RETROFIT_SERVICE_TRANSBANK_API.getResponse(

                )
            }
        }
    }

}
