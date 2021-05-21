package com.example.android.onematchproject.data

import com.example.android.onematchproject.data.dbo.MatchDBO
import com.example.android.onematchproject.data.dbo.UserDBO
import com.example.android.onematchproject.data.local.AppDataSource
import com.example.android.onematchproject.data.local.MatchesDao
import com.example.android.onematchproject.data.local.UserDao
import com.example.android.onematchproject.utils.EspressoIdlingResource.wrapEspressoIdlingResource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import com.example.android.onematchproject.utils.Result
import com.google.firebase.firestore.GeoPoint
import org.koin.core.KoinComponent
import org.koin.core.inject

/**
 * Concrete implementation of a data source as a db.
 * The repository is implemented so that you can focus on only testing it.
 * @param matchesDao the dao that does the Room db operations
 * @param userDao the dao that does the Room db operations
 * @param ioDispatcher a coroutine dispatcher to offload the blocking IO tasks
 * */
class AppRepository(private val matchesDao: MatchesDao,
                    private val userDao: UserDao,
                    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO) : AppDataSource {

    override suspend fun getMatches(): Result<List<MatchDBO>> = withContext(ioDispatcher) {
        wrapEspressoIdlingResource {
            return@withContext try {
                Result.Success(matchesDao.getMatches())
            } catch (ex: Exception) {
                Result.Error(ex.localizedMessage)
            }
        }
    }

    override suspend fun getMatch(id: Long): Result<MatchDBO> = withContext(ioDispatcher) {
        wrapEspressoIdlingResource {
            try {
                val match = matchesDao.getMatchById(id)
                if (match != null) {
                    return@withContext Result.Success(match)
                } else {
                    return@withContext Result.Error("Match not found!")
                }
            } catch (e: Exception) {
                return@withContext Result.Error(e.localizedMessage)
            }
        }
    }

    override suspend fun saveMatch(match: MatchDBO) {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                matchesDao.saveMatchDBO(match)
            }
        }
    }

    override suspend fun deleteAllMatches() {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                matchesDao.deleteAllMatches()
            }
        }
    }

    override suspend fun getUser(id: Long): Result<UserDBO> = withContext(ioDispatcher){
        wrapEspressoIdlingResource {
            return@withContext try {
                Result.Success(userDao.getUser())
            } catch (ex: Exception) {
                Result.Error(ex.localizedMessage)
            }
        }
    }

    override suspend fun saveUser(user: UserDBO) {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                userDao.saveUserDBO(user)
            }
        }
    }

    override suspend fun deleteUser() {
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                userDao.deleteUser()
            }
        }
    }

    override suspend fun savingFieldsFromTheCloud(listOfFields: ArrayList<GeoPoint>){
        wrapEspressoIdlingResource {
            withContext(ioDispatcher) {
                matchesDao.saveMatchDBO()
            }
        }

    }


}
