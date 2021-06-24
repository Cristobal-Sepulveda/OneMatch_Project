package com.example.android.onematchproject.data

import android.content.Context
import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO
import com.example.android.onematchproject.data.daos.FieldDao
import com.example.android.onematchproject.utils.EspressoIdlingResource.wrapEspressoIdlingResource
import com.example.android.onematchproject.utils.Result
import kotlinx.coroutines.*

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

}
